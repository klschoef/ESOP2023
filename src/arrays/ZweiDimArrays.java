package arrays;

public class ZweiDimArrays {
    public static void main(String[] args) {
        int[][] a = new int[6][4];

        /*a[0][0] = 1;
        a[1][3] = 1;
        a[2][2] = 2;*/

        //Zahlen von 6 bis 1 in die Zeilen schreiben
        for (int i=0; i < a.length; i++) {
            for (int j=0; j < a[i].length; j++) {
                a[i][j] = a.length - i;
            }
        }

        //Erste Zeile mit letzter Zeile vertauschen (durch Änderung der Referenzen)
        int[] tmp = a[0];
        a[0] = a[a.length-1];
        a[a.length-1] = tmp;

        //Länge ausgeben
        System.out.println("Länge (1.dim) = " + a.length);
        System.out.println("Länge (2.dim) = " + a[0].length);

        //Werte der Element ausgeben
        for (int i=0; i < a.length; i++) {
            System.out.print(a[i] + "\t");
            for (int k=0; k < a[0].length; k++) {
                System.out.print(a[i][k] + " ");
            }
            System.out.println();
        }
    }
}
