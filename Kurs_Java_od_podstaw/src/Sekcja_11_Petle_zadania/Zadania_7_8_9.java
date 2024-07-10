package Sekcja_11_Petle_zadania;

public class Zadania_7_8_9
{
    public static void main(String[] args)
    {
        /*
        Zadanie 7: Napisz program, w którym po podaniu liczby n narysujesz za pomocą * (gwiazdki) trójkąt prostokątny
        o przyprostokątnych składających się z n-razy * (gwiazdki) np. podając n = 5 powinniśmy otrzymać taki trójkąt:
        *
        **
        ***
        ****
        *****
        */

        int n = 5;
        int gwiazdki = 1;

        for(int i = 1 ; i <= n ; i++)
        {
            for (int j = 1; j <= i; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

        /*
        Zadanie 8: Narysuj odbicie lustrzane trójkąta z poprzedniego zadania tj. dla n = 5 powinniśmy ujrzeć:
            *
           **
          ***
         ****
        *****
         */

        for(int i = 1 ; i <= n ; i++)
        {
            for(int j = 1 ; j <= n-i ; j++)
            {
                System.out.print(" ");
            }
            for(int k = 1 ; k <= i ; k++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

        /*
        Zadanie 9: Napisz program, w którym po podaniu liczby n narysujesz za pomocą * (gwiazdki) drzewko choinkowe
        o wysokości n np. podając n = 5 powinniśmy otrzymać takie drzewko:
            *
           ***
          *****
         *******
        *********
        */

        for(int i = 1 ; i <= n ; i++)
        {
            for(int j = 1 ; j <= n-i ; j++)
            {
                System.out.print(" ");
            }
            for(int k = 1 ; k <= i ; k++)
            {
                System.out.print("*");
            }
            if(i==1)
            {
                for(int z = 1 ; z <= n-i ; z++)
                {
                    System.out.print(" ");
                }
            }
            else
            {
                for(int x = 1 ; x <= i-1 ; x++)
                {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
