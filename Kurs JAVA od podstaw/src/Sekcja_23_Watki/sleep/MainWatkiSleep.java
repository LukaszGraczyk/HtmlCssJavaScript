package Sekcja_23_Watki.sleep;

public class MainWatkiSleep
{
    public static void main(String[] args)
    {
        try {Thread.sleep(3000);} catch (InterruptedException e) {}
        Thread watekZSleep = new Thread(new Runnable(){
            public void run()
            {
                for(int i = 0 ; i <= 2000 ; i++)
                {
                    System.out.println("Wątek z sleep: " + i);
                    try
                    {
                        Thread.sleep(1000); // Sleep umożliwia nadanie opóźnienia w wykonywaniu kodu
                    }
                    catch (InterruptedException e){}
                }
            }
        });
        watekZSleep.start();
    }
}
// Sleep w tym przypadku powoduje wystąpienie wyjątka typu check
// Wyjątek ten musi być obsłużony przez try/catch