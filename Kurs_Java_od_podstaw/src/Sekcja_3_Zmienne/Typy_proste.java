package Sekcja_3_Zmienne;

public class Typy_proste
{
    public static void main(String[] args)
    {
        // Primitive types
        // 1 bajt = 8 bitów


        // Liczby całkowite

        byte zmiennaByte = 10;
        System.out.println("Byte: " + zmiennaByte);
        System.out.println(Byte.MIN_VALUE + " " + Byte.MAX_VALUE);

        short zmiennaShort = 200;
        System.out.println("Short: " + zmiennaShort);
        System.out.println(Short.MIN_VALUE + " " + Short.MAX_VALUE);

        int zmiennaInt = 1000000;
        System.out.println("Int: " + zmiennaInt);
        System.out.println(Integer.MIN_VALUE + " " + Integer.MAX_VALUE);

        long zmiennaLong = 10000000000000000L; // Trzeba dopisywać na końcu literkę "L"
        System.out.println("Long: " + zmiennaLong);
        System.out.println(Long.MIN_VALUE + " " + Long.MAX_VALUE);


        // Liczby zmiennoprzecinkowe

        float zmiennaFloat = 12.344444444444f; // Trzeba dopisywać na końcu literkę "f" // Miniejsza precyzja niż double
        System.out.println("Float: " + zmiennaFloat); // Float jest rozmiaru 32-bitowego

        double zmiennaDouble = 12.344444444444; // Większa precyzja niż float
        System.out.println("Double: " + zmiennaDouble); // Double jest rozmiaru 64-bitowego


        // Pojedyncze znaki

        char zmiennaChar = 'A';
        char zmiennaChar2 = 'B';
        char zmiennaChar3 = 'C';
        char zmiennaChar4 = '!';
        char zmiennaChar5 = '3';

        System.out.println("Char: " + zmiennaChar);


        // Wartości logiczne

        boolean zmiennaBoolean = false;
        System.out.println("Boolean: " + zmiennaBoolean);



    }
}
