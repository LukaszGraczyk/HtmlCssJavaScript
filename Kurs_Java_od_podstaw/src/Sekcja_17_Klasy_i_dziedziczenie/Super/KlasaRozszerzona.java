package Sekcja_17_Klasy_i_dziedziczenie.Super;

public class KlasaRozszerzona extends KlasaPodstawowa
{
    @Override
    void metoda()
    {
        System.out.println("Metoda z klasy rozszerzonej");
        super.metoda(); // Super umożliwia odniesienie się do metody z klasy podstawowej z której dziedziczy klasa rozszerzona
                        // w ten sposób że nie jest problemem że metody w obu tych klasach mają taką samą nazwę i jedna przesłania drugą
    }
}
