package Sekcja_12_Klasy;

public class Metody
{
    public static void main(String[] args)
    {
        // Methods

        KlasaDlaMetod nazwaObiektu = new KlasaDlaMetod();
        nazwaObiektu.metodaKtoraNicNieZwraca(); // 1
        nazwaObiektu.metodaKtorePrzyjmujeArgument(5,'b'); // liczba 5 oraz znak "b" to argumenty // 2

        int wynikDodawania = nazwaObiektu.dodawanie(5,5); // Wywołanie metody zwracającej wynik i przypisanie go do zmiennej // 3
        System.out.println("Wynik dodawania: " + wynikDodawania);

        double wynikKolejnejMetody = nazwaObiektu.dodajCosPoPrzecinku(1.20); // 4
        System.out.println("Wynik dodania czegoś po przecinku: " + wynikKolejnejMetody);

        nazwaObiektu.metodaKolejna(); // 5
    }
}
