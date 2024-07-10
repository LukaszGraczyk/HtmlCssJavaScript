package Sekcja_17_Klasy_i_dziedziczenie.Super_w_konstruktorze;

public class KlasaRozszerzona extends KlasaPodstawowa
{
    KlasaRozszerzona()
    {
        super(100); // To wyrażenie musi być na początku  konstruktora, odnosi się do konstruktora z klasy bazowej
        System.out.println("Wywołałem konstruktor z klasa rozszerzona");
    }
}

// Polecenie super z nawiasami pozwala odnieść się do konstruktora klasy bazowej