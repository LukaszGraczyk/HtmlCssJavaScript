package Sekcja_12_Klasy;

public class KlasaDlaMetod
{
    // typZwracany nazwaMetody(parametry) {}

    void metodaKtoraNicNieZwraca()
    {
        System.out.println("Wartość wypisana z metody");
    } // 1

    void metodaKtorePrzyjmujeArgument(int liczba, char znak) // liczba i znak to prametry // 2
    {
        System.out.println("Wartość z metody: " + liczba + znak);
    }

    int dodawanie (int a, int b) // Metoda zwracająca wynik // 3
    {
        int wynik = a + b;
        return wynik;
    }

    double dodajCosPoPrzecinku(double liczbaDouble) // 4
    {
        double wynik = liczbaDouble + 0.55;            // Zmienna wynik jest widoczna tylko w obrębie nawiasów metody
        return wynik;                                  // Może powtarzać się nazewnictwo zmiennych w kolejnych metodach
    }

    int metodaKolejna() // Elemet zwracany przez metodę musi być tego samego typu co metoda np. int // 5
    {
        System.out.println("Tekst");
        return 100;
    }
}
