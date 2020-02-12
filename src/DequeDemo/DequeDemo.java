package DequeDemo;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeDemo {
    public static void main(String[] args) {
        String s = "abcabd(abcdedfg)abc";
        System.out.println(reverseInParentheses(s));
    }

    public static String reverseInParentheses(String input){
        StringBuilder result = new StringBuilder();
        Deque<Character> stack = new ArrayDeque<>();
        char[] inputChar = input.toCharArray();
        int len = inputChar.length;
        for (int i = 0; i < len; i++) {
            if(inputChar[i] == ')'){
                StringBuffer temp = new StringBuffer();
                while (stack.peek() != '('){
                    String c = stack.pop().toString();
                    temp.append(c);
                }
                stack.pop();
                char[] chars = temp.toString().toCharArray();
                for (int j = 0; j < chars.length; j++){
                    stack.push(chars[j]);
                }
            }
            else{
                stack.push(inputChar[i]);
            }
        }
        System.out.println(stack);
        while(!stack.isEmpty()){
            result.append(stack.pollLast());
        }
        return result.toString();
    }
}
