package Sekcja_22_Klasy_abstrakcyjne_interfejsy_inne_zadania.Zadanie_2;

public class Kolo implements Figury
{
    private double promienKola;

    Kolo(double promienKola)
    {
        this.promienKola = promienKola;
    }

    @Override
    public double obwodFigury()
    {
        return 2*3.14*promienKola;
    }

    @Override
    public double poleFigury() {
        return 3.14*promienKola*promienKola;
    }
}
