package Sekcja_16_Klasy_zadania.Zadanie_2;

public class Zadanie_2_main
{
    public static void main(String[] args)
    {
        int[] malaTablica = {1,2,3,4};

        Obliczenia obliczenia = new Obliczenia(malaTablica);
        System.out.println("Suma to: " + obliczenia.suma());
        System.out.println("Średnia to: " + obliczenia.srednia2());
        System.out.println("Wartość minimalna w tablicy to: " + obliczenia.min());
        System.out.println("Wartość maksymalna w tablicy to: " + obliczenia.max());
    }
}
