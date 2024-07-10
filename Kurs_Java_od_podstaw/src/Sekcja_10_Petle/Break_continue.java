package Sekcja_10_Petle;

public class Break_continue
{
    public static void main(String[] args)
    {
        int zmienna;
        for(zmienna = 1 ; zmienna <= 10 ; zmienna++)
        {
            if (zmienna == 8) // Istrukcja for nie wykonuje się dla 8
            {
                continue;
            }
            System.out.println("Zmienna: " + zmienna);
        }

        for(zmienna = 1 ; zmienna <= 10 ; zmienna++)
        {
            if (zmienna > 8) // Istrukcja for nie wykonuje się dla iteracji większych niż 8
            {
                continue;
            }
            System.out.println("Zmienna: " + zmienna);
        }

        for(zmienna = 1 ; zmienna <= 10 ; zmienna++)
        {
            if (zmienna == 8) // Istrukcja przerywa się dla 8
            {
                break;
            }
            System.out.println("Zmienna: " + zmienna);
        }
    }
}
