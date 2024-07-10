package Sekcja_28_Enum_typ_wyliczeniowy.Enum;

public class MainEnum
{
    public static void main(String[] args)
    {
        KierunkiSwiata kierunek = KierunkiSwiata.POLNOC;
        System.out.println(kierunek);

        if(kierunek == KierunkiSwiata.POLNOC)
        {
            System.out.println("Poszedł na północ");
        }
        else if(kierunek.equals(KierunkiSwiata.POLUDNIE)) // Można porównać też przez equals
        {
            System.out.println("Poszedł na południe");
        }
        else
        {
            System.out.println("Niewłaściwy kierunek");
        }

        System.out.println();

        System.out.println("Switch:");
        switch (kierunek)
        {
            case POLNOC:
                System.out.println("Poszedł na północ");
                break;
            case POLUDNIE:
                System.out.println("Poszedł na południe");
                break;
        }

        System.out.println();

        // ordinal(), value0f(), values()
        KierunkiSwiata kierunek2 = KierunkiSwiata.POLUDNIE;

        // ordinal() pokazuje kolejność poszczególnych elementów klasy enum licząc od zera
        // Następuje zamiana enum na int
        System.out.println("ordinal(): " + kierunek2.ordinal());

        // value0f() zamienia string na enum
        KierunkiSwiata kierunek3 = KierunkiSwiata.valueOf("POLUDNIE");
        System.out.println("valueOf(): " + kierunek3);

        System.out.println();

        // values() wypisuje wszystkie enumy
        KierunkiSwiata[] tab = KierunkiSwiata.values();
        for(int i = 0 ; i<=1 ; i++)
        {
            System.out.println("i: " + i + ", kierunek: " + tab[i]);
        }

        System.out.println();

        KierunkiSwiata kierunek4 = KierunkiSwiata.values()[1];
        System.out.println("values()[1]: " + kierunek4);

    }
}
