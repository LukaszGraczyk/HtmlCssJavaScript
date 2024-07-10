package Sekcja_22_Klasy_abstrakcyjne_interfejsy_inne_zadania.Zadanie_2;
/*
Zadanie 2
- stwórz interfejs o nazwie "Figury", który będzie posiadał metody “obwod”, “pole”. Obydwie metody będą zwracały liczbę zmiennoprzecinkową
- stwórz dwie klasy “Kolo”, “Prostokat”, które będą implementowały ten interfejs
- dodaj konstruktor, w którym w klasie “Kolo” będzie przekazywany promień koła, a w klasie “Prostokat” długości dwóch boków prostokąta a i b
- zaimplementuj metody w obydwóch klasach, aby dokonywały poprawnych obliczeń
- pola będą prywatne a konstruktor i metody publiczne
- przetestuj w main
 */
public class MainZadanie2
{
    public static void main(String[] args)
    {
        Kolo kolo = new Kolo(1);
        System.out.println("Pole koła: " + kolo.poleFigury());
        System.out.println("Obwód koła: " + kolo.obwodFigury());

        Prostokat prostokat = new Prostokat(1,2);
        System.out.println("Pole prostokąta: " + prostokat.poleFigury());
        System.out.println("Obwód prostokąta: " + prostokat.obwodFigury());
    }
}
