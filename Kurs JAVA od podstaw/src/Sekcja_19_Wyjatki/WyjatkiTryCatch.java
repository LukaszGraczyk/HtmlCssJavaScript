package Sekcja_19_Wyjatki;

public class WyjatkiTryCatch
{
    static String str;
    public static void main(String[] args)
    {
        // Exception
        try
        {
            str.isEmpty(); // Metoda isEmpty wygeneruje błąd jeżeli nie zastosujemy try/catch ponieważ String str nie zawiera niczego
        }
        catch(NullPointerException exception) // Tu wklejamy rodzaj błędu, zamist exception może być dowolna nazwa zmiennej
        {
            System.out.println("Nie utworzyłeś stringa");
        }

        System.out.println("Na koniec programu wypisz to coś");
    }
}
