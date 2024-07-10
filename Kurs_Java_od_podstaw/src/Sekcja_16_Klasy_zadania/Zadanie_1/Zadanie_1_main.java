package Sekcja_16_Klasy_zadania.Zadanie_1;

public class Zadanie_1_main
{
    public static void main(String[] args)
    {
        Programista programista = new Programista("Jan", "Kowalski", "Polski", 1500);

        programista.pobierzImie();
        programista.pobierzNazwisko();
        programista.pobierzJezyk();
        programista.pobierzWynagrodzenie();
    }
}
