package Sekcja_23_Watki.interrupt.Opcja_3;

public class MainInterrupt
{
    public static void main(String[] args) throws InterruptedException // Zastosowano throws zamiast try/catch dla wyjątku dla sleep
    {
        KlasaInterrupt watekKlasaInterrupt = new KlasaInterrupt();
        Thread watek = new Thread(watekKlasaInterrupt);
        watek.start();

        Thread.sleep(2000);

        watekKlasaInterrupt.zakonczWatek(false); // Zatrzymanie watku po 2 sekundach


    }
}
