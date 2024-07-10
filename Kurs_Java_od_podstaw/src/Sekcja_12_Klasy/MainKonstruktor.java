package Sekcja_12_Klasy;
public class MainKonstruktor
{
    public static void main(String[] args)
    {
        KlasaKonstruktor obiekt1 = new KlasaKonstruktor(200);
        System.out.println(obiekt1.pierwszePole);
        System.out.println(obiekt1.drugiePole);

        KlasaKonstruktor obiekt2 = new KlasaKonstruktor(200, 123);
        System.out.println(obiekt2.pierwszePole);
        System.out.println(obiekt2.drugiePole);

        KlasaKonstruktor obiekt3 = new KlasaKonstruktor();
        System.out.println(obiekt3.pierwszePole);
        System.out.println(obiekt3.drugiePole);
    }
}


