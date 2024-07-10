package Sekcja_21_Klasy_abstrakcyjne_interfejsy_i_inne.Klasa_abstrakcyjna.Ssak;

public abstract class KlasaAbstrakcyjnaSsaki
{
    protected void iloscKonczyn()
    {
        System.out.println("Ilość kończyn: 4");
    }
    protected void pokarmPoUrodzeniu()
    {
        System.out.println("Pokarm po urodzeniu: mleko");
    }
    protected abstract void odglos();
}
