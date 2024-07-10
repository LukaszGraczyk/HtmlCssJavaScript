package Sekcja_15_Klasy_kontynuacja;

public class MainPolaStaticFinal
{
    public static void main(String[] args)
    {
        KlasaStaticFinal obiekt = new KlasaStaticFinal();
        obiekt.pole = 10;

        KlasaStaticFinal.poleStatic = 15; // Dla pola static nie trzeba odwoływać się do niego poprzez obiekt.
        obiekt.poleStatic = 123;

        System.out.println("KlasaStaticFinal.poleStatic: " + KlasaStaticFinal.poleStatic);

        KlasaStaticFinal.metodaStatyczna(); // Metoda statyczna

        System.out.println(KlasaStaticFinal.JAKIS_TEKST); // Wypisanie pola string statycznego będącego również final
    }
}
