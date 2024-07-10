package Sekcja_11_Petle_zadania;

public class Zadania_1_2_3
{
    public static void main(String[] args)
    {
        /*
        Zadanie 1: Wypisz na ekran liczby od 0 do 30, a następnie od 30 do 0.
        Zadanie 2: Napisz program, które wypisze tylko liczby parzyste z zakresu od 0 do 30.
        Zadanie 3: Podaj dwie dowolne liczby a i b, gdzie a jest mniejsze od b (a < b). Wypisz na ekran zakres liczb od a do b.
         */

        for(int i = 0 ; i <= 30 ; i++)
            System.out.print(i + " ");

        System.out.println();

        for(int j = 30 ; j >= 0 ; j--)
            System.out.print(j + " ");

        System.out.println();

        for(int i = 0 ; i <= 30 ; i++)
            if(i % 2 == 0)
            {
                System.out.print(i + " ");
            }

        System.out.println();

        int a = 9; int b = 23;

        for(int krok = a ; krok <= b ; krok++)
            System.out.print(krok + " ");
    }
}
