package Sekcja_25_wczytywanie_danych.Klasa_Scanner;

import java.util.Scanner;

public class WczytywanieDanych7
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Wpisz coś z klawiatury: ");

        while(true)
        {
            String tekst = scanner.next(); // Wypisuje kolejne wyrazy w nowych wierszach
            System.out.println("Wczytany string: " + tekst);
        }
    }
}
