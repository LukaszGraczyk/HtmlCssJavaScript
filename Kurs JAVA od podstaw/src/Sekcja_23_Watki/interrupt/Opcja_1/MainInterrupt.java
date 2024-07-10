package Sekcja_23_Watki.interrupt.Opcja_1;

public class MainInterrupt
{
    public static void main(String[] args)
    {
        Thread watek = new Thread(new KlasaInterrupt());
        watek.start();

        watek.interrupt(); // Przerwanie wątku
    }
}
