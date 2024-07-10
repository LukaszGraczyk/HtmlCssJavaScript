package Sekcja_19_Wyjatki;

public class WyjatkiFinally
{
    static String str;
    public static void main(String[] args)
    {
        try
        {
            System.out.println("Wszystko wielką literą: " + str.toUpperCase());
        }
        catch(NullPointerException wyjatek)
        {
            System.out.println("Wystąpił Null");
        }
        finally // Polecenie to umożliwia wykonanie kody niezależnie czy wystąpi wyjątek
        {
            System.out.println("Wykonam się zawsze niezależnie czy wystąpi wyjątek");
        }

    }
}

// Fragment kodu wewnątrz nawiasów polecenia finally wykona się zawsze niezależnie czy zastosujemy try/catch
// Nawet jak pojawi się po uruchomieniu programu błąd dotyczący wyjątku to kod wewnątrz finally się wykona