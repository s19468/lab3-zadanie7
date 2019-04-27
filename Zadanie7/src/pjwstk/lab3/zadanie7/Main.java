/*
    Zadanie 7: Stworzenie sprawdzania palindromów.
    Autor: Rafał Tęcza
    Index: s19468
*/
package pjwstk.lab3.zadanie7;

public class Main {

    public static void main(String[] args) {
        isPalindrome("Atak kata");
        isPalindrome("Muzo, raz daj jad za rozum");
        isPalindrome("Wódy żal dla żydów");
    }

    public static void isPalindrome(String value) {

        String localString = value;
        localString = localString.toLowerCase();

        if(localString.equals(new StringBuilder(localString).reverse().toString())) {
            System.out.println("\"" + value + "\"" + " - jestem palindromem.");
        } else {
            System.out.println("\"" + value + "\"" + " - nie jestem palindromem.");
        }
    }
}
