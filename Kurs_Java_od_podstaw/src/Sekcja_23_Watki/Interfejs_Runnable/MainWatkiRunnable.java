package Sekcja_23_Watki.Interfejs_Runnable;

public class MainWatkiRunnable
{
    public static void main(String[] args)
    {
        // Wątki stosujące interfejs Runnable poprzez implementację w klasach
        Thread watek1 = new Thread(new Watek());
        Thread watek2 = new Thread(new Watek2());

        watek1.start();
        watek2.start();

        // Zastosowanie klasy anonimowej do utworzenia wątku3
        // Zbędne jest w tym przypadku tworzenie oddzielnej klasy dla wątku3
        // Wszystko odbywa się w main
        Thread watek3 = new Thread(new Runnable() {
            @Override
            public void run()
            {
                for(int i = 0 ; i <= 1000 ; i++)
                {
                    System.out.println("Trzeci wątek: " + i);
                }
            }
        });
        watek3.start();

        // Wątek stworzony tak że nie przypisujemy żadnej zmiennej
        new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i = 0 ; i <= 1000 ; i++)
                {
                    System.out.println("Czwarty wątek: " + i);
                }
            }
        }).start();
    }
}
