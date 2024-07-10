package Sekcja_10_Petle;

public class Petla_for
{
    public static void main(String[] args)
    {
        // Loops

        int liczenie;

        for(liczenie = 1 ; liczenie <=10 ; liczenie++)
        {
            System.out.println("Przykładowy tekst" + liczenie);
        }
        System.out.println("Poza pętlą: " + liczenie);  // Jeżeli przedrostek int zmiennej liczenie byłby
                                                        // wewnątrz nawiasu pętli for zamiast tak jak ma to miejsce
                                                        // teraz to tutaj nie można wtedy stosować zmiennej liczenie
                                                        // poza pętlą
    }
}
