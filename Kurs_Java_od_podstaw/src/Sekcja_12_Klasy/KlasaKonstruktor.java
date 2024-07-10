package Sekcja_12_Klasy;

public class KlasaKonstruktor
{
    int pierwszePole;
    int drugiePole;

    KlasaKonstruktor()
    {
        pierwszePole = 111;
        drugiePole = 222;
    }

    KlasaKonstruktor(int wartoscPierwsza) // Konstruktor z jednym parametrem
    {
        pierwszePole = wartoscPierwsza;
        drugiePole = 1000;
    }

    KlasaKonstruktor(int wartoscPierwsza, int wartoscDruga) // Konstruktor z dwoma parametrami
    {
        pierwszePole = wartoscPierwsza;
        drugiePole = wartoscDruga;
    }
}
