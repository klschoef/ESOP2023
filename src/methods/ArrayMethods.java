package methods;
import static methods.Overloading.printArray;

public class ArrayMethods {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 4, 8, 16, 32, 64, 128, 256};

        //Array umgedreht ausgeben:
        printReversed(numbers);

        //ein umgedrehtes Array erzeugen und zurückgeben
        int[] numbersR = reverse(numbers);
        printArray(numbersR);

        int[] numbers2 = {512, 1024, 2048, 4096, 8192};
        //ein neues Array soll erzeugt werden, wo die Elemente von numbers2 an die Elemente von numbers angehängt sind
        int[] numbersC = combineArrays(numbers, numbers2);
        printArray(numbersC);
    }

    static int[] combineArrays(int[] a, int[] b) {
        int[] result = new int[a.length + b.length];
        int pos = 0;
        for (int i=0; i < a.length; i++) {
            result[pos++] = a[i];
        }
        for (int i=0; i < b.length; i++) {
            result[pos++] = b[i];
        }
        return result;
    }

    static int[] reverse(int[] a) {
        int[] aReversed = new int[a.length];

        for (int i=a.length-1, pos = 0; i >= 0; i--,pos++) {
            aReversed[pos] = a[i]; //wäre auch so möglich: aReversed[a.length-1-i] = a[i];
        }

        return aReversed;
    }

    static void printReversed(int[] a) {
        for (int i=a.length-1; i >= 0; i--) {
            System.out.print(a[i] + " ");
        }

        //wäre auch so möglich:
        /*for (int i=0; i < a.length; i++) {
            System.out.print(a[a.length-1-i] + " ");
        }*/
    }
}
