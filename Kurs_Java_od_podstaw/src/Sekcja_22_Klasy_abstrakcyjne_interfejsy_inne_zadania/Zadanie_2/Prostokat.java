package Sekcja_22_Klasy_abstrakcyjne_interfejsy_inne_zadania.Zadanie_2;

public class Prostokat implements Figury
{
private double bokA;
private double bokB;

Prostokat(double bokA, double bokB)
{
    this.bokA = bokA;
    this.bokB = bokB;
}

    @Override
    public double obwodFigury() {
        return 2*bokA+2*bokB;
    }

    @Override
    public double poleFigury() {
        return bokA*bokB;
    }
}
