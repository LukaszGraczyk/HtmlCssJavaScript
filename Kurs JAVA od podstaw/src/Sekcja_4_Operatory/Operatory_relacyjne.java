package Sekcja_4_Operatory;

public class Operatory_relacyjne
{
    public static void main(String[] args)
    {
        // Relational operators

        boolean wynik;

        // Sprawdzenie czy wartości są równe

        wynik = 8 == 8;
        System.out.println("8 = 8: " + wynik);

        wynik = 8 == 3;
        System.out.println("8 = 3: " + wynik);

        // Sprawdzenie czy wartości nie są równe

        wynik = 3 != 8;
        System.out.println("3 != 8: " + wynik);

        wynik = 8 != 8;
        System.out.println("8 != 8: " + wynik);

        // Sprawdzenie czy wartości są mniejsze lub większe

        wynik = 3 <= 8;
        System.out.println("3 <= 8: " + wynik);

        wynik = 3 > 8;
        System.out.println("3 > 8: " + wynik);

        // Sprawdzenie czy zmienne są równe

        int a = 5;
        int b = 6;

        wynik = a==b;
        System.out.println("a == b: " + wynik);

    }
}
