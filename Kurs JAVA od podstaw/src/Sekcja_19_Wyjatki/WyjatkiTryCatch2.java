package Sekcja_19_Wyjatki;

public class WyjatkiTryCatch2
{
    static int[] tablica; // Wyjątek 1

    public static void main(String[] args)
    {

        tablica = new int[2]; // Wyjątek 2, jeżeli tej linijki by nie było to mamy do czynienia z wyjątkiem 1

        try
        {
            tablica[0] = 101;
            tablica[1] = 202;
            tablica[2] = 303;
        }

        catch(NullPointerException | ArrayIndexOutOfBoundsException wyjatek) // Można łączyć wyjątki
        {
            System.out.println("Nie określono rozmiaru tablicy lub tablica jest za mała");
        }

        System.out.println("Napis na koniec programu");
    }

}
