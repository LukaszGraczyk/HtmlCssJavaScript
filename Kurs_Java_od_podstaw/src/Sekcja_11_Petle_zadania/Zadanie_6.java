package Sekcja_11_Petle_zadania;

public class Zadanie_6
{
    public static void main(String[] args)
    {
        /*
        Zadanie 6: Napisz program, który będzie obliczał silnię z nieujemnej liczby tj. jeżeli podamy liczbę 5,
        to zostanie obliczona 5! (wykrzyknik to znak silni). Obliczamy to w następujący sposób:
        5! = 5 * 4 * 3 * 2 * 1 = 120.
        Uważaj, bo silnia kolejnych liczb bardzo szybko rośnie i łatwo wyjść poza rozmiar typu int.
         */

        int x = 5;
        int wynik = 1;
        int i = 1;

        if(x < 0)
        {
            System.out.println("Nie istnieje silnia z liczby ujemnej!");
        }
        else if(x == 0)
        {
            System.out.println("0! = 1");
        }
        else
        {
            while(i > 0 && i <= x)
            {
                wynik = wynik * i;
                i++;
            }
            System.out.println("x! = " + wynik);
        }
    }
}
