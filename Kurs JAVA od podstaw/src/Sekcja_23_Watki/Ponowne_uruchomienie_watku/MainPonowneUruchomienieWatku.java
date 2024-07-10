package Sekcja_23_Watki.Ponowne_uruchomienie_watku;

public class MainPonowneUruchomienieWatku
{
    public static void main(String[] args)
    {
        Thread watek = new Thread(new KlasaPonowneUruchomienieWatku());
        watek.start();

        // watek.start();
        // Nie możemy wykonać startu tego samego wątku na tym samym obiekcie
        // Musimy stworzyć nowy obiekt

        Thread watek2 = new Thread(new KlasaPonowneUruchomienieWatku());
        watek2.start();

    }
}
