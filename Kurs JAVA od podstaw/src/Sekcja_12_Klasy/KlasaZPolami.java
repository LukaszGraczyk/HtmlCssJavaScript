package Sekcja_12_Klasy;

public class KlasaZPolami
{
    static int liczbaCalkowita; // I

    void zwrocwartoscpola() // II
    {
        System.out.println("Zwrócona wartość pola to: " + liczbaCalkowita);
    }

    void ustawWartosc(int wartosc) // III
    {
        liczbaCalkowita = wartosc;
    }

    int zwrocWartoscPolaZMetody()
    {
        return liczbaCalkowita; // IV
    }
}
