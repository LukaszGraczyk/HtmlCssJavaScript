package Sekcja_5_Zmienne_i_operatory_zadania;

public class Zadanie_4
{
    public static void main(String[] args)
    {
        /*
        Zadanie 4:
        Podaj dowolną liczbę typu całkowitego. Następnie oblicz wynik dzielenia oraz resztę z dzielenia
        przez liczby 2, 3 oraz 11. Zobacz czy wyniki zgadzają się z Twoimi oczekiwaniami.
         */

        int liczba = 5;
        int wynikDzielenia;
        int wynikiZResztyZDzielenia;

        wynikDzielenia = liczba / 2;
        wynikiZResztyZDzielenia = liczba % 2;
        System.out.println(liczba + " / 2 = " + wynikDzielenia);
        System.out.println(liczba + " % 2 = " + wynikiZResztyZDzielenia);

        wynikDzielenia = liczba / 3;
        wynikiZResztyZDzielenia = liczba % 3;
        System.out.println(liczba + " / 3 = " + wynikDzielenia);
        System.out.println(liczba + " % 3 = " + wynikiZResztyZDzielenia);

        wynikDzielenia = liczba / 11;
        wynikiZResztyZDzielenia = liczba % 11;
        System.out.println(liczba + " / 11 = " + wynikDzielenia);
        System.out.println(liczba + " % 11 = " + wynikiZResztyZDzielenia);
    }
}
