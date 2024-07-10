package Sekcja_10_Petle;

public class Petla_while
{
    public static void main(String[] args)
    {
        // Pętla while

        int liczenie = 1; // Inicjalizujemy zmienną przed pętlą
        while(liczenie <=10)
        {
            System.out.println("Tekst " + liczenie);
            liczenie++; // Zwiększamy krok wewnątrz instrukcji którą wykonuje pętla
        }

        // Pętla do while

        int licznik = 1;
        do
        {
            System.out.println("Tekst z do while: " + licznik); // Zawsze wykona się pierwszy przebieg niezależnie
            licznik++;                                          // czy warunek pętli while w nawiasie jest spełniony
        }
        while(licznik <= 10);
    }
}
