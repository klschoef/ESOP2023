package recursion;

public class Fibonacci {
    public static void main(String[] args) {
        for (int i = 1; i <= 8; i++) {
            System.out.print(fib(i) + " ");
        }
    }

    static int fib(int pos) {
        //1 + 1 + 2 + 3 + 5 + 8
        if (pos == 1 || pos == 2)
            return 1;
        else {
            int f1 = fib(pos - 1);
            int f2 = fib(pos - 2);
            //System.out.println("fib(" + pos + "): " + f2 + " + " + f1 + " = " + (f1 + f2));
            return f1 + f2;
        }

    }
}
