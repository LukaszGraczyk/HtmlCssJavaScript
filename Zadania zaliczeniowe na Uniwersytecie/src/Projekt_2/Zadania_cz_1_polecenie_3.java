package Projekt_2;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Zadania_cz_1_polecenie_3 {
    public static void main(String[] args) {
        ArrayList<String> listaWyrazow = new ArrayList<>();
        Map<String, Integer> wystapienia = new HashMap<>();

        try {
            BufferedReader reader = new BufferedReader(new FileReader("SuplatowiczStanislawZiemiaSlonychSkal.txt"));
            String line;

            while ((line = reader.readLine()) != null) {
                String[] words = line.split("\\s+");

                for (String word : words) {
                    // Usunięcie niepotrzebnych znaków oraz ujednolicenie wielkości liter
                    String cleanedWord = word.replaceAll("[,.:;?!]", "").toLowerCase();

                    // Dodanie oczyszczonego słowa do listy wyrazów
                    listaWyrazow.add(cleanedWord);

                    // Aktualizacja licznika wystąpień słowa
                    wystapienia.put(cleanedWord, wystapienia.getOrDefault(cleanedWord, 0) + 1);
                }
            }

            reader.close();
        } catch (IOException e) {
            System.err.println("Błąd podczas czytania pliku: " + e.getMessage());
            e.printStackTrace();
        }

        // Wypisanie informacji o liczbie wystąpień każdego słowa
        for (Map.Entry<String, Integer> entry : wystapienia.entrySet()) {
            System.out.println(entry.getKey() + " wystąpiło " + entry.getValue() + " razy.");
        }
    }
}
