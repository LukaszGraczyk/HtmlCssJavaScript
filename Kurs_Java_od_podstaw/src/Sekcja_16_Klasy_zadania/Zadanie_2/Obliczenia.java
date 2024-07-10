package Sekcja_16_Klasy_zadania.Zadanie_2;
/*
Zadanie 2: Napisz klasę, która w konstruktorze będzie przyjmować tablicę oraz będzie posiadać cztery metody:
- zliczającą sumę wszystkich elementów z tablicy
- liczącą średnią
- znajdującą wartość najmniejszą
- znajdującą wartość największą

Każda z metod powinna zwracać wynik jako int.
Utwórz pole przechowujące tablicę. Załóż, że w tablicy będą tylko liczby całkowite.
Pola będą prywatne a metody i konstruktor publiczne.
Klasę, pole i metody nazwij według własnego uznania.
Przetestuj całość w main.
 */
public class Obliczenia
{
    private int tablica[] = new int[4];

    Obliczenia(int tab[])
    {
        tablica = tab;
    }

    int suma() // Metoda sumująca
    {
        int suma = 0;
        for(int i = 0 ; i <= 3 ; i++)
        {
            suma = suma + tablica[i];
        }
        return suma;
    }

    int srednia() // Metoda wyliczająca średnią
    {
        int srednia = 0;
        int suma = 0;
        int licznik = 0;
        for(int i = 0 ; i <= 3 ; i++)
        {
            suma = suma + tablica[i];
            licznik++;
        }
        srednia = suma / licznik;
        return srednia;
    }

    int srednia2() // Metoda alternatywna wyliczająca średnią
    {
        return suma() / tablica.length;
    }

    int min()
    {
        int min = Integer.MAX_VALUE;
        for(int i = 0 ; i < tablica.length ; i++)
        {
            if(tablica[i] < min)
            {
                min = tablica[i];
            }
        }
        return min;
    }

    int max()
    {
        int max = Integer.MIN_VALUE;
        for(int i = 0 ; i < tablica.length ; i++)
        {
            if(tablica[i] > max)
            {
                max = tablica[i];
            }
        }
        return max;
    }
    
}
