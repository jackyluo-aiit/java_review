package Vector;

import java.util.Enumeration;
import java.util.Vector;

public class VectorDemo {
    public static void main(String[] args) {
        Vector vector = new Vector();
        vector.add(new String("jacky"));
        vector.add(new String("jessica"));
        System.out.println(vector);

//        String jessica = new String("jessica");
//        String jessica1 = new String("jessica");
//        System.out.println(jessica==jessica1);


        Object o = vector.get(1);
        Object o1 = vector.elementAt(1);
        System.out.println(o);
        System.out.println(o1);
        System.out.println(o==o1);

        Enumeration elements = vector.elements();
        while(elements.hasMoreElements()){
            System.out.println(elements.nextElement());
        }
    }
}
