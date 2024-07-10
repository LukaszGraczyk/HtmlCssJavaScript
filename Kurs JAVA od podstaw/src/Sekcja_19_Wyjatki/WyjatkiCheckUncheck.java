package Sekcja_19_Wyjatki;

import java.io.File;
import java.io.InputStream;
import java.io.FileNotFoundException;
import java.io.FileInputStream;

public class WyjatkiCheckUncheck
{
    public static void menu(String[] args)
    {
        File file = new File("lokalizacja_pliku/plik.txt");
        try
        {
            InputStream inputStream = new FileInputStream(file);
        }
        catch(FileNotFoundException e)
        {
            System.out.println("Brak pliku");
        }
    }
}

// Wyjątki typu checked wymagają obsługi ze strony programisty bo jeżeli ich nie obsłużymy kod się nie będzie kompilował
// Wyjątki typu unchecked mogą byś obsłużone ale nie muszą

/*
Przykłady check exceptions:
- FileNotFoundException
- SocketException

Przykłady uncheck exceptions:
- NullPointerException
- ArrayIndexOutOfBoundException
 */

// Z nieznanego powodu nie można uruchomić programu