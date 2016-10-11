package homeworks;

import java.util.Scanner;

/**
 * Created by Vlastimil Fengl on 14. 1. 2016.
 */
public class TextoveZpravy {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < number; i++){
            String text = sc.nextLine();
            System.out.println(mirrorWords(text));
        }
    }

    public static String mirrorWords(String words){
        StringBuilder res = new StringBuilder();
        String[] tmp = words.split(" ");
        StringBuilder helper;

        for (int i = 0; i < tmp.length; i++){
            if(tmp[i].equals("")){
            } else {
                helper = new StringBuilder(tmp[i]);
                res.append(helper.reverse().toString().toUpperCase()+" ");
            }
        }

        String text = res.toString();
        text = text.trim() + ".";
        return text;
    }
}
