package Sekcja_9_Instrukcje_warunkowe_zadania;

public class Zadanie_1
{
    public static void main(String[] args)
    {
       /*
       Sprawdź czy wpisana liczba jest parzysta czy nieparzysta. Wypisz odpowiedni komunikat na ekran.
       (podpowiedź: jeżeli reszta z dzielenia przez 2 jest równa 0 to znaczy, że liczba jest parzysta).
        */

        int liczba = 4;

        if(liczba % 2 == 0)
        {
            System.out.println("Podana liczba jest parzysta");
        }
        else
        {
            System.out.println("Poddana liczba jest nieparzysta");
        }

    }
}
