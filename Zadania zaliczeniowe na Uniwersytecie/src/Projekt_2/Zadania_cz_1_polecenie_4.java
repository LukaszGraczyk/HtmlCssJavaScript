package Projekt_2;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Zadania_cz_1_polecenie_4 {
    public static void main(String[] args) {
        List<String> listaWyrazow = new ArrayList<>();

        // Odczytaj i oczyść wyrazy z pliku
        try (BufferedReader br = new BufferedReader(new FileReader("SuplatowiczStanislawZiemiaSlonychSkal.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] words = line.split("\\s+");
                for (String word : words) {
                    // Usuń niepotrzebne znaki i ujednolić wielkość liter
                    word = word.replaceAll("[,.;?!—]", "").toLowerCase().trim();
                    if (!word.isEmpty()) {
                        listaWyrazow.add(word);
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Usuń powtarzające się wyrazy
        Map<String, Integer> wordCount = new HashMap<>();
        for (String word : listaWyrazow) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }

        // Wypisz 20 najczęściej występujących wyrazów
        System.out.println("Najczęściej występujące wyrazy:");
        printMostFrequentWords(wordCount, 20);

        // Usuń wyrazy ze stop_words.txt
        List<String> stopWords = readStopWordsFromFile("stop_words.txt");
        listaWyrazow.removeAll(stopWords);

        // Ponownie policz wystąpienia wyrazów
        wordCount.clear();
        for (String word : listaWyrazow) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }

        // Wypisz 20 najczęściej występujących wyrazów po usunięciu stop words
        System.out.println("\nNajczęściej występujące wyrazy po usunięciu stop words:");
        printMostFrequentWords(wordCount, 20);
    }

    private static List<String> readStopWordsFromFile(String filename) {
        List<String> stopWords = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = br.readLine()) != null) {
                stopWords.add(line.trim().toLowerCase());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return stopWords;
    }

    private static void printMostFrequentWords(Map<String, Integer> wordCount, int n) {
        List<Map.Entry<String, Integer>> list = new ArrayList<>(wordCount.entrySet());
        list.sort((o1, o2) -> o2.getValue().compareTo(o1.getValue()));

        for (int i = 0; i < Math.min(n, list.size()); i++) {
            System.out.println(list.get(i).getKey() + " - " + list.get(i).getValue());
        }
    }
}
