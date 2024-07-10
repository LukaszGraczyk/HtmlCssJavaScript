package Sekcja_28_Enum_typ_wyliczeniowy.Enum_konstruktor;

public enum Pizza
{
    // W klasie Enum tworzymy tzw. elementy będące Static Final

    MALA(20, 9.90f), // Możemy pizzom nadać cechy takie jak rozmiar w cm
    DUZA(34, 19.99f),
    FAMILIJNA(42, 29.99f),
    XXL(50, 38.99f); // Po ostatnim enumie dajemy średnik

    private int rozmiar;
    private float cena;

    private Pizza (int rozmiar, float cena)

    {
        this.rozmiar = rozmiar;
        this.cena = cena;
    }

    public int pobierzRozmiar()
    {
        return this.rozmiar;
    }

    public float pobierzCene()
    {
        return this.cena;
    }
}
