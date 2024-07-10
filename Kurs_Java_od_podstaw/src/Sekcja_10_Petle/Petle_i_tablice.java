package Sekcja_10_Petle;

public class Petle_i_tablice
{
    public static void main(String[] args)
    {
        int[] tab = new int[100];

        for(int i = 0 ; i <= 99 ; i++)
        {
            tab[i] = i;
        }
        for(int i = 0 ; i <= 99 ; i++)
        {
            System.out.println("tab" + "[" + i + "]" + " = " + tab[i]);
        }

        int[] tablica = new int[50];

        for(int i = 0 ; i <= tablica.length-1 ; i++)
        {
            tablica[i] = i;
        }
        for(int i = 0 ; i < tablica.length ; i++)
        {
            System.out.println("tablica" + "[" + i + "]" + " = " + tablica[i]);
        }
    }
}
