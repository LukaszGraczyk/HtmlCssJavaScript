package Sekcja_17_Klasy_i_dziedziczenie.Przeslanianie_metod;

public class MainPrzeslanianieMetod
{
    public static void main(String[] args)
    {
        // Override
        KlasaPodstawowa klasaPodstawowa = new KlasaPodstawowa();
        KlasaRozszerzona klasaRozszerzona = new KlasaRozszerzona();

        klasaPodstawowa.metoda();
        klasaRozszerzona.metoda();
    }
}
