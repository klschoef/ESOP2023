package blatt4;

public class Exercise11 {
    public static void main(String[] args) {
        int[] sorted1 = { 1, 5, 7 };
        int[] sorted2 = { 2, 3, 4, 6, 8 };
        int[] result;

        /*
        pos1 = 1
        1 5_ 7

        pos2 = 1
        2 3_ 4 6 8

        posR = 2
        1 2 ._ . . . . .

        */
        result = new int[sorted1.length + sorted2.length];

        int pos1 = 0, pos2 = 0, posR = 0;
        while (posR < result.length) {
            if (pos1 < sorted1.length && pos2 < sorted2.length) {
                if (sorted1[pos1] <= sorted2[pos2]) {
                    result[posR++] = sorted1[pos1++];
                } else {
                    result[posR++] = sorted2[pos2++];
                }
            } else if (pos1 < sorted1.length) {
                result[posR++] = sorted1[pos1++];
            } else {
                result[posR++] = sorted2[pos2++];
            }

            //(Schlechtere) Alternative mit bedingten Zuweisungen
            result[posR++] = (pos1 < sorted1.length && pos2 < sorted2.length) ?
                    ((sorted1[pos1] <= sorted2[pos2]) ? sorted1[pos1++] : sorted2[pos2++]) :
                    (pos1 < sorted1.length ? sorted1[pos1++] : sorted2[pos2++]);

        }

        for (int v : result) {
            System.out.print(v + " ");
        }
    }
}
