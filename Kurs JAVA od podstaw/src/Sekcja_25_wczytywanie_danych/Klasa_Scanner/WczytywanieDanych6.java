package Sekcja_25_wczytywanie_danych.Klasa_Scanner;

import java.util.Scanner;

public class WczytywanieDanych6
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Wpisz coś z klawiatury: ");

        while(scanner.hasNextLine())
        {
            String wczytywany = scanner.nextLine();
            System.out.println("Wczytany string: " + wczytywany);
        }
    }
}
