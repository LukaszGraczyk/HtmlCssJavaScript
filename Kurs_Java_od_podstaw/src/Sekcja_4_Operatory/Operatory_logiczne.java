package Sekcja_4_Operatory;

public class Operatory_logiczne
{
    public static void main(String[] args)
    {
        // Logical operators

        int wiek = 20;

        // Koniunkcja (AND) &&
        System.out.println(wiek >= 18 && wiek < 30);
        System.out.println(wiek > 21 && wiek < 30);

        // Alternatywa (OR) ||
        System.out.println(wiek < 18 || wiek > 65);
        System.out.println(wiek > 18 || wiek < 65);

        // Negacja
        boolean prawda = true;
        System.out.println("!prawda: " + !prawda);

        boolean falsz = false;
        System.out.println("!falsz: " + !falsz);

    }
}
