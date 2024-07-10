package Sekcja_21_Klasy_abstrakcyjne_interfejsy_i_inne.Klasa_abstrakcyjna.Ssak;

public class MainZwierzeta
{
    public static void main(String[] args)
    {
        KlasaZwyklaKot klasaZwyklaKot = new KlasaZwyklaKot();
        KlasaZwyklaPies klasaZwyklaPies = new KlasaZwyklaPies();

        klasaZwyklaKot.iloscKonczyn();
        klasaZwyklaKot.pokarmPoUrodzeniu();
        klasaZwyklaKot.odglos();

        System.out.println();

        klasaZwyklaPies.iloscKonczyn();
        klasaZwyklaPies.pokarmPoUrodzeniu();
        klasaZwyklaPies.odglos();
    }
}
