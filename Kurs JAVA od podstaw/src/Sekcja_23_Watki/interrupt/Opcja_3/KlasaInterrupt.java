package Sekcja_23_Watki.interrupt.Opcja_3;

public class KlasaInterrupt implements Runnable
{
    private boolean watekDziala;

    @Override
    public void run()
    {
        watekDziala = true;
        while(watekDziala)
        {
            System.out.println("Wątek działa");
        }
        System.out.println("Koniec działania wątku");
    }

    public void zakonczWatek(boolean watekDziala)
    {
        this.watekDziala = watekDziala;
    }
}
