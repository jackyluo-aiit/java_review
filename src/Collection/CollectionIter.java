package Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionIter {
    public static void main(String[] args) {
        Collection coll = new ArrayList();
        coll.add("audi");
        coll.add("BMW");
        int size = coll.size();
        iterCollection(coll);
    }

    public static void iterCollection(Collection coll){
        Iterator iterator = coll.iterator();
        while (iterator.hasNext()){
            Object next = iterator.next();
            System.out.println(next);
        }
    }
}
