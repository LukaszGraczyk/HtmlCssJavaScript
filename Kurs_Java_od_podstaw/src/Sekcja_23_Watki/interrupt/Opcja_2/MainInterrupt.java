package Sekcja_23_Watki.interrupt.Opcja_2;

public class MainInterrupt
{
    public static void main(String[] args)
    {
        Thread watek = new Thread(new KlasaInterrupt());
        watek.start();

        try {Thread.sleep(2000);} catch (InterruptedException e) {}

        watek.interrupt(); // Przerwanie wątku po 2 sekundach
    }
}
