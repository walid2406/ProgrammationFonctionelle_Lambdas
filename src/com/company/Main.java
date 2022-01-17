package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.function.IntBinaryOperator;

public class Main {
    public static   void affiche(int c){

        System.out.println(c);

    }

    public static void main(String[] args) {

        List<Integer> liste = new ArrayList<>();
        liste.add(1);
        liste.add(2);
        liste.add(3);
        liste.add(4);

// trie la liste en plaçant en premier les nombres pairs
        liste.sort((e1, e2) ->{
            //System.out.println(e1+"**"+e1.compareTo(e2)+"**"+e2);

            System.out.println((e1 % 2)+"**"+((e1 % 2) - (e2 % 2))+"**"+(e2 % 2));
            //e1.compareTo(e2);
            return (e2 % 2) - (e1 % 2);
        });

// [2, 4, 1, 3]
        System.out.println(liste);





//        List<String> prenoms = new ArrayList<>();
//        prenoms.add("Murielle");
//        prenoms.add("Jean");
//        prenoms.add("Michelle");
//
//        List<String> helloList = new ArrayList<>();
//
//        prenoms.forEach(e ->{ helloList.add("Hello " + e);
//        System.out.println(e);
//
//        });
//
//// [Hello Murielle, Hello Jean, Hello Michelle]
//        System.out.println(helloList);

    }
}
