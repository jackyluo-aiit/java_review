package CollectionEntityDemo;

import java.util.Date;

public class EntityTest {
    public static void main(String[] args) {
        CustomEntity<String> entity = new CustomEntity<>();
        entity.setT("haha");
        //define Integer type
        CustomEntity<Integer> integerCustomEntity = new CustomEntity<>();
        integerCustomEntity.setT(12);
        //define a array type
        CustomEntity<Integer[]> customEntity = new CustomEntity<>();
        customEntity.setT(new Integer[]{1,2,3,4,5});

        MultipleEntity<String, Date> sD = new MultipleEntity<>();
        sD.setE(new Date());
        sD.setT("Today is ");
        System.out.println(sD);



    }
}
