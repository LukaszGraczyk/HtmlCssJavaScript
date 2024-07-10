package Sekcja_29_IO_File_zapisywanie_wczytywanie_pliku_lista.Wczytywanie_pliku;

import java.io.*;

public class MainPlikiWczytywanieWersja2
{
    public static void main(String[] args)
    {
        try
        {
            File file2 = new File(KlasaLokalizacjiPlikow.lokalizacja2);
            FileReader fileReader = new FileReader(file2);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;

            while((line= bufferedReader.readLine()) != null)
            {
                System.out.println(line);
            }
            bufferedReader.close();
        }
        catch (FileNotFoundException e)
        {
            System.out.println("Brak pliku");
        } catch (IOException e)
        {
            System.out.println("Problem z wczytaniem pliku");
        }
    }
}
