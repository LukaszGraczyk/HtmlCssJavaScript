package Sekcja_13_String;

public class Klasa_String
{
    public static void main(String[] args)
    {
        String nazwaDlaStringa = "Nazwa dla Stringa";
        System.out.println(nazwaDlaStringa);

        String kolejnyString = "String drugi";
        System.out.println(nazwaDlaStringa + " " + kolejnyString);

        String sumaStringow = nazwaDlaStringa + " " + kolejnyString;
        System.out.println("Suma stringów: " + sumaStringow);
    }
}
