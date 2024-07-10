package Sekcja_27_Paradygmaty_programowania_obiektowego.Polimorfizm.Przyklad_2;

public class Osoba
{
    private Zwierze zwierze;

    public void przygarnijZwierze(Zwierze zwierze)
    {
        this.zwierze = zwierze;
    }

    public void jakNazwywaSieTwojeZwierzatko()
    {
        if(zwierze!=null)
        {
            zwierze.przedstawSie();
        }
        else
        {
            System.out.println("Nie mam zwierzątka");
        }
    }
}
