package homeworks;

import java.util.Scanner;

/**
 * Created by Vlastimil on 4. 11. 2015.
 */
public class CzechFlag {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Zadejte delku statni vlajky: ");
        int width = sc.nextInt();

        czechFlag1(width);
    }

    public static void czechFlag1(int width){
        int height = (int)(((float)width/3)*2);

        for (int i = 0; i < height; i++){
            for (int j = 0; j < width; j++){
                if(i < (height/2)){
                    if(i == 0){
                        printStar();
                    } else {
                        if(j == 0 || j == width-1){
                            printStar();
                        } else if (j == i){
                            printStar();
                        } else {
                            System.out.print("  ");
                        }
                    }
                } else if( i == height/2) {
                    if ((height % 2 == 0) && (j == 0 || j >= (height / 2) - 1)) {
                        printStar();
                    } else if((height % 2 == 1) && (j == 0 || j >= (height / 2))){
                        printStar();
                    } else {
                        System.out.print("  ");
                    }
                } else {
                    if(i == height-1){
                        printStar();
                    } else {
                        if(j == 0 || j == width-1){
                            printStar();
                        } else if (j == ((height-1) - i)) {
                            printStar();
                        } else {
                            System.out.print("  ");
                        }
                    }
                }
            }
            System.out.println();
        }
    }

    public static void printStar() {
        System.out.print("* ");
    }

    public static void printAtSign(){
        System.out.print("@ ");
    }
}
