package Projekt_2;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Zadania_cz_1_polecenie_2 {
    public static void main(String[] args) {
        ArrayList<String> listaWyrazow = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader("SuplatowiczStanislawZiemiaSlonychSkal.txt"))) {
            String linia;
            while ((linia = br.readLine()) != null) {
                // Podziel linię na wyrazy oddzielone spacją
                String[] wyrazy = linia.split(" ");

                // Przetwarzaj każdy wyraz
                for (String wyraz : wyrazy) {
                    // Usuń niepotrzebne znaki oraz zmień na małe litery
                    wyraz = wyraz.replaceAll("[,.:;?!]", "").toLowerCase();
                    // Dodaj do listy, jeśli nie jest pusty
                    if (!wyraz.isEmpty()) {
                        listaWyrazow.add(wyraz);
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Wypisz wszystkie niepowtarzające się wyrazy
        ArrayList<String> unikalneWyrazy = new ArrayList<>();
        for (String wyraz : listaWyrazow) {
            if (!unikalneWyrazy.contains(wyraz)) {
                unikalneWyrazy.add(wyraz);
                System.out.println(wyraz);
            }
        }

        // Policz ile jest niepowtarzających się wyrazów
        int liczbaNiepowtarzajacychSieWyrazow = unikalneWyrazy.size();
        System.out.println("Liczba niepowtarzających się wyrazów: " + liczbaNiepowtarzajacychSieWyrazow);
    }
}
