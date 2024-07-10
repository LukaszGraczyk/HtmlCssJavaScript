package Sekcja_18_Klasy_i_dziedziczenie_zadanie.Zadanie_dziedziczenie;

public class Osoba
{
    protected String imie;
    protected String nazwisko;

    public Osoba(String imie, String nazwisko)
    {
        this.imie = imie;
        this.nazwisko = nazwisko;
    }

    public void przedstawSie()
    {
        System.out.println("Jestem " + imie + " " + nazwisko);
    }
}
