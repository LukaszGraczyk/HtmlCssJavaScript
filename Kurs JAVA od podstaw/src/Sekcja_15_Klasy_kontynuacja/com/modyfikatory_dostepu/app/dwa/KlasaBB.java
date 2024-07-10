package Sekcja_15_Klasy_kontynuacja.com.modyfikatory_dostepu.app.dwa;

import Sekcja_15_Klasy_kontynuacja.com.modyfikatory_dostepu.app.jeden.KlasaAA;

public class KlasaBB
{
    public void metoda()
    {
        KlasaAA obiekt = new KlasaAA();
        obiekt.polePubliczne = 10; // Pole publiczne z KlasaAA dostępne w KlasaBB
        obiekt.metodaPubliczna();
    }
}
