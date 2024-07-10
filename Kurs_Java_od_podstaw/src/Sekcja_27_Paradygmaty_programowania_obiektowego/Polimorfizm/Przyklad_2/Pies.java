package Sekcja_27_Paradygmaty_programowania_obiektowego.Polimorfizm.Przyklad_2;

public class Pies extends Ssak
{
    public Pies(String nazwa)
    {
        super(nazwa);
    }

    @Override
    public void wydajDzwiek()
    {
        System.out.println("hau hau");
    }

    @Override
    public void przedstawSie()
    {
        System.out.println("Jestem piesek " + nazwa);
    }
}
