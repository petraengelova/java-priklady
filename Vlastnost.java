package homeworks;

import java.util.Scanner;

public class Vlastnost {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pocetZadani = sc.nextInt();
        for (int i = 0; i < pocetZadani; i++){
            System.out.println(Inkrementace(sc));
        }
    }

    public static int Inkrementace(Scanner sc){
        int PocetCisel = sc.nextInt();
        int reseni = -1;
        boolean vyhodnoceni = true;
        int predchozi;
        int posloupnost = sc.nextInt();
        for (int i =  1; i < PocetCisel; i++){
            predchozi = posloupnost;
            posloupnost = sc.nextInt();
            if(posloupnost == 0){
                reseni = predchozi+1;
            }else{
                if(reseni != -1){
                    if((predchozi+1) == posloupnost){
                        if(predchozi < reseni && posloupnost < reseni){

                        }else{
                            reseni = posloupnost+1;
                        }
                    } else {
                        vyhodnoceni = false;
                    }
                } else {
                    if((predchozi+1) == posloupnost){
                        reseni = posloupnost+1;
                    } else {
                        vyhodnoceni = false;
                    }
                }
            }
        }
        if(!vyhodnoceni){
            reseni = -1;
        }
        if(PocetCisel == 1){
            reseni = posloupnost+1;
        }
        return reseni;
    }
}
