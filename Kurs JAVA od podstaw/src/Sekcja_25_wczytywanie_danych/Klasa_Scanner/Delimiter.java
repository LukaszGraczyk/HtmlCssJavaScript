package Sekcja_25_wczytywanie_danych.Klasa_Scanner;

import java.util.Scanner;

public class Delimiter
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter(","); // Postawienie przecinka umożliwia wczytanie wszystkiego co było napisane przed nim

        System.out.println("Wpisz coś z klawiatury: ");

        while(true)
        {
            String tekst = scanner.next(); // Wypisuje kolejne wyrazy w nowych wierszach
            System.out.println("Wczytany string: " + tekst);
        }
    }
}
