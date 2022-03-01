package it.liste;

import com.sun.source.tree.UsesTree;
import it.oop.parte_due.gestionale.Smartphone;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Main m = new Main();
        //m.creaArray();
        //m.arrayMultidimensionale();
        //m.esempioArrayList();
        m.esempioHashMap();
    }

    public void esempioHashMap(){
        Map<String, Smartphone> mappa = new HashMap<String, Smartphone>();
        //HashMap<String, Smartphone> mappa2 = new HashMap<String, Smartphone>();

        Smartphone sm1 = new Smartphone();
        sm1.setMarca("Apple");
        sm1.setModello("iphone1");

        Smartphone sm2 = new Smartphone();
        sm2.setMarca("Samsung");
        sm2.setModello("A20");
        //Aggiungere valori alla mappa
        mappa.put(sm1.getModello(), sm1);
        mappa.put(sm2.getModello(), sm2);

        Smartphone s = mappa.get("iphone1");
        System.out.println(s.getMarca() + " " + s.getModello());

        Set<String> chiavi = mappa.keySet();

        System.out.println("-----");
        for (String key :
                chiavi) {
            System.out.println(key);
        }
        System.out.println("-----");

    }

    public void esempioArrayList(){
        List<String> list = new ArrayList<String>();
        //ArrayList<String> list1 = new ArrayList<String>();
        System.out.println(list.isEmpty());
        list.add("mario");
        list.add("mario1");
        list.add("mario2");
        list.add("mario3");
        list.add("mario4");

        list.add(2,"mario5" );
        for (String nome: list) {
            System.out.println(nome);
        }
        System.out.println(list.size());

        System.out.println("-------");
        list.remove(2);
        for (String nome: list) {
            System.out.println(nome);
        }
        System.out.println(list.size());

        System.out.println("-------");
        list.set(2,"modifico un valore");
        for (String nome: list) {
            System.out.println(nome);
        }
        System.out.println(list.size());
        System.out.println(list.isEmpty());
        System.out.println("");

        System.out.println("restisuisco la posizione di dove si trova questo carattere mario -> "+list.indexOf("mario"));
        System.out.println("-------");
        System.out.println(list.toString());
        System.out.println("-------");
        System.out.println("converto la lista in un array di stringhe");
        //String[] listaToArrayCast = (String[]) list.toArray();//non garantisce la corretta conversione
        String[] listaToArrayIsta =  list.toArray(new String[list.size()]);

        for (String l : listaToArrayIsta) {
            System.out.println(l);
        }

        System.out.println("");
        list.clear();
        System.out.println(list.size());
        System.out.println(list.isEmpty());
        System.out.println("");


        List<Smartphone> sm = new ArrayList<Smartphone>();
        Smartphone sm1 = new Smartphone();
        sm1.setMarca("Apple");
        sm1.setModello("iphone1");

        Smartphone sm2 = new Smartphone();
        sm2.setMarca("Samsung");
        sm2.setModello("A20");

        sm.add(sm1);
        sm.add(sm2);

        for (Smartphone smart: sm) {
            System.out.println(smart.getMarca() + " " + smart.getModello());
        }
        System.out.println(sm.toString());

    }


    public void arrayMultidimensionale(){
        int[][] matrice =  new int[10][10];

        for (int i = 0; i < matrice.length; i++){
            for (int j = 0; j < matrice[i].length; j++){
                matrice[i][j] = i+j;
            }
        }

        for (int i = 0; i < matrice.length; i++){
            int contatore = matrice[i].length;
            for (int j = 0; j < matrice[i].length; j++){

                if(contatore == 1) {
                    System.out.println("");
                }else {
                    contatore--;
                    System.out.print(matrice[i][j] + " ");
                }

            }
        }
    }

    public void creaArray(){
        int[] test;

        test= new int[5];

        int[] numeri = new int[10];

        numeri[0] = 10;
        numeri[1] = 10;
        numeri[2] = 10;
        numeri[3] = 10;

        for (int i = 0; i < numeri.length; i++){
            numeri[i] = 10+i;
        }

        for (int numero : numeri) {

        }

        Smartphone[] prodotti = new Smartphone[2];

        prodotti[0] = new Smartphone();
        prodotti[0].setModello("iphone1");
        prodotti[0].setMarca("Apple");
        prodotti[0].setPrezzo(88);

        prodotti[1] = new Smartphone();
        prodotti[1].setModello("a10");
        prodotti[1].setMarca("sumsang");
        prodotti[1].setPrezzo(10);

        for (Smartphone p :
                prodotti) {
         System.out.println(p.getMarca() + " " + p.getPrezzo());
        }


    }
}
