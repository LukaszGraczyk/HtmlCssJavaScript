package Sekcja_11_Petle_zadania;

public class Zadania_4_5
{
    public static void main(String[] args)
    {
        /*
        Zadanie 4: Utwórz tablicę rozmiaru 10 elementów i uzupełnij liczbami.
        Wypisz wszystkie liczby z tej tablicyna ekran. Następnie wypisz wszystkie liczby od tyłu.
        Zadanie 5: Wykorzystując tablicę z poprzedniego zadania, oblicz sumę wszystkich jej elementów.
         */

        int[] tab = new int[10];

        for(int i = 0; i < 10 ; i++)
            tab[i]=i;

        for(int i = 0; i < 10 ; i++)
            System.out.print(tab[i] + " ");

        System.out.println();

        for(int i = 9; i >= 0 ; i--)
            System.out.print(tab[i] + " ");

        System.out.println();

        int suma = 0;

        for(int i = 0; i < 10 ; i++)
            suma = suma + tab[i];

        System.out.println("Suma elementów w tablicy to: " + suma);
    }
}
