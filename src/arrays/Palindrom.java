package arrays;

public class Palindrom {
    public static void main(String[] args) {
        char[] zeichen = {'A', 'N', 'T', 'N', 'A'}; //5 Zeichen
        //char[] zeichen = {'R', 'E', 'I', 'T', 'T', 'I', 'E', 'R'};

        boolean isPalindrom = true;
        for (int pos=0; pos < zeichen.length/2; pos++) {
            if (zeichen[pos] != zeichen[zeichen.length-1-pos]) {
                System.out.format("Kein Palindrom! %c und %c sind ungleich\n", zeichen[pos],zeichen[zeichen.length-1-pos]);
                isPalindrom = false;
                break;
            }
        }

        if (isPalindrom) {
            System.out.println("Ist ein Palindrom!");
        }
    }


}
