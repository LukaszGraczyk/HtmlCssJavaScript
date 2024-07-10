package Sekcja_10_Petle;

public class Petla_w_petli
{
    public static void main(String[] args)
    {
        int licznik = 0;
        int[][] tab = new int[5][10];

        for(int i = 0 ; i < 5 ; i++)
        {
            for (int j = 0; j < 10; j++)
            {
                licznik++;
                tab[i][j] = licznik;
            }
        }

        for(int i = 0 ; i < 5 ; i++)
        {
            for (int j = 0; j < 10; j++)
            {
                System.out.print(tab[i][j] + " ");
            }
            System.out.println();
        }
    }
}
