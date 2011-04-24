package cz.cvut.fel.malekji3.sw.bank;

class Test
{
    //public final static boolean MODE = IDebug.DEVELOPMENT;
    public final static boolean MODE = IDebug.PRODUCTION;

    public static void main(String[] args) throws Exception
    {
        Bank b1 = Bank.getBank();
        Account a1 = b1.createAccount();
        Account a2 = b1.createAccount();
        Account a3 = b1.createAccount();
        Account a4 = b1.createAccount();
        Account a5 = b1.createAccount();
        Account a6 = b1.createAccount();
        Account a7 = b1.createAccount();
        
        System.out.println("\r\n"+b1+"\r\n");

        Thread.sleep(5);

        try
        {
            a1.deposit(999);
            a1.deposit(2);
            a1.withdraw(500);
        }
        catch(Exception e)
        {
            Thread.sleep(5);
            System.err.println(e.getMessage());
        }
        
        try
        {
            a2.deposit(-2);
        }
        catch(Exception e)
        {
            Thread.sleep(5);
            System.err.println(e.getMessage());
        }

        try
        {
            a3.deposit(2000);
            a3.withdraw(-2);
        }
        catch(Exception e)
        {
            Thread.sleep(5);
            System.err.println(e.getMessage());
        }

        try
        {
            a4.closeAccount();
            a4.withdraw(1000);
        }
        catch(Exception e)
        {
            Thread.sleep(5);
            System.err.println(e.getMessage());
        }

        try
        {
            a5.closeAccount();
            a5.deposit(1000);
        }
        catch(Exception e)
        {
            Thread.sleep(5);
            System.err.println(e.getMessage());
        }

        try
        {
            a7.closeAccount();
            a6.deposit(1100);
            a6.transfer(100, a7);
            a7.withdraw(2);
        }
        catch(Exception e)
        {
            Thread.sleep(5);
            System.err.println(e.getMessage());
        }
    }
}
