package cz.cvut.fel.malekji3.sw.bank;

class Account
{
    public final static int NORMAL = 0;
    public final static int BELLOW_BALANCE = 1;
    public final static int CLOSED = 9;

    private final static int LIMIT = 1000;

    private int balance;
    private int state;
    private final String number;
    private final IDebug debug;

    public Account(String number)
    {
        this.number = number;
        this.state = Account.BELLOW_BALANCE;
        this.balance = 0;
        debug = (Test.MODE == IDebug.DEVELOPMENT) ? new Debug() : new NullDebug();
        debug.print("Vytvářím účet #"+ this.number +" s výchozím stavem BELLOW BALANCE.");
    }

    public String getNumber()
    {
        return this.number;
    }

    public int getBalance()
    {
        return this.balance;
    }

    public void deposit(int howMuch) throws AccountException, IllegalArgumentException
    {
        debug.print("Zkouším na účet #"+ this.number +" vložit "+ howMuch +".");

        if(howMuch < 1)
            throw new IllegalArgumentException("You cannot deposit less money than 1."); // (to psal robot?)

        if(this.state == Account.CLOSED)
            throw new AccountException("Account is closed. You cannot deposit any money.");

        this.balance += howMuch;
        debug.print("Vkládám na účet #"+ this.number +" "+ howMuch +".");

        if(this.state == Account.BELLOW_BALANCE && this.balance >= Account.LIMIT)
        {
            this.state = Account.NORMAL;
            debug.print("Stav účtu #"+ this.number +" změněn na NORMAL.");
        }
    }

    public void withdraw(int howMuch) throws AccountException, IllegalArgumentException
    {
        debug.print("Zkouším z účtu #"+ this.number +" vybrat "+ howMuch +".");

        if(howMuch < 1)
            throw new IllegalArgumentException("You cannot withdraw less money that 1."); // (haha)

        if(this.state == Account.CLOSED)
            throw new AccountException("Account is closed. You cannot withdraw any money.");

        if(this.state == Account.BELLOW_BALANCE)
            throw new AccountException("You cannot withdraw any money. You are bellow balance.");

        if((this.balance - howMuch) < Account.LIMIT)
            throw new AccountException("You cannot withdraw this much.");

        this.balance -= howMuch;
        debug.print("Vybírám z účtu #"+ this.number +" "+ howMuch +".");
    }

    public void transfer(int howMuch, Account target) throws AccountException, IllegalArgumentException
    {
        debug.print("Zkouším z účtu #"+ this.number +" přeposlat "+ howMuch +" na účet #"+ target.getNumber() +".");

        this.withdraw(howMuch);

        try
        {
            target.deposit(howMuch);
        }
        catch(AccountException e)   // Může dojít pouze k AccountException().
        {                           // Kdyby byla hodnota záporná, vyjímka by se vyhodila na řádku 68.
            this.deposit(howMuch);
            throw new AccountException(e.getMessage());
        }
    }

    public void closeAccount()
    {
        this.state = Account.CLOSED;
        debug.print("Stav účtu #"+ this.number +" změněn na CLOSED.");
    }

    public String toString()
    {
        return "#"+ this.number +" : balance = "+ this.balance;
    }
}
