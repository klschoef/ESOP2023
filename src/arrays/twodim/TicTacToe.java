/*package arrays.twodim;

import codedraw.CodeDraw;

import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args) {
        //
        //    IMPORTANT NOTICE:
        //    This project requires CodeDraw.jar!
        //    Add it in File -> Project Structure -> Libraries -> + (use lib/CodeDraw.jar)
        //

        final int width = 600, height = 600;
        final int cSize = width / 3, rSize = height / 3, margin = 40;

        byte[][] f = new byte[3][3];
        final byte P1 = 1, P2 = 2; //1...Circle, 2...Cross

        Scanner scanner = new Scanner(System.in);
        CodeDraw cd = new CodeDraw(width,height);
        cd.setAlwaysOnTop(true);

        //draw horizontal lines
        cd.drawLine(0,rSize, cSize*3,rSize);
        cd.drawLine(0,rSize*2, cSize*3,rSize*2);

        //draw vertical lines
        cd.drawLine(cSize, 0, cSize, rSize*3);
        cd.drawLine(cSize*2, 0, cSize*2, rSize*3);

        cd.show();

        cd.setLineWidth(4.0);
        boolean playerOneTurn = true;
        boolean gameEnded = false;
        while (!gameEnded) {

            int x = -1, y = -1;
            do {
                System.out.println("Spieler " + (playerOneTurn ? "1" : "2") + ", bitte geben Sie x und y ein!");
                y = scanner.nextInt();
                x = scanner.nextInt();
            } while (x >= 3 || y >= 3 || x < 0 || y < 0 || f[y][x] != 0);

            //f[y][x] = playerOneTurn ? P1 : P2;
            if (playerOneTurn) {
                f[y][x] = P1;
            } else {
                f[y][x] = P2;
            }

            for (int r = 0; r < 3; r++) {
                for (int c = 0; c < 3; c++) {
                    byte val = f[r][c];
                    if (val == P1) {
                        //draw circle
                        int x1 = c * cSize + cSize / 2;
                        int y1 = r * rSize + rSize / 2;
                        cd.drawCircle(x1, y1, 50);
                    } else if (val == P2) {
                        // draw cross
                        int x1 = c * cSize + margin;
                        int y1 = r * rSize + margin;
                        int x2 = x1 + cSize - 2 * margin;
                        int y2 = y1 + rSize - 2 * margin;
                        cd.drawLine(x1, y1, x2, y2);
                        cd.drawLine(x2, y1, x1, y2);
                    }
                }
            }

            cd.show();
            playerOneTurn = !playerOneTurn; //change P1 <-> P2

            //check win situation
            for (int i = 0; i < 3; i++) {
                //rows or cols with equal values (except 0, which is empty)?
                if (f[i][0] != 0 && f[i][0] == f[i][1] && f[i][1] == f[i][2] ||
                    f[0][i] != 0 && f[0][i] == f[1][i] && f[1][i] == f[2][i]) {
                    gameEnded = true;
                    break;
                }
            }
            //check diagonals
            if (f[0][0] != 0 && f[0][0] == f[1][1] && f[1][1] == f[2][2] ||
                f[0][2] != 0 && f[0][2] == f[1][1] && f[1][1] == f[2][0]) {
                gameEnded = true;
            }
        }

        cd.drawText( 10, 10, "Spiel beendet!");
        cd.show();
    }
}
*/