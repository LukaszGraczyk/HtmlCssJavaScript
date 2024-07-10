package Sekcja_25_wczytywanie_danych.Klasa_Scanner;

import java.util.Scanner;

public class WczytywanieDanych3
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Wpisz coś z klawiatury: ");

        while(true)
        {
            int wczytywany = scanner.nextInt();
            System.out.println("Wczytany int: " + wczytywany);

            if(wczytywany == 0)
            {
                System.out.println("Wprowadzanie int zakończone");
                break;
            }
        }
    }
}
