package Sekcja_9_Instrukcje_warunkowe_zadania;

public class Zadanie_2
{
    public static void main(String[] args)
    {
        /*
        Twoim zadaniem jest obliczenie podatku od dochodu. Obecnie wynosi on 17%. Wiemy, także doświadczeni programiści
        potrafią zarabiać pokaźne sumy, a od pewnego dochodu zwiększony jest podatek do 32%. Sprawdź ile podatku
        musiałby zapłacić początkujący programista, zanim przekroczy próg wynoszący 85 528 zł, a ile już ten doświadczony.

        Wzór:
        Dla dochodu do 85 528 zł podatek wynosi 17%,
        dla dochodu powyżej 85 528 zł liczy się go następująco:
        - obliczamy podatek 17% z 85 528,
        - dodatkowo obliczamy podatek 32% od nadwyżki ponad 85 528 zł,
        czyli dochód pomniejszony o 85 528 zł i z tego 32%.
        (oczywiście obliczamy orientacyjnie, gdyż nie bierzemy pod uwagę np. ulgi podatkowej).
        Uwaga: zrób dodatkowe zabezpieczenie, jeżeli ktoś miałby więcej
         */

        double zarobki = 102999;

        if(zarobki<0)
        {
            System.out.println("Nie trzeba płacić podatku");
        }
        else if(zarobki<=85528)
        {
            double podatek = zarobki * 0.17;
            System.out.println("Podatek do zapłaty wynosi: " + podatek);
        }
        else
        {
            double podatekPonizejProgu = 85528 * 0.17;
            double podatekPowyzejProgu = (zarobki-85528) * 0.32;
            double podatek = podatekPonizejProgu + podatekPowyzejProgu;
            System.out.println("Podatek do zapłaty wynosi: " + podatek);
        }
    }
}
