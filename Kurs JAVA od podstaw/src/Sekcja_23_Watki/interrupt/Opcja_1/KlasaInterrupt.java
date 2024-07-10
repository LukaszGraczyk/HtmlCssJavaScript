package Sekcja_23_Watki.interrupt.Opcja_1;

public class KlasaInterrupt implements Runnable
{
    @Override
    public void run()
    {
        while(true)
        {
            System.out.println("Wątek Sleep");
            try {Thread.sleep(1000);} catch (InterruptedException e) {System.out.println("Obsługa wyjątku");}
            //return; // Jeżeli damy return to wątek nie zostanie przerwany na chwilę tylko na zawsze
            //break; // Jeżeli damy break to wątek nie zostanie przerwany na chwilę tylko na zawsze
        }
    }
}
