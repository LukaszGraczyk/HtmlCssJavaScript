package Sekcja_17_Klasy_i_dziedziczenie.Dziedziczenie;

public class MainDziedziczenie
{
    public static void main(String[] args)
    {
        // Inheritance

        KlasaPodstawowa klasaPodstawowa = new KlasaPodstawowa();
        KlasaRozszerzona klasaRozszerzona = new KlasaRozszerzona();
        KlasaBardziejRozszerzona klasaBardziejRozszerzona = new KlasaBardziejRozszerzona();

        klasaPodstawowa.metodaPierwsza();
        klasaRozszerzona.metodaPierwsza();
        klasaRozszerzona.metodaRozszerzona();
        klasaBardziejRozszerzona.metodaDruga();
    }
}
