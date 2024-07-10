package Sekcja_21_Klasy_abstrakcyjne_interfejsy_i_inne.Klasa_abstrakcyjna;

public abstract class PrzykladowaKlasaAbstrakcyjna
{
    public void jakasMetoda()
    {
        System.out.println("Coś na ekran ");
    }

    public abstract void metodaAbstrakcyjna(); // Metoda abstrakcyjna przesłonięta w klasie zwykłej
    protected abstract int metodaAbstrakcyjnaZParametrem(String z); // Metoda abstrakcyjna przesłonięta w klasie zwykłej

}
