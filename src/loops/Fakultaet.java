package loops;

public class Fakultaet {
    public static void main(String[] args) {
        //11! = 1 * 2 * 3 * 4 ...
        int n = 11, result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        System.out.format("Die Fakultät von %d ist %d", n, result);
    }
}
