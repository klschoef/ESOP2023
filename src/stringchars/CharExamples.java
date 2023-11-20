package stringchars;

public class CharExamples {
    public static void main(String[] args) {
        //region unicode zeichen
        char[] emojis = {'\u266B', '\u26BD', '\u2639', '\u263A', '\u270C', '\u03A0'};
        for (char c : emojis) {
            System.out.print(c);
        }
        printChars(1,255);
        //endregion

        //region Zeichenarray entspricht einem String
        char[] text = {'H','a','l','l','o',' ','W','e','l','t','!'};
        //String str = "Hallo Welt!";
        //char[] text2 = str.toCharArray();
        System.out.println("Unser Text enthält " + text.length + " Zeichen");
        for (char c : text) {
            System.out.print(toLower(c));

        }
        //endregion

    }

    static char toLower(char c) {
        if (c >= 'A' && c <= 'Z') {
            c += 32;
        }
        return c;
    }

    static char toUpper(char c) {
        if (c >= 'a' && c <= 'z')
            c -= 32;
        return c;
    }

    static void printChars(int from, int to) {
        for (int i=from; i <= to; i++) {
            System.out.println(i + ": " + (char)i + " " + Character.getName(i));
        }
    }
}
