package Sekcja_6_Tablice;

public class Tablice_jednowymiarowe
{
    public static void main(String[] args)
    {
        // Arrays

        int[] tablica;          // Deklaracja tablicy i jej typu
        tablica = new int[10];  // Tworzenie tablicy o danym rozmiarze

                                // Tablica[indeks]
                                // Przypisywanie wartości do tablicy
        tablica[0] = 5;         // Indeks 0 odpowiada pierwszemu elementowi tablicy
        tablica[1] = 10;
        tablica[2] = 15;
        tablica[3] = 155;

        System.out.println(tablica[3]); // Wypisanie na ekran wartości 155
        System.out.println(tablica[5]); // Wypisanie na ekran wartości domyślnej dla int czyli 0


        double[] tablicaDouble = new double[5];
        tablicaDouble[0] = 12.5;
        tablicaDouble[1] = 55.5;
        tablicaDouble[2] = 111.11;

        System.out.println(tablicaDouble[1]); // Wypisanie na ekran wartości 55.5
        System.out.println(tablicaDouble[3]); // Wypisanie na ekran wartości domyślnej dla double czyli 0.0

        char[] tablicaCharow = new char[100];
        tablicaCharow[0]='A';
        System.out.println(tablicaCharow[0]);

        int[] nowaTablicaIntow = new int[] {1,2,3}; // Inny sposób wprowadzania elementów do tablicy
        System.out.println("nowaTablicaIntow[0]: " + nowaTablicaIntow[0]);
        System.out.println("nowaTablicaIntow[1]: " + nowaTablicaIntow[1]);
        System.out.println("nowaTablicaIntow[2]: " + nowaTablicaIntow[2]);

        int[] kolejnaTablicaIntow = {4,5,6}; // Inny sposób wprowadzania elementów do tablicy
        System.out.println("kolejnaTablicaIntow[0]: " + kolejnaTablicaIntow[0]);
        System.out.println("kolejnaTablicaIntow[1]: " + kolejnaTablicaIntow[1]);
        System.out.println("kolejnaTablicaIntow[2]: " + kolejnaTablicaIntow[2]);

        // Ustalenie rozmiaru tablic
        System.out.println("Rozmiar tablicy tablica: " + tablica.length);
        System.out.println("Rozmiar tablicy tablicaDouble: " + tablicaDouble.length);
    }
}
