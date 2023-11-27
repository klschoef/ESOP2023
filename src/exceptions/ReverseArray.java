package exceptions;
import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
    int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    Scanner scanner = new Scanner(System.in);
    reverseArray(arr, scanner.nextInt());
    for (int v : arr) {
        System.out.print(v + " ");
    }
}

static void reverseArray(int[] arr, int startIdx) {
    try {
        System.out.println("Try Block Start");
        for (int i = startIdx; i < arr.length / 2; i++) {
            int tmp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = tmp;
        }
        System.out.println("Try Block Ende");
    } catch (IndexOutOfBoundsException ioob) {
        System.out.println("Falscher Index " + startIdx + " verwendet!");
    } finally {
        System.out.println("Finally Block");
    }
}

}
