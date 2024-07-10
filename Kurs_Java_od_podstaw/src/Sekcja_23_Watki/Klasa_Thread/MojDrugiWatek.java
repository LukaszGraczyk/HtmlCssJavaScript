package Sekcja_23_Watki.Klasa_Thread;

public class MojDrugiWatek extends Thread // Klasa dziedziczy po klasie Thread
{
    @Override
    public void run() // Polecenie konieczne dla utworzenia wątku
    {
        for(int i = 2001 ; i <= 3000 ; i++)
        {
            System.out.println("Drugi wątek: " + i);
        }
    }
}
