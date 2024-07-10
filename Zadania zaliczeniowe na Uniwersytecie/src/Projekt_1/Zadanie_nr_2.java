package Projekt_1;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Zadanie_nr_2 {
    public static void main(String[] args) {
        // Pliki odczytu i zapisu:
        String plikOdczytu = "liczby2.txt";
        String plikZapisu = "wynik2.txt";

        // Odczytanie liczb z pliku tekstowego "liczby2.txt":
        ArrayList<Integer> numbers = odczytajLiczbyZpliku(plikOdczytu);

        // Wychwycenie liczb półpierwszych:
        ArrayList<Integer> liczbyPolPierwsze = znajdzPolpierwsze(numbers);

        // Zapisanie liczb półpierwszych do pliku tekstowego "wynik2.txt":
        zapiszDoPliku(liczbyPolPierwsze, plikZapisu);
    }

    // Metoda do odczytania liczb z pliku tekstowego:
    private static ArrayList<Integer> odczytajLiczbyZpliku(String nazwaPliku) {
        ArrayList<Integer> numbers = new ArrayList<>();
        try {
            File plik = new File(nazwaPliku);
            Scanner scanner = new Scanner(plik);
            while (scanner.hasNextInt()) {
                numbers.add(scanner.nextInt());
            }
            scanner.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return numbers;
    }

    // Wychwycenie liczb półpierwszych:
    private static ArrayList<Integer> znajdzPolpierwsze(ArrayList<Integer> numbers) {
        ArrayList<Integer> polPierwsze = new ArrayList<>();
        for (int number : numbers) {
            if (jestPolPierwsza(number)) {
                polPierwsze.add(number);
            }
        }
        return polPierwsze;
    }

    // Sprawdzenie, czy liczba jest pierwsza:
    private static boolean jestPierwsza(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Sprawdzenie, czy liczba jest półpierwsza:
    private static boolean jestPolPierwsza(int number) {
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0 && jestPierwsza(i) && jestPierwsza(number / i)) {
                return true;
            }
        }
        return false;
    }

    // Zapisanie liczb do pliku:
    private static void zapiszDoPliku(ArrayList<Integer> numbers, String nazwaPliku) {
        try {
            FileWriter zapis = new FileWriter(nazwaPliku);
            for (int number : numbers) {
                zapis.write(number + "\n");
            }
            zapis.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
