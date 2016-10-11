package homeworks;

import java.util.Scanner;

/**
 * Created by Vlastimil Fengl on 17. 12. 2015.
 */
public class BarvaPole {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        while(!(num < 0)){
            int num2 = sc.nextInt();
            System.out.print(((num+num2)%2 == 0 ? "BILA ":"CERNA "));
            num = sc.nextInt();
        }
        System.out.println();
    }
}
