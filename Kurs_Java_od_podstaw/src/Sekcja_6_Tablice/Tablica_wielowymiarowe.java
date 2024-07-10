package Sekcja_6_Tablice;

public class Tablica_wielowymiarowe
{
    public static void main(String[] args)
    {
        int[][] tablicaDwuwymiarowa = new int[10][10]; // Tablica dwuwymiarowa 10x10
        tablicaDwuwymiarowa[0][1]=123;
        tablicaDwuwymiarowa[4][8]=190;

        System.out.println(tablicaDwuwymiarowa[4][8]);

        // Tablica o 2 wierszach i 3 kolumnach
        int[][] nowaTablica = {{1,2,3},{4,5,6}}; // Inny sposób wprowadzania elementów do tablicy

        System.out.println("[0][0]: " + nowaTablica[0][0]);
        System.out.println("[0][1]: " + nowaTablica[0][1]);
        System.out.println("[0][2]: " + nowaTablica[0][2]);
        System.out.println("[1][0]: " + nowaTablica[1][0]);
        System.out.println("[1][1]: " + nowaTablica[1][1]);
        System.out.println("[1][2]: " + nowaTablica[1][2]);

        System.out.println("Rozmiar całej tablicy: " + nowaTablica.length); // Pokazuje ilość wierszy
        System.out.println("Rozmiar dla wiersza 0: " + nowaTablica[0].length); // Pokazuje ilość dla wiersza 0

        int[][][] tablicaTrojwymiarowa = new int[5][6][11]; // Tablica trójwymiarowa
    }
}
