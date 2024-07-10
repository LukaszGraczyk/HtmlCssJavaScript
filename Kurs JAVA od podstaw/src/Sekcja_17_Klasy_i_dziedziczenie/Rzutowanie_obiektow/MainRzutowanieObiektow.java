package Sekcja_17_Klasy_i_dziedziczenie.Rzutowanie_obiektow;

public class MainRzutowanieObiektow
{
    public static void main(String[] args)
    {
        KlasaRozszerzona klasaRozszerzona = new KlasaRozszerzona();
        klasaRozszerzona.ustawLiczba(888);
        klasaRozszerzona.wyswietlLiczba();

        KlasaPodstawowa klasaPodstawowa = (KlasaPodstawowa) klasaRozszerzona; // Rzutowanie obiektu
        klasaPodstawowa.wyswietlLiczba();
    }
}

// Jeżeli klasa dziedziczy po innej klasie to można ją zrzutować na dany typ.