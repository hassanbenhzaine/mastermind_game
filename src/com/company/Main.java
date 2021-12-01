package com.company;

import java.util.*;

public class Main {

    static int n = 1, m = 6;
    static ArrayList<Integer> laCombinaison = new ArrayList<>();
    static ArrayList<Integer> uneCombinaison = new ArrayList<>();
    static int hashtagCtr = 1;



    public static void main(String[] args) {
        System.out.print("Pourrez vous trouver ma combinaison de 4 " +
                "chiffres [compris entre "+ n +" et " + m + " avec\n" +
                "répétitions possibles] en moins de 10 coups ?\n");

        tirerCombinaison(uneCombinaison);
        for (Integer a:uneCombinaison
             ) {
            System.out.print(a);

        }

        byte counter = 0;
        while(hashtagCtr < 4) {
            System.out.println("\nEntrez les 4 chiffres de votre proposition:");
            demanderCoup(laCombinaison);

            for (int i = 0; i < 4; i++) {
                if(laCombinaison.get(i) == uneCombinaison.get(i)){
                    System.out.print("#");
                    hashtagCtr++;

                }
            }

            counter++;
            if(counter > 10){
                System.out.println("Désolé vous n'avez pas trouvé...\n" +
                        "La bonne réponse était ");
                System.exit(1);
            }
        }
        System.out.println("\nBravo ! Vous avez trouvé en "+ counter +" coups\n");



    }

    static void demanderCoup(ArrayList<Integer> laCombinaison){
        Scanner sc = new Scanner(System.in);
        laCombinaison.clear();
        for (int i = 0; i < 4; i++) {
            laCombinaison.add(sc.nextInt());
        }
    }


    static void tirerCombinaison(ArrayList<Integer> uneCombinaison){
        int a = 0;
        while (a < 4){
            uneCombinaison.add(hasard(m));
            a++;
        }
    }

    static int hasard(int max) {
        return (1 + (int)(Math.random() * max));
    }


}

