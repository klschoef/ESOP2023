package recursion;

public class Factorial {
    public static void main(String[] args) {
        //5! = 4! * 5 = 3! * 4 * 5= 2! * 3 * 4 * 5 = 1! * 2 * 3 * 4 * 5
        int val = 5;
        long res = factorial(val);
        System.out.println(val + "! = " + res);
    }

    static long factorial(int n) {
        //System.out.println("Aufruf: factorial(" + n +  ")");
        if (n < 0)
            return -1; //nicht definiert
        else if (n <= 1) { //0 oder 1
            System.out.println("\treturn 1");
            return 1; //Trivialfall
        } else {
            //System.out.println("\treturn " + (factorial(n - 1) * n));
            return factorial(n - 1) * n;
        }
    }

}
