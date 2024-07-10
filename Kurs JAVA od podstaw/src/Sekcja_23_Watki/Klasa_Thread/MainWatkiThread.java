package Sekcja_23_Watki.Klasa_Thread;

public class MainWatkiThread
{
    public static void main(String[] args)
    {
        // Thread
        MojPierwszyWatek mojPierwszyWatek = new MojPierwszyWatek();
        MojDrugiWatek mojDrugiWatek = new MojDrugiWatek();
        mojPierwszyWatek.start();
        mojDrugiWatek.start();
    }
}
