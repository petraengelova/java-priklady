package homeworks;

import java.util.Scanner;

/**
 * Created by Vlastimil Fengl on 17. 12. 2015.
 */
public class CtyriMaxima {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        for (int i = 0; i < count; i++){
            findMaxesSeq(sc);
        }
    }

    public static void findMaxesSeq(Scanner sc){
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        int max3 = Integer.MIN_VALUE;
        int max4 = Integer.MIN_VALUE;
        int c1 = 0;
        int c2 = 0;
        int c3 = 0;
        int c4 = 0;
        int read;
        while((read = sc.nextInt()) > 0){
            if(read > max1){
                max4 = max3;
                c4 = c3;
                max3 = max2;
                c3 = c2;
                max2 = max1;
                c2 = c1;
                max1 = read;
                c1 = 1;
            }else if(read == max1){
                c1++;
            }else{
                if(read > max2){
                    max4 = max3;
                    c4 = c3;
                    max3 = max2;
                    c3 = c2;
                    max2 = read;
                    c2 = 1;
                }else if(read == max2){
                    c2++;
                }else{
                    if(read > max3){
                        max4 = max3;
                        c4 = c3;
                        max3 = read;
                        c3 = 1;
                    }else if(read == max3){
                        c3++;
                    }else{
                        if(read > max4){
                            max4 = read;
                            c4 = 1;
                        }else if(read == max4){
                            c4++;
                        }else{

                        }
                    }
                }
            }
        }
        System.out.println(max1+" "+c1);
        System.out.println(max2+" "+c2);
        System.out.println(max3+" "+c3);
        System.out.println(max4+" "+c4);
    }
}
