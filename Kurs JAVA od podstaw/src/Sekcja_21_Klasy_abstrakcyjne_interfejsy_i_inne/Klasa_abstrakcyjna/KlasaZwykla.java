package Sekcja_21_Klasy_abstrakcyjne_interfejsy_i_inne.Klasa_abstrakcyjna;

public class KlasaZwykla extends PrzykladowaKlasaAbstrakcyjna
{
    public void metodaAbstrakcyjna()
    {
        System.out.println("Metoda Abstrakcyjna"); // Metoda przesłaniająca metodę abstrakcyjną w klasie abstrakcyjnej
    }
    protected int metodaAbstrakcyjnaZParametrem(String z) // Metoda przesłaniająca metodę abstrakcyjną w klasie abstrakcyjnej
    {
        System.out.println(z);
        return 101;
    }
}
