package homeworks;

import java.util.Scanner;

/**
 * Created by Vlastimil Fengl on 17. 12. 2015.
 */
public class Vyskyt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        for (int i = 0; i < count; i++){
            System.out.println(work(sc));
        }
    }

    public static boolean work(Scanner sc){
        int first = sc.nextInt();
        int second = sc.nextInt();
        int count = sc.nextInt();
        if(count == 0){
            return false;
        }
        int prev = 0;
        int curr = sc.nextInt();
        boolean res = false;
        for (int i = 1; i < count; i++){
            prev = curr;
            curr = sc.nextInt();
            if(prev == first && curr == second){
                res = true;
            }
        }
        return  res;
    }
}
