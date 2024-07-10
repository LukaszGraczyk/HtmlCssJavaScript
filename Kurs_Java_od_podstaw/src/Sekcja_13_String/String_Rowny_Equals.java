package Sekcja_13_String;

public class String_Rowny_Equals
{
    public static void main(String[] args)
    {
        String stringLiteral1 = "tekst";
        String stringLiteral2 = "tekst";

        // Porównanie stringów w postaci literal przy użyciu typu prostego boolean:
        boolean wynik = stringLiteral1 == stringLiteral2;
        System.out.println("stringLiteral1 == stringLiteral2: " + wynik);

        String stringObject1 = new String("tekst");
        String stringObject2 = new String("tekst");

        // Porównanie stringów w postaci object przy użyciu typu prostego boolean:
        wynik = stringObject1 == stringObject2;
        System.out.println("stringObject1 == stringObject2: " + wynik);

        // Porównanie stringów w postaci object i literal przy użyciu typu prostego boolean:
        wynik = stringObject1 == stringLiteral1;
        System.out.println("stringObject1 == stringLiteral1: " + wynik);

        // Porównanie stringów w postaci literal przy użyciu metody equals:
        wynik = stringLiteral1.equals(stringLiteral2);
        System.out.println("stringLiteral1.equals(stringLiteral2): " + wynik);

        // Porównanie stringów w postaci object przy użyciu metody equals:
        wynik = stringObject1.equals(stringObject2);
        System.out.println("stringObject1.equals(stringObject2): " + wynik);

        // Porównanie stringów w postaci object i literal przy użyciu metody equals:
        wynik = stringObject1.equals(stringLiteral1);
        System.out.println("stringObject1.equals(stringLiteral1): " + wynik);


    }
}
