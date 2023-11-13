package methods;

public class StackOverflowTest {
    public static void main(String[] args) {
        myFunc(20);
    }

    static void myFunc(int n) {
        n = n + 1;
        myFunc(n); //rekursiver Aufruf (ohne Abbruch; würde endlos laufen, aber durch Beschränkung des Stacks irgendwann abbrechen)
    }
}
