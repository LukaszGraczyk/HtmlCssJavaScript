package Sekcja_23_Watki.Ponowne_uruchomienie_watku;

public class KlasaPonowneUruchomienieWatku implements Runnable
{
    @Override
    public void run() {
        for(int i = 0 ; i <= 5 ; i++)
        {
            System.out.println("Wątek pracuje: " + i);
        }
    }
}
