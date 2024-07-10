package Sekcja_23_Watki.join_isAlive;

public class MainJoinIsAlive
{
    public static void main(String[] args)
    {
        System.out.println("Start program");
        Thread watek = new Thread(new Runnable(){
            public void run()
            {
                for(int i = 0 ; i <= 3 ; i++)
                {
                    System.out.println("Licznik: " + i);
                    try
                    {
                        Thread.sleep(1000); // Sleep umożliwia nadanie opóźnienia w wykonywaniu kodu
                    }
                    catch (InterruptedException e){}
                }
            }
        });
        watek.start();

        System.out.println("Sprawdzenie przed join czy wątek żyje: " + watek.isAlive());

        // Join umożliwia zatrzymanie wykonywania kodu znajdującego się po nim do momentu wykonania się wątku
        try {watek.join();} catch (InterruptedException e) {}

        System.out.println("Sprawdzenie po join czy wątek żyje: " + watek.isAlive());

        System.out.println("Stop program");
    }
}
