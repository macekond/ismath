package cz.cvut.fel.archval.string_literal_invalid;

/**
 * String literal invalid.
 */
public class App 
{
    public static void main()
    {
        // This shouldn't be violation of LoD, but the tool for now just
        // searches for real constructor call (new...)
        String string = "string";
    }
}
