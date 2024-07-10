package Sekcja_27_Paradygmaty_programowania_obiektowego.Polimorfizm.Przyklad_1;

public class Main
{
    public static void main(String[] args)
    {
        // Polimorfizm

        Zwierzotko zwierze = new Konik();
        zwierze.wydajDzwiek();

        zwierze = new Piesek();
        zwierze.wydajDzwiek();
    }
}
