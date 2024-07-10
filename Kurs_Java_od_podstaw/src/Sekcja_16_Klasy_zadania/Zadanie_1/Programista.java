package Sekcja_16_Klasy_zadania.Zadanie_1;
/*
Zadanie 1: Utwórz klasę o nazwie "Programista", a w niej:

a) pola: imie, nazwisko, jezyk, zarobki
b) metody: pobierzImie(), pobierzNazwisko(), pobierzJezyk(), pobierzWynagrodzenie(), które będą zwracać dane z odpowiednich pól
c) konstruktor, przyjmujący i ustawiający wartości dla wszystkich pól klasy z argumentami: podajImie, podajNazwisko, podajJezyk, podajZarobki
d) pola będą prywatne a metody i konstruktor publiczne
e) przetestuj wszystko w main: utwórz obiekt z uzupełnionymi danymi i wywołaj metody, wypisując dane na ekran
 */
public class Programista
{
    private String imie;
    private String nazwisko;
    private String jezyk;
    private double zarobki;

    Programista(String podajImie, String podajNazwisko, String podajJezyk, double podajWynagrodzenie)
    {
        imie = podajImie;
        nazwisko = podajNazwisko;
        jezyk = podajJezyk;
        zarobki = podajWynagrodzenie;
    }

    public void pobierzImie()
    {
        System.out.println("Imię: " + imie);
    }

    public void pobierzNazwisko()
    {
        System.out.println("Nazwisko: " + nazwisko);
    }

    public void pobierzJezyk()
    {
        System.out.println("Język: " + jezyk);
    }

    public void pobierzWynagrodzenie()
    {
        System.out.println("Wynagrodzenie: " + zarobki);
    }
}
