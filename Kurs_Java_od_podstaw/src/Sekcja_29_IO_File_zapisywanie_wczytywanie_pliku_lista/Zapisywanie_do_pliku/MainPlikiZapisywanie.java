package Sekcja_29_IO_File_zapisywanie_wczytywanie_pliku_lista.Zapisywanie_do_pliku;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class MainPlikiZapisywanie
{
    public static void main(String[] args)
    {
        try {
            // true po przecinku daję możliwość dopisywania tekstu do pliku a nie nadpisywania go po kolejnych uruchomieniach
            FileWriter fileWriter = new FileWriter(KlasaLokalizacjiZapisuPlikow.path, true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write("Przykładowy ciąg znaków\n");
            bufferedWriter.write("Kolejny przykładowy ciąg znaków\n"); // \n pozwala na rozpoczęcie wpisywania tekstu od nowej linii
            bufferedWriter.newLine(); // Ta komenda też  pozwala na rozpoczęcie wpisywania tekstu od nowej linii


            bufferedWriter.close();
        }
        catch (IOException e)
        {
            System.out.println("Błąd operacji z plikiem");
        }

    }
}
