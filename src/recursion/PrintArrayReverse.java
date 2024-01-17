package recursion;

public class PrintArrayReverse {
    public static void printRec(int[] a, int idx) {
        System.out.println(a[idx] + " "); //Annahme: idx ist gültig!
        if (idx != 0) {
            printRec(a, idx - 1);
        }
        //System.out.println(a[idx] + " ");
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        printRec(arr, arr.length-1);
    }
}
