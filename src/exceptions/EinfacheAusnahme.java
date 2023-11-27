package exceptions;

import java.sql.SQLOutput;

public class EinfacheAusnahme {
    public static void main(String[] args) {
        int c = testeExceptions();
        System.out.println("Ergebnis von c = " + c);
    }

    private static int testeExceptions() {
        int a = 4, b = 1, c = -1;
        String s = "Hello";

        try {
            c = a / b;
            System.out.println("nach a/b");
            System.out.println("Stringlänge: " + s.length());
            return c;
        } catch (ArithmeticException ae) {
            System.out.println("Division durch 0 nicht erlaubt!");
        } catch (NullPointerException npe) {
            System.out.println("String wurde nicht initialisiert!");
        } catch (Exception e) {
            System.out.println("Es ist eine Ausnahme aufgetreten!");
        } finally {
            System.out.println("Ende der Ausnahmebehandlung!");
        }

        return -1;
    }
}
