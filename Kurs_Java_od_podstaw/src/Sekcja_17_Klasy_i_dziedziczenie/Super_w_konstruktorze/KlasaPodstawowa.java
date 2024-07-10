package Sekcja_17_Klasy_i_dziedziczenie.Super_w_konstruktorze;

public class KlasaPodstawowa
{
    KlasaPodstawowa()
    {
        System.out.println("Wywołałem konstruktor z klasa podstawowa");
    }

    KlasaPodstawowa(int a)
    {
        System.out.println("Wywołałem konstruktor z klasa podstawowa z argumentem: " + a);
    }
}
