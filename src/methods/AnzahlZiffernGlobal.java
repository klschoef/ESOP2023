package methods;

public class AnzahlZiffernGlobal {
    static int[] zahlen = {123, 40123, 456789, 3};

    public static void main(String[] args) {
        for (int z : zahlen) { //zahlen ist global und dadurch in allen Methoden sichbar
            getAnzahlZiffern(z);
        }
    }

    static int getAnzahlZiffern(int n) {
        int d = 1, nOrig = n;
        while (n > 9) {
            n /= 10;
            d++;
        }
        System.out.println("Die Zahl " + nOrig + " hat " + d + " Ziffern");
        return d;
    }
}
