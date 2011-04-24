package cz.cvut.fel.malekji3.sw.bank;

interface IDebug
{
    static final boolean DEVELOPMENT = true;
    static final boolean PRODUCTION = false;

    void print(String message);
}

class Debug implements IDebug
{
    public void print(String message)
    {
        System.out.println(message);
    }
}

class NullDebug implements IDebug
{
    public void print(String message) {}
}
