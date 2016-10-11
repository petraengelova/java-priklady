package homeworks;

import java.util.Scanner;

/**
 * Created by Vlastimil Fengl on 14. 1. 2016.
 */
public class Zkratky {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < count; i++){
            String text = sc.nextLine();
            System.out.println(abbreviation(text));
        }
    }

    public static String abbreviation(String text){
        String[] tmp = text.toUpperCase().split(" ");
        String res = "";
        for (int i = 0; i < tmp.length; i++){
            if(tmp[i].length() > 2){
                res += tmp[i].charAt(0);
            }
        }
        return res;
    }
}
