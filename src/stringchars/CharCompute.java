package stringchars;

public class CharCompute {
    public static void main(String[] args) {
        char c1 = '0', c2 = '9', c3 = 56; //48 und 57
        char c4 = 'z', c5 = 'a';
        int i1 = 'A'; //65

        if (c4 >= 'a' && c4 <= 'z') {
            c4 -= 32;
        }
        System.out.println(c4);
    }
}
