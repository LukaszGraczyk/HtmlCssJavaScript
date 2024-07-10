package Sekcja_15_Klasy_kontynuacja.com.modyfikatory_dostepu.app.jeden;

public class KlasaBezNiczego
{
    public void metoda()
    {
        KlasaAA obiekt = new KlasaAA();
        obiekt.poleBezModyfikatoraDostepu = 202;
        obiekt.poleChronione = 203;
        obiekt.polePubliczne = 204;
        obiekt.metodaPubliczna();
        obiekt.metodaBezNiczego();
        obiekt.metodaChroniona();
    }
}
