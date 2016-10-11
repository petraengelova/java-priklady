package homeworks;

import java.util.Scanner;

/**
 * Created by Vlastimil Fengl on 17. 12. 2015.
 */
public class Pocet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        for (int i = 0; i < count; i++){
            counter(sc);
        }
    }

    public static int countDivisors(int number){
        int res = 0;
        for (int j = 2; j < number; j++){
            if(number%j == 0){
                res++;
            }
        }
        return res;
    }

    public static void counter(Scanner sc){
        int res = 0;
        int count = countDivisors(sc.nextInt());
        int tmp;
        while((tmp = sc.nextInt()) > 0){
            if(countDivisors(tmp) == count){
                res++;
            }
        }
        System.out.println(res);
    }
}
