package homeworks;

import java.util.Scanner;

/**
 * Created by Vlastimil Fengl on 14. 1. 2016.
 */
public class PoziceFigury {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        while((n = sc.nextInt()) > 0){
            playGame(sc, n);
        }
    }

    public static void playGame(Scanner sc, int n){
        int[] boardDimension = new int[2];
        int[] position = new int[2];
        int[] direction = new int[2];
        int numMoves;
        boolean err = false;

        boardDimension[0] = n;
        boardDimension[1] = sc.nextInt();

        position[0] = sc.nextInt();
        position[1] = sc.nextInt();

        direction[0] = sc.nextInt();
        direction[1] = sc.nextInt();

        numMoves = sc.nextInt();

        for (int i = 0; i < numMoves; i++){
            int move = sc.nextInt();
            if(move != 0){
                setDirection(direction, move);
            } else {
                if((direction[0]+position[0]) < 0 || (direction[1]+position[1]) < 0 || (direction[0]+position[0]) >= boardDimension[0] || (direction[1]+position[1]) >= boardDimension[1]){
                    err = true;
                }else{
                    position[0] += direction[0];
                    position[1] += direction[1];
                }
            }
        }
        if(err){
            System.out.println("ERR");
        } else {
            System.out.println(position[0]+" "+position[1]+" "+direction[0]+" "+direction[1]);
        }
    }

    public static void setDirection(int[] dir, int i){
        if(i == 1){
            if(dir[0] == -1 || dir[1] == 1){
                dir[0] = (dir[0] - i)%2;
                dir[1] = (dir[1] - i)%2;
            } else {
                dir[0] = (dir[0] + i)%2;
                dir[1] = (dir[1] + i)%2;
            }
        } else {
            if(dir[0] == 1 || dir[1] == -1){
                dir[0] = (dir[0] + i)%2;
                dir[1] = (dir[1] + i)%2;
            } else {
                dir[0] = (dir[0] - i)%2;
                dir[1] = (dir[1] - i)%2;
            }
        }
    }
}
