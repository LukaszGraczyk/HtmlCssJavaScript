package Sekcja_13_String;

public class String_Literal_Object
{
    public static void main(String[] args)
    {
        // Te dwa różne stringi str1 oraz str2 zawierając identyczne teksty odnoszą się do tego samego miejsca w pamięci:

        String str1 = "jakiś tekst";
        String str2 = "jakiś tekst";


        // Te dwa różne stringi przezKonstruktor1 oraz przezKonstruktor2 zawierając identyczne teksty NIE odnoszą się
        // do tego samego miejsca w pamięci ponieważ "powołane zostały do życia" przez konsytruktor:

        String przezKonstruktor1 = new String("tekst");
        String przezKonstruktor2 = new String("tekst");
    }
}
