package Sekcja_27_Paradygmaty_programowania_obiektowego.Enkapsulacja;

public class Osoba
{
    private String imie;
    private String nazwisko;
    private int pesel;

    public String getImie() // Getter
    {
        return this.imie;
    }

    public String getNazwisko() // Geter
    {
        return this.nazwisko;
    }

    public void setImie(String imie) // Seter
    {
        this.imie = imie;
    }

    public void setNazwisko(String imie) // Seter
    {
        this.nazwisko = nazwisko;
    }

    public int getPesel()
    {
        return pesel;
    }
}
