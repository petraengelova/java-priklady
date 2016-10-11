package homeworks;

import java.util.Scanner;

/**
 * Created by Vlastimil Fengl on 17. 12. 2015.
 */
public class TrojuhelnikVlastnosti {
    static final double EQ = 1E-5;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char tmp;
        while((tmp = rContinue(sc)) != 'n'){
            double x1 = sc.nextDouble();
            double y1 = sc.nextDouble();
            double x2 = sc.nextDouble();
            double y2 = sc.nextDouble();
            double x3 = sc.nextDouble();
            double y3 = sc.nextDouble();
            double a = lengthSide(x1,y1,x2,y2);
            double b = lengthSide(x2,y2,x3,y3);
            double c = lengthSide(x3,y3,x1,y1);

            if(isDegen(a,b,c)){
                System.out.println("DEGENEROVANY");
            }else{
                if(isEquilateral(a,b,c)){
                    System.out.println("ROVNOSTRANNY");
                }else if(isIsosceles(a,b,c)){
                    if(isRight(a,b,c)){
                        System.out.println("PRAVOUHLY ROVNORAMENNY");
                    } else {
                        System.out.println("ROVNORAMENNY");
                    }
                } else if(isRight(a,b,c)){
                    System.out.println("PRAVOUHLY");
                } else {
                    System.out.println("OBECNY");
                }
            }
        }
    }

    public static char rContinue(Scanner sc){
        char res = ' ';
        while(res != 'a' && res != 'n'){
            res = sc.next().charAt(0);
            res = Character.toLowerCase(res);
        }
        return res;
    }

    public static double lengthSide(double x1, double y1, double x2, double y2){
        double x = Math.abs(x2-x1);
        double y = Math.abs(y2-y1);
        double res = Math.sqrt(x*x+y*y);
        return res;
    }

    public static boolean isDegen(double a, double b, double c){
        boolean res = true;
        if((a+b) > c && Math.abs(a-b) < c){
            res = false;
        }
        return res;
    }

    public static boolean isRight(double a,double b,double c){
        boolean res = false;
        double ab;
        double x,y,z;
        if(a < b){
            if(a < c){
                x = a;
                if(b<c){
                    y = b;
                    z = c;
                }else{
                    y = c;
                    z = b;
                }
            } else {
                x = c;
                y = a;
                z = b;
            }
        } else {
            if(b < c){
                x = b;
                if(a < c){
                    y = a;
                    z = c;
                }else{
                    y = c;
                    z = a;
                }
            }else{
                x = c;
                y = b;
                z = a;
            }
        }
        ab = x*x + y*y;
        if(Math.abs(ab-(z*z)) < EQ){
            res = true;
        }
        return res;
    }

    public static boolean isEquilateral( double a, double b, double c){
        boolean res = false;
        if(Math.abs(a-b) < EQ && Math.abs(b-c) < EQ && Math.abs(c-a) < EQ){
            res = true;
        }
        return res;
    }

    public static boolean isIsosceles(double a,double b, double c){
        boolean res = false;
        if(Math.abs(a-b) < EQ || Math.abs(b-c) < EQ || Math.abs(c-a) < EQ){
            res = true;
        }
        return res;
    }

}
