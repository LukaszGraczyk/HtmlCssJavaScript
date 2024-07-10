package Sekcja_25_wczytywanie_danych.Klasa_Scanner;

import java.util.Scanner;

public class WczytywanieDanych2
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in); // Umożliwia wczytywanie danych z klawiatury
        String linia;

        while(!(linia = scanner.nextLine()).equals("KONIEC")) // equals pozwala na porównanie tekstu ze wzorcem
        {
            System.out.println("Wprowadziłem następujący tekst: " + linia);
        }
        System.out.println("Wprowadzanie tekstu zakończone");
    }
}