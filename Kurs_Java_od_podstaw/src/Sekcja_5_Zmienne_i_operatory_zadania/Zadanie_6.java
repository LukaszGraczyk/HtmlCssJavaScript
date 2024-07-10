package Sekcja_5_Zmienne_i_operatory_zadania;

public class Zadanie_6
{
    public static void main(String[] args)
    {
        /*
        Przypisz wartość przekraczającą poza rozmiar zmiennej typu int.
        Zobacz co się stanie i zastanów dlaczego. Spróbuj oszukać środowisko,
        aby nie wytykało Ci błędów.
         */

        // Zmienna tyu "int" może przechowywać maksymalną wartość 2147483647 dlatego wynik dodawania jest błędny
        int mojInt = 1000000000;
        int pozaInt = mojInt + mojInt + mojInt;
        System.out.println("Poza int: " + pozaInt);

        int mojNowyInt = 1000000000;
        double poprawionaSuma = (double) mojNowyInt + mojNowyInt + mojNowyInt;
        System.out.println("Suma: " + poprawionaSuma);

    }
}
