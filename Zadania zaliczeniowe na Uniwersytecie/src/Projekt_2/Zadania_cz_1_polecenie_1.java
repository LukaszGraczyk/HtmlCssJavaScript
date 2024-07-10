package Projekt_2;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Zadania_cz_1_polecenie_1 {
    public static void main(String[] args) {
        ArrayList<String> listaWyrazow = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader("SuplatowiczStanislawZiemiaSlonychSkal.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                // Podziel linię na wyrazy
                String[] words = line.split("\\s+");

                // Iteruj przez każdy wyraz
                for (String word : words) {
                    // Usuń niepotrzebne znaki oraz ujednolic wielkość liter
                    String cleanedWord = word.replaceAll("[,.;?!]", "").toLowerCase();
                    listaWyrazow.add(cleanedWord);
                }
            }
        } catch (IOException e) {
            System.err.println("Błąd podczas odczytu pliku: " + e.getMessage());
            e.printStackTrace();
        }

        // Wypisz wyrazy
        for (String word : listaWyrazow) {
            System.out.println(word);
        }

        // Policz ilość wyrazów
        int iloscWyrazow = listaWyrazow.size();
        System.out.println("Ilość wyrazów: " + iloscWyrazow);
    }
}
