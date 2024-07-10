package Sekcja_7_Tablice_zadania;

public class Zadanie_2
{
    public static void main(String[] args)
    {
        /*
        Zadanie 2:
        Utwórz tablicę dwuwymiarową typu double wymiaru 3x5 i także wypełnij dowolnymi wartościami.
        Tym razem zsumuj elementy z każdego wiersza osobno i wypisz wynik na ekran.
        */

        double[][] tab = new double[][]{{1.1,2.1,3.1,4.1,5.1},{5.2,4.2,3.2,2.2,1.2},{0.3,1.3,0.3,1.3,0.3}};
        double sumaWiersza1 = tab[0][0] + tab[0][1] + tab[0][2] + tab[0][3] + tab[0][4];
        double sumaWiersza2 = tab[1][0] + tab[1][1] + tab[1][2] + tab[1][3] + tab[1][4];
        double sumaWiersza3 = tab[2][0] + tab[2][1] + tab[2][2] + tab[2][3] + tab[2][4];

        System.out.println("Suma wiersza 1: " + sumaWiersza1);
        System.out.println("Suma wiersza 2: " + sumaWiersza2);
        System.out.println("Suma wiersza 3: " + sumaWiersza3);
    }
}
