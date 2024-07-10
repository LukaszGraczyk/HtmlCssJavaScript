package Sekcja_29_IO_File_zapisywanie_wczytywanie_pliku_lista.Wczytywanie_pliku;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MainPlikiWczytywanieWersja1
{
    public static void main(String[] args)
    {
        try
        {
            File file1 = new File(KlasaLokalizacjiPlikow.lokalizacja1);
            Scanner scanner = new Scanner(file1);

            while(scanner.hasNextLine())
            {
                String line = scanner.nextLine();
                System.out.println(line);
            }
            scanner.close();
        }
        catch (FileNotFoundException e)
        {
            System.out.println("Nie znaleziono pliku");
        }
    }
}
