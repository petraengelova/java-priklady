package homeworks;

import java.util.Scanner;

/**
 * Created by Vlastimil Fengl on 17. 12. 2015.
 */
public class DelitelNasobek {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2;
        while((num1 = sc.nextInt()) > 0){
            num2 = sc.nextInt();
            int[][] first = factorization(num1);
            int[][] second = factorization(num2);
            LCMandGCD(first, second);
        }
    }

    public static int[][] factorization(int number){
        int[][] tmp = new int[32][2];
        int i = 2;
        int ptr = -1;
        while(number != 1){
            if(number%i == 0){
                if(ptr == -1 || tmp[ptr][0] != i){
                    ptr++;
                }
                tmp[ptr][0] = i;
                tmp[ptr][1] += 1;
                number /= i;
            }else{
                i++;
            }
        }
        int[][] res = new int[ptr+1][2];
        System.arraycopy(tmp,0,res,0,ptr+1);
        return res;
    }

    public static void LCMandGCD(int[][] first, int[][] second){
        long lcm = 1;
        long gcd = 1;
        int ptr1 = 0;
        int ptr2 = 0;
        while(!(ptr1 == first.length && ptr2 == second.length)){
            if(ptr1 != first.length && ptr2 != second.length) {
                if (first[ptr1][0] < second[ptr2][0]) {
                    lcm *=(long) Math.pow(first[ptr1][0], first[ptr1][1]);
                    ptr1++;
                } else if (first[ptr1][0] == second[ptr2][0]) {
                    if (first[ptr1][1] < second[ptr2][1]) {
                        lcm *=(long) Math.pow(second[ptr2][0], second[ptr2][1]);

                    } else {
                        lcm *=(long)Math.pow(first[ptr1][0], first[ptr1][1]);

                    }
                    ptr1++;
                    ptr2++;
                } else {
                    lcm *=(long) Math.pow(second[ptr2][0], second[ptr2][1]);
                    ptr2++;
                }
            }else if(ptr2 != second.length){
                lcm *=(long) Math.pow(second[ptr2][0], second[ptr2][1]);
                ptr2++;
            } else {
                lcm *= (long)Math.pow(first[ptr1][0], first[ptr1][1]);
                ptr1++;
            }
        }
        ptr1 = 0;
        ptr2 = 0;
        while(!(ptr1 == first.length && ptr2 == second.length)){
            if(ptr1 != first.length && ptr2 != second.length) {
                if (first[ptr1][0] < second[ptr2][0]) {
                    ptr1++;
                } else if (first[ptr1][0] == second[ptr2][0]) {
                    if (first[ptr1][1] < second[ptr2][1]) {
                        gcd *=(long) Math.pow(first[ptr1][0], first[ptr1][1]);
                        ptr1++;
                    } else {
                        gcd *=(long) Math.pow(second[ptr2][0], second[ptr2][1]);
                        ptr2++;
                    }
                } else {
                    ptr2++;
                }
            }else if(ptr2 != second.length){
                ptr2++;
            } else {
                ptr1++;
            }
        }
        System.out.println(gcd+" "+lcm);
    }
}
