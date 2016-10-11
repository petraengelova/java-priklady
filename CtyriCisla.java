package homeworks;

import java.util.Scanner;

/**
 * Created by Vlastimil Fengl on 17. 12. 2015.
 */
public class CtyriCisla {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        for (int i = 0; i < count; i++) {
            sort(sc.nextInt(),sc.nextInt(),sc.nextInt(),sc.nextInt());
        }
    }

    public static void sort(int a, int b, int c, int d){
        int tmp = Math.min(a,Math.min(b,Math.min(c,d)));
        if(tmp == a){
            System.out.print(a+" ");
            tmp = Math.min(b,Math.min(c,d));
            if(tmp == b){
                System.out.println(b+" "+Math.min(c,d)+" "+Math.max(c,d));
            }else if(tmp == c){
                System.out.println(c+" "+Math.min(b,d)+" "+Math.max(b,d));
            }else{
                System.out.println(d+" "+Math.min(b,c)+" "+Math.max(b,c));
            }
        }else if(tmp == b){
            System.out.print(b+" ");
            tmp = Math.min(a,Math.min(c,d));
            if(tmp == a){
                System.out.println(a+" "+Math.min(c,d)+" "+Math.max(c,d));
            }else if(tmp == c){
                System.out.println(c+" "+Math.min(a,d)+" "+Math.max(a,d));
            }else{
                System.out.println(d+" "+Math.min(a,c)+" "+Math.max(a,c));
            }
        }else if(tmp == c){
            System.out.print(c+" ");
            tmp = Math.min(a,Math.min(b,d));
            if(tmp == a){
                System.out.println(a+" "+Math.min(b,d)+" "+Math.max(b,d));
            }else if(tmp == b){
                System.out.println(b+" "+Math.min(a,d)+" "+Math.max(a,d));
            }else{
                System.out.println(d+" "+Math.min(a,b)+" "+Math.max(a,b));
            }
        }else{
            System.out.print(d+" ");
            tmp = Math.min(a,Math.min(b,c));
            if(tmp == a){
                System.out.println(a+" "+Math.min(b,c)+" "+Math.max(b,c));
            }else if(tmp == b){
                System.out.println(b+" "+Math.min(a,c)+" "+Math.max(a,c));
            }else{
                System.out.println(c+" "+Math.min(a,b)+" "+Math.max(a,b));
            }
        }
    }
}
