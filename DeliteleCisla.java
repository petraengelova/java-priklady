package homeworks;

import java.util.Scanner;

/**
 * Created by Vlastimil Fengl on 17. 12. 2015.
 */
public class DeliteleCisla {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        short numb;
        while((numb = sc.nextShort()) > 0){
            for (int i = 2; i < numb; i++){
                if(numb%i == 0){
                    System.out.print(i+" ");
                }
            }
            System.out.println();
        }
    }
}
