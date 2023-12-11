package classes;

public class Bruch {
    //Properties? (Member-Attribute)
    private int zaehler;
    private int nenner;

    static float MAX_BRUECHE = 20; //not really meaningful here, but for demonstration purpose

    //Constructor
    public Bruch() {
        System.out.println("Objekt von Bruch erzeugt");
    }

    //Overloaded constructor
    public Bruch(int zaehler, int nenner) {
        this.setZaehler(zaehler);
        this.setNenner(nenner);
    }

    //member method
    public void printValue() {
        System.out.println(getZaehler() + "/" + getNenner() + " = " + ((float) getZaehler() / getNenner()));
    }

    //member method, which overrides toString() that was automatically inherited from Object
    @Override
    public String toString() {
        return getZaehler() + "/" + getNenner() + " = " + ((float) getZaehler() / getNenner());
    }

    //Class method!
    public static Bruch createOneHalf() {
        return new Bruch(1,2);
    }

    //Getter for zaehler
    public int getZaehler() {
        return zaehler;
    }

    //Setter for zaehler
    public void setZaehler(int zaehler) {
        this.zaehler = zaehler;
    }

    //Getter for nenner
    public int getNenner() {
        return nenner;
    }

    //Setter for nenner
    public void setNenner(int nenner) {
        if (nenner != 0) {
            this.nenner = nenner;
        }
    }
}
