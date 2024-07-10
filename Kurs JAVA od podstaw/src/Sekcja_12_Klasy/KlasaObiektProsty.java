package Sekcja_12_Klasy;

public class KlasaObiektProsty
{
    public static void main(String[] args)
    {
        Przyklad obiekt1 = new Przyklad();
        Przyklad obiekt2 = new Przyklad();

        obiekt1.pole = 123; // Dwie różne instancje istniejące w pamięci dają dwie różne wartości tego samego pola
        obiekt2.pole = 333; // dla różnych obiektów

        System.out.println("Pole dla obiekt1 = " + obiekt1.pole);
        System.out.println("Pole dla obiekt2 = " + obiekt2.pole);

        obiekt1.wypiszLiczbe(obiekt1.pole);
    }
}
