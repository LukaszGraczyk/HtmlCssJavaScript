package Sekcja_3_Zmienne;

public class Typy_proste_wartosci_domyslne
{
    public static int domyslnyInt;
    public static float domyslnyFloat;
    public static boolean domyslnyBoolean;
    public static char domyslnyChar;

    public static void main(String[] args)
    {
        /*
        byte        0
        short       0
        int         0
        long        0
        float       0.0f
        double      0.0
        char        '\u0000'
        boolean     false
         */

        System.out.println("Domyslny int: " + domyslnyInt);
        System.out.println("Domyslny float: " + domyslnyFloat);
        System.out.println("Domyslny boolean: " + domyslnyBoolean);
        System.out.println("Domyslny char: " + domyslnyChar);
    }
}
