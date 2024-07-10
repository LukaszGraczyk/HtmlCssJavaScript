package Sekcja_12_Klasy;

public class MainPola
{
    public static void main(String[] args)
    {
        // Fields

        KlasaZPolami obiekt = new KlasaZPolami();
        obiekt.liczbaCalkowita = 15;                    // I
        System.out.println(obiekt.liczbaCalkowita);     // I

        obiekt.zwrocwartoscpola();                      // II

        obiekt.ustawWartosc(500);                       // III
        obiekt.zwrocwartoscpola();                      // III

        obiekt.ustawWartosc(202);                       // IV
        int zmienna = obiekt.zwrocWartoscPolaZMetody(); // IV
        System.out.println("Zmienna: " + zmienna);      // IV
    }
}
