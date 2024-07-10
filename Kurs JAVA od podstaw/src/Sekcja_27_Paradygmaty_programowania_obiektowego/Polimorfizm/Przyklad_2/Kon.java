package Sekcja_27_Paradygmaty_programowania_obiektowego.Polimorfizm.Przyklad_2;

public class Kon extends Ssak
{
    public Kon(String nazwa)
    {
        super(nazwa);
    }

    @Override
    public void wydajDzwiek()
    {
        System.out.println("ihaha");
    }

    @Override
    public void przedstawSie()
    {
        System.out.println("Jestem konik " + nazwa);
    }
}
