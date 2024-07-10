package Sekcja_29_IO_File_zapisywanie_wczytywanie_pliku_lista.Inne_metody_wczytywania;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class MainWczytywanieInne
{
    public static void main(String[] args)
    {
        // Metoda 1: Scanner
        // Metoda 2: FileReader
        // Metoda 3: InputStreamReader
        // Metoda 4: poniżej:

        try
        {
            List<String> allLines = Files.readAllLines(Paths.get(Lokalizacje_plikow.lokalizacjaPliku));
            System.out.println(allLines);
        }
        catch (IOException e)
        {
            System.out.println("Błąd!");
        }
    }
}
