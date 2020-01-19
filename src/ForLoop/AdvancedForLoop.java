package ForLoop;

import java.util.ArrayList;

public class AdvancedForLoop {
    public static void main(String[] args) {
        String[] strings = {"Jacky", "Jessica", "Andrew", "Harden"};
        for(String string : strings){
            System.out.println(string);
        }

        System.out.println("----------------------");

        ArrayList<String> strings1 = new ArrayList<>();
        strings1.add("hhh");
        strings1.add("lll");

        //不支持并发
        

    }
}
