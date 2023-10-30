package loops;

public class GeradeZahlen {
    public static void main(String[] args) {
        int n = 0;
        while (n <= 10) {
            if (n % 2 == 0) {
                System.out.println(n);
            }
            n++;
        }
    }
}