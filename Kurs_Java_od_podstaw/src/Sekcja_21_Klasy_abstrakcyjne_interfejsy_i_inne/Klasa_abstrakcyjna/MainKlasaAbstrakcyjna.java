package Sekcja_21_Klasy_abstrakcyjne_interfejsy_i_inne.Klasa_abstrakcyjna;

public class MainKlasaAbstrakcyjna
{
    public static void main(String[] args)
    {
        // Abstract class

        KlasaZwykla klasaZwykla = new KlasaZwykla();
        klasaZwykla.jakasMetoda();
        klasaZwykla.metodaAbstrakcyjna();
        klasaZwykla.metodaAbstrakcyjnaZParametrem("Metoda Abstrakcyjna z parametrem");
    }
}
