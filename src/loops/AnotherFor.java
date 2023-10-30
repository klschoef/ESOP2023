package loops;

public class AnotherFor {
    public static void main(String[] args) {
        //Summe der Zweierpotenzen - 1 + 2 + 4 + 8 + 16 + ... + 4096
        int sum = 0;
        for (int i=1, j=1; j <= 4096; i++, j*=2) {
            sum += j;
            System.out.format("Iteration i=%d: j=%d sum=%d\n", i, j, sum);
        }
    }
}
