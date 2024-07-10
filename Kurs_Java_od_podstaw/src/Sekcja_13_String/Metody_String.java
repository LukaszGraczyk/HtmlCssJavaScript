package Sekcja_13_String;

public class Metody_String
{
    public static void main(String[] args)
    {
        String tekst = "Jakiś tekst";
        System.out.println("Length: " + tekst.length()); // Wypisanie długości tekstu w stringun
        System.out.println("isEmpty: " + tekst.isEmpty()); // Wypisanie czy string jest pusty

        char pojedynczyZnak = tekst.charAt(6); // Przypisanie do zmiennej char znaku znajdującego się na 6 pozycji w stringu "tekst"
        System.out.println("charAt: " + pojedynczyZnak);

        // substring
        System.out.println("Ucięty do szóstego znaku tekst stringa: " + tekst.substring(6));
        System.out.println("Ucięty do szóstego znaku tekst stringa oraz od ósmego znaku: " + tekst.substring(6,8));

        String nowyString = "   abcdefghijk                 ";
        System.out.println("nowyString: " + "." + nowyString + ".");
        System.out.println("nowyString z usunietymi spacjami: " + "." + nowyString.trim() + "."); // Metoda trim

        // Zwiększanie i zmniejszanie znaków
        String rozneWielkosci = "Różne litery DUŻE i małe HaHAha";
        System.out.println(rozneWielkosci);
        System.out.println("Przestawienie liter z dużych na małe: " + rozneWielkosci.toLowerCase());
        System.out.println("Przestawienie liter z małych na duże: " + rozneWielkosci.toUpperCase());

        // Przeszukanie tekstu
        String czyZawiera = "tekst do przeszukania";
        System.out.println("Czy zawiera szukany tekst: " + czyZawiera.startsWith("przeszukania")); // Nie działa bo szuka od początku tekstu
        System.out.println("Czy zawiera szukany tekst: " + czyZawiera.startsWith("tekst"));
        System.out.println("Czy zawiera szukany tekst: " + czyZawiera.endsWith("przeszukania")); // Działa bo szuka od końca
        System.out.println("Czy zawiera szukany tekst: " + czyZawiera.contains("do")); // Przeszukuje cały tekst

        // Podmiana znaku w tekście
        System.out.println("Podmiana: " + czyZawiera.replace('t','k'));
        System.out.println(czyZawiera); // Tekst z stringu po zastosowaniu metody replace docelowo nie zmienił się
    }
}
