package Sekcja_23_Watki.interrupt.Opcja_2;

public class KlasaInterrupt implements Runnable
{
    @Override
    public void run()
    {
        while(!Thread.interrupted()) // Wątek ma działać aż nie zostanie przerwany
        {
            System.out.println("Wątek działa");
        }
        System.out.println("Koniec działania wątku");
    }
}
