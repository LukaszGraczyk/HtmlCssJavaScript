package Sekcja_17_Klasy_i_dziedziczenie.This;

public class KlasaRozszerzona extends KlasaPodstawowa
{
    int x;
    int y;
    int z;


    KlasaRozszerzona() // Konstruktor pusty
    {
        System.out.println("Konstruktor 1 z klasa rozszerzona");
    }

    KlasaRozszerzona(int a) // Drugi konstruktor
    {
        x = a;
        System.out.println("Konstruktor 2 z klasa rozszerzona z parametrem: " + x);
    }

    KlasaRozszerzona(int y, int z) // Trzeci konstruktor
    {
        this.y = y;
        this.z = z;
        System.out.println("Konstruktor 3 z klasa rozszerzona z parametrami: " + y + " oraz " + z);
    }
}
