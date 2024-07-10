package Sekcja_21_Klasy_abstrakcyjne_interfejsy_i_inne.Interfejs;

public class MojaKlasaTestowa implements PrzykladowyInterface // Po przecinku można dziedziczyć po wielu interface'ach
{

    @Override
    public void metodaWInterface() {
        System.out.println("Wypisz na ekran");
    }

    @Override
    public int metodaZParametremWInterfejsie(String z) {
        System.out.println("Wpypisz parametr: " + z);
        return 1;
    }
}
