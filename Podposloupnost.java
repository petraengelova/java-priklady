package homeworks;

import java.util.Scanner;

/**
 * Created by Vlastimil Fengl on 18. 12. 2015.
 */
public class Podposloupnost {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numb;
        while((numb = sc.nextInt()) > 0){
            System.out.println(longestSubseq(sc,numb));
        }
    }

    public static int longestSubseq(Scanner sc, int number){
        int res = 1;
        int longest = 1;
        int prev;
        int curr = sc.nextInt();
        for (int i = 1; i < number; i++){
            prev = curr;
            curr = sc.nextInt();
            if(prev <= curr){
                longest++;
            }else{
                if(res < longest){
                    res = longest;
                }
                longest = 1;
            }
        }
        if( res < longest){
            res = longest;
        }
        return res;
    }
}
