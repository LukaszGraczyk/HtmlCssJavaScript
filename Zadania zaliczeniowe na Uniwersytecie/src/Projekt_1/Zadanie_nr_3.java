package Projekt_1;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Zadanie_nr_3 {
    public static void main(String[] args) {

        String plikA = "liczby3a.txt";
        String plikB = "liczby3b.txt";
        String plikZapisu = "wynik3.txt";

        try {
            FileWriter zapis = new FileWriter(plikZapisu);

            // Podpunkt a.) polecenia:
            int numberOfDigitsA = liczbaCyfr(plikA);
            zapis.write("a.) Liczba cyfr w pliku " + plikA + ": " + numberOfDigitsA + "\n");

            // Podpunkt b.) polecenia:
            int minNumberA = najmniejszaLiczba(plikA);
            zapis.write("b.) Najmniejsza liczba w pliku " + plikA + ": " + minNumberA + "\n");

            // Podpunkt c.) polecenia:
            int commonNumbersCount = zliczanieIndentycznychLiczb(plikA, plikB);
            zapis.write("c.) Liczba liczb występujących jednocześnie w plikach " + plikA + " i " + plikB + ": " + commonNumbersCount + "\n");

            // Podpunkt d.) polecenia:
            int[] countsOfLastDigits = zliczanieOstatnichCyfr(plikA);
            zapis.write("d.) Zestawienie ilości liczb kończących się odpowiednio cyframi 0-9 w pliku " + plikA + ":\n");
            for (int i = 0; i < countsOfLastDigits.length; i++) {
                zapis.write("Cyfra " + i + ": " + countsOfLastDigits[i] + "\n");
            }

            zapis.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Metoda do zliczania cyfr w pliku tekstowym:
    private static int liczbaCyfr(String nazwaPliku) {
        int licznik = 0;
        try {
            File plik = new File(nazwaPliku);
            Scanner scanner = new Scanner(plik);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                licznik += line.length();
            }
            scanner.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return licznik;
    }

    // Wyszukanie najmniejszej liczby w pliku tekstowym:
    private static int najmniejszaLiczba(String nazwaPliku) {
        int min = Integer.MAX_VALUE;
        try {
            File plik = new File(nazwaPliku);
            Scanner scanner = new Scanner(plik);
            while (scanner.hasNextInt()) {
                int number = scanner.nextInt();
                if (number < min) {
                    min = number;
                }
            }
            scanner.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return min;
    }

    // Zliczanie liczby wspólnych liczb w dwóch plikach tekstowych:
    private static int zliczanieIndentycznychLiczb(String nazwaPlikuA, String nazwaPlikuB) {
        Set<Integer> setA = new HashSet<>();
        int licznik = 0;
        try {
            File plikA = new File(nazwaPlikuA);
            Scanner scannerA = new Scanner(plikA);
            while (scannerA.hasNextInt()) {
                setA.add(scannerA.nextInt());
            }
            scannerA.close();

            File plikB = new File(nazwaPlikuB);
            Scanner scannerB = new Scanner(plikB);
            while (scannerB.hasNextInt()) {
                int number = scannerB.nextInt();
                if (setA.contains(number)) {
                    licznik++;
                }
            }
            scannerB.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return licznik;
    }

    // Zliczanie liczb kończących się na cyfry od 0 do 9:
    private static int[] zliczanieOstatnichCyfr(String nazwaPliku) {
        int[] liczby = new int[10];
        try {
            File plik = new File(nazwaPliku);
            Scanner scanner = new Scanner(plik);
            while (scanner.hasNextInt()) {
                int number = scanner.nextInt();
                int lastDigit = number % 10;
                liczby[lastDigit]++;
            }
            scanner.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return liczby;
    }
}
