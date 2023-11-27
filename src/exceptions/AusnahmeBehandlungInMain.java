package exceptions;

public class AusnahmeBehandlungInMain {
        public static void main(String[] args) {
            int c = -1;
            try {
                c = testeExceptions();
            } catch (ArithmeticException ae) {
                System.out.println("Division durch 0 nicht erlaubt!");
            } catch (NullPointerException npe) {
                System.out.println("String wurde nicht initialisiert!");
            } catch (Exception e) {
                System.out.println("Es ist eine Ausnahme aufgetreten! " + e.getMessage());
            }
            System.out.println("Ergebnis von c = " + c);
        }

        private static int testeExceptions() throws Exception  {
            int a = 4, b = 2, c = -1;
            String s = "Hello";

            if (b == 2) {
                throw new Exception("2 nicht erlaubt!");
            }
            c = a / b;
            System.out.println("nach a/b");
            System.out.println("Stringlänge: " + s.length());
            return c;
        }
}
