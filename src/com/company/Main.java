package com.company;

import java.util.Scanner;

public class Main {

    static int n, m;
    static int[] laCombinaison = new int[4];
    static int[] uneCombinaison = new int[4];

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("n : ");   n = sc.nextInt();
        System.out.print("m : ");   m = sc.nextInt();
        System.out.print("Pourrez vous trouver ma combinaison de 4 " +
                "chiffres [compris entre "+n+" et "+m+" avec\n" +
                "répétitions possibles] en moins de 10 coups ?\n" +
                "Entrez les 4 chiffres de votre proposition:\n");

        demanderCoup();
        tirerCombinaison(uneCombinaison);




//        for (int a : uneCombinaison) {
//            System.out.print("combinaison est : " + a);
//        }

//        if(checkRange()){
//
//        }

    }

    static void demanderCoup(){
        Scanner sc = new Scanner(System.in);
        for (int j = 0; j < 4; j++) {
            laCombinaison[j] = sc.nextInt();
        }
    }

//    static boolean checkRange(){
//        boolean inRange = true;
//        for (int i = 0; i < 4; i++) {
//            if(laCombinaison[i] < n || laCombinaison[i] > m){
//                inRange = false;
//                break;
//            }
//        }
//        return inRange;
//    }

    static void tirerCombinaison(int[] uneCombinaison){
        for (int i = 0; i < 4; i++) {
            uneCombinaison[i] = hasard(m);
        }
    }

    static int hasard(int max) {
        return (1 + (int)(Math.random() * max));
    }


}

