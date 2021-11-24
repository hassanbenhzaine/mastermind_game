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

        demanderCoup(laCombinaison);
        tirerCombinaison(uneCombinaison);

        for (int i = 0; i < uneCombinaison.length; i++) {
            byte win = 0;
            if(uneCombinaison[i] == laCombinaison[i]){
                System.out.print("#");
                win++;
            }else{
                System.out.print("O");
            }
        }



    }

    static void demanderCoup(int[] laCombinaison){
        Scanner sc = new Scanner(System.in);
        for (int j = 0; j < 4; j++) {
            laCombinaison[j] = sc.nextInt();
            if(!checkRange(laCombinaison[j])){
                System.out.println("Not in range");
                System.exit(1);
            }
        }
    }

    static boolean checkRange(int chiffre){
        if(chiffre< n || chiffre > m){
            return false;
        }else{
            return true;
        }
    }

    static void tirerCombinaison(int[] uneCombinaison){
        for (int i = 0; i < 4; i++) {
            uneCombinaison[i] = hasard(m);
        }
    }

    static int hasard(int max) {
        return (1 + (int)(Math.random() * max));
    }


}

