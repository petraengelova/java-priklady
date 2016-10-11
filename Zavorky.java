package homeworks;

import java.util.Scanner;

/**
 * Created by Vlastimil Fengl on 14. 1. 2016.
 */
public class Zavorky {

    static int[] stack;
    static int ptr = -1;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        stack = new int[10];
        System.out.println(brackets(sc));
    }

    public static int brackets(Scanner sc){
        boolean isEnd = false;
        while(!isEnd){
            String word = sc.next();
            if(word.toUpperCase().matches(".*END.*")){
                pairingBrackets(word);
                isEnd = true;
            } else {
                pairingBrackets(word);
            }
        }
        if(ptr == -1){
            return 1;
        } else {
            return 0;
        }
    }

    public static void pairingBrackets(String s){
        for (int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '{'){
                push(3);
            }
            if(s.charAt(i) == '['){
                push(2);
            }
            if(s.charAt(i) == '('){
                push(1);
            }
            if(s.charAt(i) == '}' && stack[ptr] == 3){
                pop();
            }
            if(s.charAt(i) == ']' && stack[ptr] == 2){
                pop();
            }
            if(s.charAt(i) == ')' && stack[ptr] == 1){
                pop();
            }
        }
    }

    public static void push(int i){
        if((ptr +1) >= stack.length){
            int[] tmp = new int[stack.length+10];
            System.arraycopy(stack,0,tmp,0,stack.length);
        }
        stack[++ptr] = i;
    }

    public static int pop(){
        return stack[ptr--];
    }
}
