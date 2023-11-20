package strings;

public class StringVegleich {
    public static void main(String[] args) {
        String str1 = "ESOP";
        String str2 = "ESOP";
        String str3 = "ES".concat("OP");
        String str4 = "ES".concat("OP");

        if (equals("", "")) { //"".equals("")
            System.out.println("?");
        }
        if (equals(str1, str2)) { //str.equals(str2)
            System.out.println("equals: String 1 und 2 sind gleich");
        }
        if (equals(str1, str3)) {
            System.out.println("equals: String 1 und 3 sind gleich");
        }
        if (equals(str3, str4)) {
            System.out.println("equals: String 3 und 4 sind gleich");
        }
        if (str1 == str2) {
            System.out.println("String 1 und 2 sind gleich");
        }
        if (str1 == str3) {
            System.out.println("String 1 und 3 sind gleich");
        }
        if (str3 == str4) {
            System.out.println("String 3 und 4 sind gleich");
        }
    }

    static boolean equals(String s1, String s2) {
        boolean result = true;
        if (s1 != null && s2 != null && s1.length() == s2.length()) {
            char[] c1 = s1.toCharArray();
            char[] c2 = s2.toCharArray();
            for (int i = 0; i < c1.length; i++) {
                if (c1[i] != c2[i]) {
                    result = false;
                    break;
                }
            }
        } else {
            result = false;
        }
        return result;
    }
}
