package recursion;

public class WeiteresBeispiel {
    static int rekursion(int x) {
        if (x == 4)
            return -1;
        else {
            int y = rekursion(x + 1);
            System.out.print(x + y);
            return y;
        }
    }

    public static void main(String[] args) {
        rekursion(2);
    }
}

