package Sekcja_21_Klasy_abstrakcyjne_interfejsy_i_inne.Klasa_wewnetrzna;

public class KlasaZewnetrzna
{
    int poleZewnetrzne;

    int metodaZewnetrzna()
    {
        Wewnetrzna obiekt = new Wewnetrzna();   // Można odwoływać się i wywoływać pola i metody z klasy wewnętrznej w zewnętrznej
        obiekt.metodaWewnetrzna();              // jedynie przy użyciu obiektu
        return -1;
    }

    class Wewnetrzna
    {
        int poleWewnetrzna;

        int metodaWewnetrzna()
        {
            metodaZewnetrzna(); // Można wywołać metodę zewnętrzną w wewnętrznej
            poleZewnetrzne = 101; // Mogę przypisać wartość do pola zewnętrznego w klasie wewnętrznej
            return -2;
        }

    }
}

// Nie można w klasie zewnętrznej odnosić się i wywoływać pól i metod z klasy wewnętrznej.