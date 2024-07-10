package Projekt_2;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Zadania_cz_2_VR_n3 {
    public static void main(String[] args) {
        ArrayList<String> listaWyrazow = new ArrayList<>();

        try {
            BufferedReader reader = new BufferedReader(new FileReader("_dzikie_labedzie.txt"));
            String line;

            while ((line = reader.readLine()) != null) {
                String[] words = line.split("\\s+");

                for (String word : words) {
                    // Usunięcie niepotrzebnych znaków oraz ujednolicenie wielkości liter
                    String cleanedWord = word.replaceAll("[,.;?!—]", "").toLowerCase();

                    // Dodanie oczyszczonego słowa do listy wyrazów
                    listaWyrazow.add(cleanedWord);
                }
            }

            reader.close();
        } catch (IOException e) {
            System.err.println("Błąd podczas czytania pliku: " + e.getMessage());
            e.printStackTrace();
        }

        // Policz wszystkie wyrazy (bez spacji) i wypisz ich liczbę na ekran
        int liczbaWyrazow = listaWyrazow.size();
        System.out.println("Liczba wszystkich wyrazów: " + liczbaWyrazow);

        // Policz wszystkie unikalne wyrazy (bez spacji) i wypisz ich liczbę na ekran
        Set<String> unikalneWyrazy = new HashSet<>(listaWyrazow);
        int liczbaUnikalnychWyrazow = unikalneWyrazy.size();
        System.out.println("Liczba unikalnych wyrazów: " + liczbaUnikalnychWyrazow);
    }
}
