package Sekcja_16_Klasy_zadania.Zadanie_3;
/*
Zadanie 3: Stwórz własną klasę o nazwie “Matma”. Dodaj w niej metody liczące:
- obwód i pole koła (jako argument do metody przyjmuje promień koła)
- obwód i pole prostokąta (jako argumenty do metody przyjmuje długość boku a i b)

Metody niech będą statyczne i zwracają wynik odpowiedniego typu.
Dodatkowo utwórz w klasie statyczne, stałe pole, które będzie przechowywać wartość PI = 3.14.
Do obliczeń koła wykorzystaj Twoje PI. Pola i metody będą publiczne.
 */
public class Matma
{
    public static final double PI = 3.14;

    public static double poleKola(double r)
    {
        // double pole = 0; // Kod alternatywny dla tej metody
        // pole = PI * r * r;
        // return pole;
        return PI * r * r;
    }

    public static double obwodKola(double r)
    {
        return 2 * PI * r;
    }

    public static double obwodProstokata(double a, double b)
    {
        return 2 * a + 2 * b;
    }

    public static double poleProstokata(double a, double b)
    {
        return a * b;
    }

}
