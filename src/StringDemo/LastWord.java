package StringDemo;

public class LastWord {
    public static int lastWordLength(String input){
        String[] inputs = input.split("\\s");
        System.out.println(inputs.length);
        String newStr = inputs[inputs.length-1];
        return newStr.length();
    }

    public static void main(String[] args) {
        System.out.println(lastWordLength("XSUWHQ "));
    }
}
