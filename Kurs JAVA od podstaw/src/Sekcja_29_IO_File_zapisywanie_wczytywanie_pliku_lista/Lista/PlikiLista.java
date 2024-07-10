package Sekcja_29_IO_File_zapisywanie_wczytywanie_pliku_lista.Lista;

import java.util.ArrayList;
import java.util.List;

public class PlikiLista
{
    public static void main(String[] args)
    {
        /*
        Zestawienie klas osłonowych i typów prostych:
        Boolean - boolean       Double - double     Integer - int
        Character - char        Short - short       Float - float
        Byte - byte             Long - long
         */

        // Lista integer'ów
        List<Integer> mojaLista = new ArrayList<>(); //Używamy klas osłonowych
        mojaLista.add(10);
        mojaLista.add(100);
        mojaLista.add(200); // Ten element usuwamy
        mojaLista.add(1000);

        mojaLista.remove(2);

        for (int i = 0 ; i < mojaLista.size() ; i++)
        {
            System.out.println(mojaLista.get(i));
        }

        // Lista string'ów
        List<String> listaStringow = new ArrayList<>();
        listaStringow.add("Łukasz");
        listaStringow.add("Paulina");
        listaStringow.add("Ala");

        for (int i = 0 ; i < listaStringow.size() ; i++)
        {
            System.out.println(listaStringow.get(i));
        }
    }
}
