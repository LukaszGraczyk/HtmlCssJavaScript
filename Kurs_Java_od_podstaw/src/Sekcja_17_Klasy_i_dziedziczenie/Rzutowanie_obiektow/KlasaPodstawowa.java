package Sekcja_17_Klasy_i_dziedziczenie.Rzutowanie_obiektow;

public class KlasaPodstawowa
{
    private int liczba;

    public void ustawLiczba(int liczba)
    {
        this.liczba = liczba;
    }

    public void wyswietlLiczba()
    {
        System.out.println("Liczba: " + liczba);
    }
}
