package methods;

public class AnzahlZiffern {
    public static void main(String[] args) {
        int[] zahlen = {123, 40123, 456789, 3};
        for (int z : zahlen) {
            getAnzahlZiffern(z); //aktuell
        }
    }

    static int getAnzahlZiffern(int n) { //formal
        //vergleiche Schleifen Folien 4-6
        int d = 1, nOrig = n;
        while (n > 9) {
            n /= 10;
            d++;
        }
        System.out.println("Die Zahl " + nOrig + " hat " + d + " Ziffern");
        return d;
    }
}
