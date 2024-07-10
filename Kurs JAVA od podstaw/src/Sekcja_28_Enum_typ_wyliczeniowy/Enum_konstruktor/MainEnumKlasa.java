package Sekcja_28_Enum_typ_wyliczeniowy.Enum_konstruktor;

public class MainEnumKlasa
{
    public static void main(String[] args)
    {
        Pizza pizza1 = Pizza.XXL;
        System.out.println("Zamówiłeś pizze: " + pizza1 + " " + pizza1.pobierzRozmiar() + "cm");
        System.out.println("Cena to: " + pizza1.pobierzCene());
    }
}
