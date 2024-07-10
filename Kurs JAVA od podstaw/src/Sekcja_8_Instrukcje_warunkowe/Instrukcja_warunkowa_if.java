package Sekcja_8_Instrukcje_warunkowe;

public class Instrukcja_warunkowa_if
{
    public static void main(String[] args)
    {
        // Conditional statements

        int wiek = 13;
        boolean przyszedlZTata = false;
        boolean przyszedlZMama = true;

        if(wiek >= 18)
        {
            System.out.println("Pozwól na zakup ... ");
        }
        else if(przyszedlZTata == true)
        {
            System.out.println("Od razu podaj");
        }
        else if(wiek < 18 && przyszedlZMama) // Można też bez zastosowania "== true" jeżeli zmienna boolean jest true
        {
            System.out.println("Pozwól na zakup");
        }
        else
        {
            System.out.println("Wyproś ze sklepu!");
        }
    }
}
