package methods;

public class Overloading {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 4, 8, 16, 32, 64, 128, 256};
        int[] primes = {2, 3, 7};
        float[] floats = {1.2f, 4.5f, 7.7f};

        printArray(numbers, primes); //Alernative zu printArray(numbers); printArray(primes);
        printArray(floats);
    }

    static void printArray(int[] a) {
        System.out.print("Int array: ");
        for (int v : a) {
            System.out.print(v + " ");
        }
        System.out.println();
    }

    static void printArray(int[] a, int[] b) {
        //wiederverwenden des bestehenden Codes oben:
        printArray(a);
        printArray(b);
    }

    static void printArray(float[] a) {
        System.out.print("Float array: ");
        for (float v : a) {
            System.out.print(v + " ");
        }
        System.out.println();
    }
}
