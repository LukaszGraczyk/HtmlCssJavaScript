package Sekcja_7_Tablice_zadania;

public class Zadanie_1
{
    public static void main(String[] args)
    {
        /*
        Zadanie 1:
        Uzupełnij tablicę typu int rozmiaru 5 dowolnymi wartościami. Następnie zsumuj wszystkie elementy tej tablicy
        i wynik wypisz na ekran. Sumowania dokonaj poprzez dodawanie elementów odwołując się do indeksów tablicy.
         */

        int[] tab = new int[] {3,5,7,9,1};
        int suma = tab[0] + tab[1] + tab[2] + tab[3] + tab[4];
        System.out.println("Suma elementów w tablicy: " + suma);
    }
}
