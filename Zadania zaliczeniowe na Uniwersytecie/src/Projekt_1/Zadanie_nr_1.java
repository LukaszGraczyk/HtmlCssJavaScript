package Projekt_1;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Zadanie_nr_1 {
    public static void main(String[] args) {

        // Odczytanie liczb z pliku o nazwie "liczby1.txt" oraz zapisanie ich do tablicy int'ów:
        String inputFile = "liczby1.txt";
        ArrayList<Integer> numbers = odczytajLiczbyZpliku(inputFile);

        // Suma, średnia arytmetyczna oraz średnia geometryczna przypisane do zmiennych:
        int suma = obliczSume(numbers);
        double sredniaA = obliczArytmetyczna(numbers);
        double sredniaG = obliczGeometryczna(numbers);

        // Pokazanie wyników na ekranie:
        System.out.println("Suma wynosi: " + suma);
        System.out.println("Średnia arytmetyczna wynosi: " + sredniaA);
        System.out.println("Średnia geometryczna wynosi: " + sredniaG);

        // Zapisanie liczb pierwszych w pliku tekstowym "wynik1P.txt":
        ArrayList<Integer> primes = findPrimes(numbers);
        zapiszDoPliku(primes, "wynik1P.txt");

        // Zapisanie liczb doskonałych w pliku tekstowym "wynik1D.txt":
        ArrayList<Integer> perfectNumbers = szukajLiczbDoskonalych(numbers);
        zapiszDoPliku(perfectNumbers, "wynik1D.txt");
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

    // Metoda do obliczenia sumy liczb znajdujących się w tablicy:
    private static int obliczSume(ArrayList<Integer> numbers) {
        int sumowanie = 0;
        for (int number : numbers) {
            sumowanie += number;
        }
        return sumowanie;
    }

    // Metoda do obliczenia średniej arytmetycznej z liczb znajdujących się w tablicy:
    private static double obliczArytmetyczna(ArrayList<Integer> numbers) {
        int sumowanie = obliczSume(numbers);
        return (double) sumowanie / numbers.size();
    }

    // Metoda do obliczenia średniej geometrycznej z liczb znajdujących się w tablicy:
    private static double obliczGeometryczna(ArrayList<Integer> numbers) {
        double product = 1.00;
        for (int number : numbers) {
            product *= number;
        }
        return Math.pow(product, 1.0 / numbers.size());
    }

    // Metoda wyszukująca liczby pierwsze w tablicy:
    private static ArrayList<Integer> findPrimes(ArrayList<Integer> numbers) {
        ArrayList<Integer> primes = new ArrayList<>();
        for (int number : numbers) {
            if (isPrime(number)) {
                primes.add(number);
            }
        }
        return primes;
    }

    // Metoda sprawdzająca, czy dana liczba jest liczbą pierwszą:
    private static boolean isPrime(int number) {
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

    // Metoda wyszukująca liczby doskonałe w naszej tablicy:
    private static ArrayList<Integer> szukajLiczbDoskonalych(ArrayList<Integer> numbers) {
        ArrayList<Integer> liczbyDoskonale = new ArrayList<>();
        for (int number : numbers) {
            if (jestDoskonala(number)) {
                liczbyDoskonale.add(number);
            }
        }
        return liczbyDoskonale;
    }

    // Metoda sprawdzająca, czy dana liczba jest liczbą doskonałą:
    private static boolean jestDoskonala(int number) {
        int sum = 1;
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                sum += i;
                sum += number / i;
            }
        }
        return sum == number && number != 1;
    }

    // Zapisywanie liczb do pliku:
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
