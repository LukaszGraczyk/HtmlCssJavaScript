package Sekcja_23_Watki.Klasa_Thread;

public class MojPierwszyWatek extends Thread // Klasa dziedziczy po klasie Thread
{
    @Override
    public void run() // Polecenie konieczne dla utworzenia wątku
    {
        for(int i = 0 ; i <= 1000 ; i++)
        {
            System.out.println("Pierwszy wątek: " + i);
        }
    }
}
