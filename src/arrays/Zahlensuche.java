package arrays;

import java.util.Random;
import java.util.Scanner;

public class Zahlensuche {
    public static void main(String[] args) {
        int[] a = new int[40];

        //Zahlen setzen
        for (int i=0; i < a.length; i++) {
            a[i] = (int)(Math.random() * 13);
        }

        //Zahlen ausgeben
        for (int v : a) {
            System.out.print(v + " ");
        }
        System.out.println();

        //Zahl suchen
        System.out.println("Welche Zahl soll gesucht werden?");
        Scanner scanner = new Scanner(System.in);
        int gesucht = scanner.nextInt();

        boolean gefunden = false;
        for (int i=a.length-1; i >= 0; i--) {
            if (gesucht == a[i]) {
                System.out.format("Zahl %d wurde auf Pos %d gefunden!\n", gesucht, i);
                gefunden = true;
                break;
            }
        }

        if (!gefunden) {
            System.out.format("Zahl %d wurde nicht gefunden!\n", gesucht);
        }


    }
}
