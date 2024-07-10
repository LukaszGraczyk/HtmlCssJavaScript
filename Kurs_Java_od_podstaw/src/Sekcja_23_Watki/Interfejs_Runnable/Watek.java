package Sekcja_23_Watki.Interfejs_Runnable;

public class Watek implements Runnable
{
    @Override
    public void run()
    {
        for(int i = 0 ; i <= 1000 ; i++)
        {
            System.out.println("Pierwszy wątek: " + i);
        }
    }
}
