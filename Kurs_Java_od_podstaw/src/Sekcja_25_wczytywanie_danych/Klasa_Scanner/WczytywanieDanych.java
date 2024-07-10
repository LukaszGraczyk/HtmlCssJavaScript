package Sekcja_25_wczytywanie_danych.Klasa_Scanner;

import java.util.Scanner; // Niezbędny import

public class WczytywanieDanych
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in); // Umożliwia wczytywanie danych z klawiatury

        while(true)
        {
            String linia = scanner.nextLine();
            System.out.println("Wprowadziłem następujący tekst: " + linia);

            if(linia.equals("KONIEC"))
            {
                System.out.println("Wprowadzanie tekstu zakończone");
                break;
            }
        }
    }
}
