package recursion;

public class Fibonacci {
    public static void main(String[] args) {
        //for (int i = 1; i <= 8; i++) {
        //    System.out.print(fib(i) + " ");
        //}
        fib(9, "");
    }

    static int fib(int pos, String margin) {
        //1 + 1 + 2 + 3 + 5 + 8
        if (pos == 1 || pos == 2) {
            System.out.println(margin + "need value for pos " + pos);
            System.out.println(margin + "-> 1");
            return 1;
        } else {
            System.out.println(margin + "need value for pos " + pos);
            int f1 = fib(pos - 1, margin + "\t");
            int f2 = fib(pos - 2, margin + "\t");
            System.out.println(margin + "-> value for pos " + pos + " = " + f2 + " + " + f1 + " = " + (f2+f1));
            return f1 + f2;
        }

    }
}
