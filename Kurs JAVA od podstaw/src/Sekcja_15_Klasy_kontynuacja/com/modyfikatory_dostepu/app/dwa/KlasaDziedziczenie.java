package Sekcja_15_Klasy_kontynuacja.com.modyfikatory_dostepu.app.dwa;

import Sekcja_15_Klasy_kontynuacja.com.modyfikatory_dostepu.app.jeden.KlasaAA;

public class KlasaDziedziczenie extends KlasaAA
{
    public void metoda()
    {
        poleChronione = 101;
        polePubliczne = 102;
        metodaPubliczna();
        metodaChroniona();
    }
}
