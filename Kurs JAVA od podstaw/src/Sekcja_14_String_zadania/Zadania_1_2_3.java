package Sekcja_14_String_zadania;

public class Zadania_1_2_3
{
    public static void main(String[] args)
    {
        /*
        Zadanie 1: Utwórz trzy zmienne typu String. Do pierwszej przypisz swoje imię, do drugiej nazwisko
        oraz do trzeciej imię i nazwisko oddzielone spacją. Następnie wykonaj polecenia używając
        odpowiednich metod z String (nie robić nic ręcznie!) i wypisując informacje na ekran:

        a) wypisz ile znaków zawiera zmienna przechowująca imię, ile nazwisko a ile imię i nazwisko
        b) sprawdź czy Twoje imię jest równe "Alicja" lub "Jan"
        c) wypisz nazwisko z WIELKICH LITER
        d) zamień w nazwisku litery 'a' na 'e' i zobacz czy coś się zmieniło

        Zadania 2: Dla zdania "Potrafię coraz więcej z programowania." wypisz każdy znak w osobnej linii, czyli:

        P
        o
        t
        r
        a
        f
        i
        ę

        c
        o
        r
        a
        z
        ... itd.

        Zadanie 3: Tym razem powyższe zdanie „Potrafię coraz więcej z programowania.”
        napisz od tyłu „.ainawomargorp z jecęiw zaroc ęifartoP”
         */

        // Zadanie 1:

        String imie = "Łukasz";
        String nazwisko = "Graczyk";
        String imieINazwisko = "Łukasz Graczyk";

        System.out.println("Ilość znaków w imieniu: " + imie.length());
        System.out.println("Ilość znaków w nazwisku: " + nazwisko.length());
        System.out.println("Ilość znaków w imieniu i nazwisku: " + imieINazwisko.length());

        boolean wynik = imie == "Alicja" || imie == "Jan";
        System.out.println("Moje imie to Alicja lub Jan: " + wynik);

        System.out.println("Moje nazwisko DUŻYMI literami to: " + nazwisko.toUpperCase());
        
        nazwisko = nazwisko.replace('a','e');
        System.out.println("Zmiana liter a na e w nazwisku: " + nazwisko);

        // Zadanie 2:

        String napis = "Potrafię coraz więcej z programowania.";
        System.out.println("Napis pionowo: ");
        for(int i = 0 ; i <= napis.length()-1 ; i++)
        {
            System.out.println(napis.charAt(i));
        }

        // Zadanie 3:

        for(int i = napis.length()-1 ; i >= 0 ; i--)
        {
            System.out.print(napis.charAt(i));
        }




    }
}
