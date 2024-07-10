package Sekcja_17_Klasy_i_dziedziczenie.Super_w_konstruktorze;

public class MainSuperKonstruktor
{
    public static  void main(String[] args)
    {
        KlasaRozszerzona klasaRozszerzona = new KlasaRozszerzona();
    }
}

// Na początku konstruktor klasy pochodnej wywołuje konstruktor klasy bazowej dopiero potem wywoływany jest konstruktor klasy pochodnej