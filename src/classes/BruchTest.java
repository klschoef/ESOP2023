package classes;

public class BruchTest {
    public static void main(String[] args) {
        Bruch eindrittel = new Bruch();
        eindrittel.setZaehler(1);
        eindrittel.setNenner(3);
        eindrittel.setNenner(0); //will be ignored
        //eindrittel.printValue();
        System.out.println(eindrittel);

        Bruch einviertel = new Bruch(1, 4);
        //einviertel.printValue();
        System.out.println(einviertel);

        Bruch[] bruch = new Bruch[10];
        for (int i = 0; i < 10; i++) {
            bruch[i] = new Bruch(1, i);
        }

        for (Bruch b : bruch) {
            System.out.println(b);
        }

        /*
        Bruch tmp = null;
        tmp = einviertel;
        System.out.println(tmp);
        */

        Bruch oh1 = Bruch.createOneHalf();
        Bruch oh2 = Bruch.createOneHalf();
        System.out.println(Bruch.MAX_BRUECHE);

    }
}
