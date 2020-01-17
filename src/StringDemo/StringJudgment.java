package StringDemo;

public class StringJudgment {
    public static void main(String[] args) {
        String str = "HelloWorld";
        //if the string ends with
        boolean world = str.endsWith("World");
        System.out.println(world);
        //if equals
        String str1 = "HelloWorld";
        System.out.println(str.equals(str1));
        //if equal when remove the case
        String str2 = new String("helloworld");
        System.out.println(str2.equalsIgnoreCase(str1));
        //if contains
        boolean hell = str.contains("hell");
        System.out.println(hell);
        //if it is empty
        boolean empty = str.isEmpty();
        System.out.println(empty);
        boolean equals = "".equals(str1);
        System.out.println(equals);
    }
}
