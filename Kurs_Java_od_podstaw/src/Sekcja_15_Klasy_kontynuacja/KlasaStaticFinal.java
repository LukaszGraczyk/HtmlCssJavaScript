package Sekcja_15_Klasy_kontynuacja;

public class KlasaStaticFinal
{
    public int pole;
    public static int poleStatic;   // Pole static zostanie utworzone w pamięci tylko raz. Wszystkie obiekty odwołują się do tego jednego pola.
                                    // Dla pola static nie trzeba odwoływać się do niego poprzez obiekt.

    public static void metodaStatyczna() // Metoda statyczna. Można się w niej odwołać do pola statycznego. Do niestatycznego nie można.
    {
        System.out.println("Wypisano z metody statycznej");
    }
    public final int poleFinal = 123; // Gdy mamy final nie da się zmienić  wartości tego pola.
    public static final String JAKIS_TEKST = "Dowolny tekst";

}
