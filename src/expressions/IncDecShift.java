package expressions;

public class IncDecShift {
    public static void main(String[] args) {
        int x = 2;
        int y = x++ * x;
        System.out.println("x=" + x + " y=" + y);
    }
}
