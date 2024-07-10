package Sekcja_21_Klasy_abstrakcyjne_interfejsy_i_inne.Klasa_anonimowa;

public class MainKlasaAnonimowa
{
    public static void main(String[] args)
    {
        // Anonymous class
        ZwyklaKlasa obiektKlasyAnonimowej = new ZwyklaKlasa() // Klasa anonimowa
        {
            @Override
            public void metodaZwykla() // Następuje tu przesłonięcie metody ze zwykłej klasy
            {
                System.out.println("Metoda wywołana z klasy anonimowej");
            }
        };

        obiektKlasyAnonimowej.metodaZwykla();
    }
}
