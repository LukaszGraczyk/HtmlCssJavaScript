package Sekcja_8_Instrukcje_warunkowe;

public class Instrukcja_warunkowa_switch
{
    public static void main(String[] args)
    {
        // Switch

        /*
        Instrukcja switch może być wykonywana dla typów prymitywnych int,long,double,pojedynczych znaków char itp.
        */

        int zmienna = 3;
        switch(zmienna)
        {
            case 1:
                System.out.println("Jeden");
                break;                          // Jeżeli pominiemy "break" to wykonają się wszytkie case'y
            case 2:                             // po case w którym następuje zgodność warunku
                System.out.println("Dwa");
                break;
            case 3:
                System.out.println("Trzy");
                break;
            default:
                System.out.println("Nie spełniono warunku");
                break;
        }

        char znak = 'a';
        switch(znak)
        {
            case 'a':
                System.out.println("Małe a");
                break;
            case 'A':
                System.out.println("Duże A");
                break;
            default:
                System.out.println("Nie znam tego znaku");
                break;
        }

        int aktualnyMiesiac = 5;
        switch(aktualnyMiesiac)
        {
            default:
                System.out.println("Do końca roku zostały następujące miesiące: ");
            case 1:
                System.out.println("Sty");
            case 2:
                System.out.println("Lut");
            case 3:
                System.out.println("Mar");
            case 4:
                System.out.println("Kwi");
            case 5:
                System.out.println("Maj");
            case 6:
                System.out.println("Cze");
            case 7:
                System.out.println("Lip");
            case 8:
                System.out.println("Sie");
            case 9:
                System.out.println("Wrz");
            case 10:
                System.out.println("Paź");
            case 11:
                System.out.println("Lis");
            case 12:
                System.out.println("Gru");

        }
    }
}
