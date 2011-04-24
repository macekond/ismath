package cz.cvut.fel.malekji3.sw.bank;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

class Bank
{
    private final static int LENGTH = 9;
    private static Bank instance;
    
    private HashMap<String, Account> accounts = new HashMap<String, Account>();

    private Bank() {}

    public static Bank getBank()
    {
        if(Bank.instance == null)
            Bank.instance = new Bank();

        return Bank.instance;
    }

    private static String generateAccountNumber()
    {
        String number = "";

        for(int i = 1; i <= Bank.LENGTH; i++)
            number += String.valueOf((int)(Math.random() * 10));

        return number;
    }

    public Account createAccount()
    {
        String number;

        do number = Bank.generateAccountNumber();
        while(this.accounts.containsKey(number));
        
        Account newAccount = new Account(number);
        this.accounts.put(number, newAccount);

        return newAccount;
    }

    public Account lookupAccount(String number)
    {
        if(this.accounts.containsKey(number))
            return this.accounts.get(number);

        return null;
    }

    public String toString()
    {
        String string = "Accounts:";
        Iterator it = this.accounts.entrySet().iterator();
        while(it.hasNext())
        {
            Map.Entry pairs = (Map.Entry)it.next();
            string += "\r\n" + pairs.getValue();
        }
        return string;
    }
}
