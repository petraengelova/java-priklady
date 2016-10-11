package homeworks;

import java.util.Scanner;

/**
 * Created by Vlastimil Fengl on 17. 12. 2015.
 */
public class PoctyBodu {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int count = sc.nextInt();
        int firstQ = 0;
        int secondQ = 0;
        int thirdQ = 0;
        int fourthQ = 0;
        for (int i = 0; i < count; i++){
            double x = sc.nextDouble();
            double y = sc.nextDouble();
            if (x < 0){
                if(y < 0){
                    fourthQ++;
                }else{
                    secondQ++;
                }
            } else {
                if(y < 0){
                    thirdQ++;
                }else{
                    firstQ++;
                }
            }
        }
        System.out.println(firstQ+" "+secondQ+" "+thirdQ+" "+fourthQ);
    }
}
