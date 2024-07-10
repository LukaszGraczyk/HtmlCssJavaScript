package Sekcja_5_Zmienne_i_operatory_zadania;

public class Zadanie_5
{
    public static void main(String[] args)
    {
        /*
        Zadanie 5:
        Odpowiedz, co ujrzymy na ekranie dla poniższego kodu?
         */

        int x = 5;
        boolean wynikPierwszy = x < 10 || x != 0 || x > -1;
        boolean wynikDrugi =  x < 10 && x != 0 && x > -1;
        System.out.println("Wynik pierwszy: " + wynikPierwszy);
        System.out.println("Wynik drugi: " + wynikDrugi);

    }
}
