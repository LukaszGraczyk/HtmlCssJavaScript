package Sekcja_27_Paradygmaty_programowania_obiektowego.Polimorfizm.Przyklad_2;

public class MainPolimorfizm
{
    public static void main(String[] args)
    {
        // Polimorfizm
        Osoba osoba = new Osoba();
        Pies pies = new Pies("Reksio");
        Kon kon = new Kon("Rafał");

        osoba.przygarnijZwierze(pies);
        osoba.jakNazwywaSieTwojeZwierzatko();
        pies.wydajDzwiek();

        osoba.przygarnijZwierze(kon);
        osoba.jakNazwywaSieTwojeZwierzatko();
        kon.wydajDzwiek();
    }
}
