package collections;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class VectorTest {
    public static void main(String[] args) {
        Vector vec = new Vector();
        vec.add("Test");
        vec.add("Wird entfernt");
        vec.add(2);
        vec.add(1.3);
        vec.add(true);
        vec.remove(1);

        for (int i=0; i < vec.size(); i++) {
            Object o = vec.elementAt(i);
            if (o instanceof String) {
                String s = (String) o;
                System.out.println("Element " + i + " ist ein String: " + s);
            }
            else if (o instanceof Integer) {
                int k = (Integer) o;
                System.out.println("Element " + i + " ist ein Integer: " + k);
            }
            else if (o instanceof Double) {
                double d = (Double) o;
                System.out.println("Element " + i + " ist ein Double: " + d);
            }
            //double ignored
        }

        //Ein generischer Vector, der nur Strings akzeptiert
        Vector<String> vecStr = new Vector<>();
        vecStr.add("Test");
        vecStr.add("Hello World");
        vecStr.add("Ende");
        for (int i=0; i < vecStr.size(); i++) {
            String s = vecStr.elementAt(i);
            System.out.println(s);
        }

        //Viele Collections implementieren das List Interface
        //und sind dadurch typkompatibel
        List<String> myList = vecStr;
        for (int i=0; i < myList.size(); i++) {
            String s = myList.get(i);
            System.out.println(s);
        }

    }
}
