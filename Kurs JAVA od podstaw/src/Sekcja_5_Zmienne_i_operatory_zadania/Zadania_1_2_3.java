package Sekcja_5_Zmienne_i_operatory_zadania;

public class Zadania_1_2_3
{
    /*
    Zadanie 1:
    Utwórz program, w którym stworzysz zmienne i przypiszesz do tych zmiennych wartości takie jak
    Twój wiek, wzrost, waga. Niech będą w jednostkach lata, metry, kilogramy odpowiednio.
    Będziesz potrzebował 3 zmienne. Zastanów się nad nazewnictwem oraz typem zmiennych.
    Na koniec wypisz wszystko na ekran.
     */

    /*
    Zadanie 2:
    Na podstawie danych z poprzedniego zadania oblicz Twoje BMI (Body Mass Index).
    Wzór to masa / wzrost^2 (masa w kilogramach, wzrost w metrach).
     */

    /*
    Zadanie 3:
    Skonwertuj wynik z poprzedniego zdania na liczbę całkowitą. Zadanie jest szybkie,
    ale podpowiem Ci, że chcemy skonwertować liczbę zmiennoprzecinkową (np. float)
    na liczbę całkowitą (np. int).
     */

    // ---------------------------------------------------------------------------------------------------------------

    public static void main(String[] args)
    {
        int wiek = 89;
        float wzrost = 1.77f;
        float waga = 79.9f;

        System.out.println("Wiek: " + wiek + " lat");
        System.out.println("Wzrost: " + wzrost + "m");
        System.out.println("Waga: " + waga + "kg");

        // -----------------------------------------------------------------------------------------------------------

        //float bmi = waga / (wzrost * wzrost); // Zwykłe mnożenie w nawiasie identycznych elementów "wzrost"
        float bmi = waga / (float) Math.pow(wzrost,2); // Metoda "pow" z biblioteki "Math" z zastosowaniem rzutowania
        System.out.println("BMI: " + bmi);

        // -----------------------------------------------------------------------------------------------------------

        int BMI = (int) bmi; // Rzutowanie jednej zmiennej na drugą w sposób jawny
        System.out.println("BMI: " + BMI);

    }

}
