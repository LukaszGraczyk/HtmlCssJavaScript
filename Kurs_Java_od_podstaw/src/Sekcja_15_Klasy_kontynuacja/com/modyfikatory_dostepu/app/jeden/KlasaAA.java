package Sekcja_15_Klasy_kontynuacja.com.modyfikatory_dostepu.app.jeden;

public class KlasaAA // Jeżeli dla klasy nie użyjemy modyfikatora public to będzie dostępna tylko w tym samym package'u
{
    // Różne typy modyfikatorów dla pól
    public int polePubliczne; // Dostępne wszędzie
    protected int poleChronione; // Dostępne w dziedziczeniu oraz w tym samym package'u
    private int polePrywatne; // Dostępne w obrębie tej klasy
    int poleBezModyfikatoraDostepu; // Dostępne w tym samym package'u


    // Różne typy modyfikatorów dla metod
    public void metodaPubliczna() // Dostępna wszędzie
    {

    }

    protected void metodaChroniona() // Dostępna w dziedziczeniu oraz w tym samym package'u
    {

    }

    private void metodaPrywatna() // Dostępna w obrębie tej klasy
    {

    }

    void metodaBezNiczego() // Dostępna w tym samym package'u
    {
        
    }
}
