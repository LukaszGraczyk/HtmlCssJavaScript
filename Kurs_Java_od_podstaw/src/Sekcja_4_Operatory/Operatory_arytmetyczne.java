package Sekcja_4_Operatory;

public class Operatory_arytmetyczne
{
    public static void main(String[] args)
    {
        // Arithmetic operators

        System.out.println(3 + 5);
        System.out.println(5 - 3);
        System.out.println(2 * 4);
        System.out.println(4 / 2);
        System.out.println(10 % 3); // Reszta z dzielenia 10 przez 3
        System.out.println(10 % 2); // Reszta z dzielenia 10 przez 2

        double a = 10;
        double b = 2;
        double c = 4;
        double d = 3;
        double e = 8;
        double f = 9;
        double i = 1;

        double dodawanie = a + b;
        System.out.println("Dodawanie: " + dodawanie);
        double odejmowanie = a - b;
        System.out.println("Odejmowanie: " + odejmowanie);
        double mnozenie = a * b;
        System.out.println("Mnozenie: " + mnozenie);
        double dzielenie = a / b;
        System.out.println("Dzielenie: " + dzielenie);
        double resztaZDzielenia = a % b;
        System.out.println("Reszta z dzielenia: " + resztaZDzielenia);

        a = a + b; // Atualizacja wartości zmiennej (1 sposób)
        System.out.println("a = a + b: " + a);

        b += c; // Atualizacja wartości zmiennej (2 sposób)
        System.out.println("b = b + c: " + b);

        d *= c; // Atualizacja wartości zmiennej (2 sposób)
        System.out.println("d = d * c: " + d);

        e /= c; // Atualizacja wartości zmiennej (2 sposób)
        System.out.println("e = e/c: " + e);

        f %= c; // Atualizacja wartości zmiennej (2 sposób)
        System.out.println("f = f % c: " + f);

        i = i + 1;
        System.out.println("i = i + 1: " + i);
        i += 1;
        System.out.println("i += 1: " + i);
        i++; // Inkrementacja (najpierw następuje pobranie wartości i a następnie zwiększenie jej o 1)
        System.out.println("i++: " + i);
        i--; // Dekrementacja (najpierw następuje pobranie wartości i a następnie zmniejszenie jej o 1)
        System.out.println("i--: " + i);
        ++i; // (najpierw następuje zwiększenie o 1 a następnie pobranie wartości i)
        System.out.println("++i: " + i);
        --i; // (najpierw następuje zmniejszenie o 1 a następnie pobranie wartości i)
        System.out.println("--i: " + i);

    }
}
