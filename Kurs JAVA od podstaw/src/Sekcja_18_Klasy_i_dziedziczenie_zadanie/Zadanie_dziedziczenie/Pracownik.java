package Sekcja_18_Klasy_i_dziedziczenie_zadanie.Zadanie_dziedziczenie;

public class Pracownik extends Osoba
{
    protected String stanowisko;
    protected String nazwaFirmy;

    public Pracownik(String imie, String nazwisko, String stanowisko, String nazwaFirmy)
    {
        super(imie, nazwisko); // Odwołując się do konstruktora z klasy nadrzędnej musimy umieścić to polecenie na początku
        this.stanowisko = stanowisko;
        this.nazwaFirmy = nazwaFirmy;
    }

    @Override
    public void przedstawSie() {
        System.out.println("Jestem " + imie + " " + nazwisko + " i pracuję w firmie " + nazwaFirmy + " na stanowisku " + stanowisko);
    }
}
