package Sekcja_15_Klasy_kontynuacja;

public class NazwaKlasy
{
    // Pola
    public static final String NAZWA_STRING = "nazwa string";
    private String polePrywatneString = "jakis prywatny tekst";
    int nazwaZmiennej = 22;

    // Konstruktor
    public NazwaKlasy()
    {

    }


    // Metody
    public void nazwaMetodaVoid()
    {
        int nazwaZmiennej = 44;
        System.out.println("Wypisałem z metody void");
        metodaZwracaInta(5); // Odwołanie do drugiej metody, która musi znajdować się pod tą metodą
        System.out.println(nazwaZmiennej); // Pokaże się wartość 44
        System.out.println(this.nazwaZmiennej); // Pokaże się wartość 22
    }

    private int metodaZwracaInta(int a)
    {
        return a;
    }

    private String metodaZwracaInta(String b)   // Mimo, że metoda powiela nazwę powyższej metody to może tak być
    {                                           // ponieważ przyjmuje parametr innego typu
        return b;
    }

    private int metodaZwracaInta(int c, String d)   // Mimo, że metoda powiela nazwę powyższej metody to może tak być
    {                                               // ponieważ przyjmuje inną ilość parametrów
        return c;
    }

    public void drugaMetoda()
    {
        int nazwaZmiennej = 33; // Zmienna o takiej nazwie istnieje w metodzie powyżej, ale to nie przeszkadza
    }
}
