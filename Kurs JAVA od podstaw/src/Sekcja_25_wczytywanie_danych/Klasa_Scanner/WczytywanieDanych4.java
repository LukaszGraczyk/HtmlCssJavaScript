package Sekcja_25_wczytywanie_danych.Klasa_Scanner;

import java.util.Scanner;

public class WczytywanieDanych4
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Wpisz coś z klawiatury: ");

        while(scanner.hasNextInt()) // hasNextInt() umożliwia zakończenie pętli gdy podamy nie int
        {
            int wczytywany = scanner.nextInt();
            System.out.println("Wczytany int: " + wczytywany);
        }
    }
}
