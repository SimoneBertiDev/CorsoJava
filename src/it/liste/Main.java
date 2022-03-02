package it.liste;

import it.oop.parte_due.gestionale.Smartphone;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Main m = new Main();
        //m.creaArray();
        //m.arrayMultidimensionale();
        //m.esempioArrayList();
        //m.esempioHashMap();
        //m.getConfig();
        //m.esempioIterazione();
        m.esempioHashMap();
    }

    public void esempioIterazione(){
        List<String> list = new ArrayList<String>();
        System.out.println(list.isEmpty());
        list.add("mario");
        list.add("mario1");
        list.add("mario2");
        list.add("mario3");
        list.add("mario4");

        System.out.println("---------for");
        /*Metodo uno for/foreach*/
        for (int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));//in c# e come gli array list[i]
        }
        System.out.println("---------foreach");
        for (String lita : list) {
            System.out.println(lita);
        }
        System.out.println("---------Iterator");
        /*Metodo iterator*/
        Iterator<String> s = list.iterator();

        while (s.hasNext()){
            System.out.println(s.next());
        }
    }

    public void getConfig() {
        Properties properties = new Properties();

        try {
            InputStream s = new FileInputStream(new File("C:\\Users\\simone.berti\\eclipse-workspace\\CorsoJava\\config.properties"));
            properties.load(s);
            String nameDb = properties.getProperty("db-name");
            System.out.println(nameDb);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


    public void esempioHashMap() {
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

        System.out.println(mappa.values());

        for (var k :
                mappa.values()) {
            System.out.println(k.getMarca());
        }

        Iterator<String> key = mappa.keySet().iterator();

        while (key.hasNext()){
            System.out.println(key.next());
        }


    }

    public void esempioArrayList() {
        List<String> list = new ArrayList<String>();
        //ArrayList<String> list1 = new ArrayList<String>();
        System.out.println(list.isEmpty());
        list.add("mario");
        list.add("mario1");
        list.add("mario2");
        list.add("mario3");
        list.add("mario4");

        list.add(2, "mario5");
        for (String nome : list) {
            System.out.println(nome);
        }
        System.out.println(list.size());

        System.out.println("-------");
        list.remove(2);
        for (String nome : list) {
            System.out.println(nome);
        }
        System.out.println(list.size());

        System.out.println("-------");
        list.set(2, "modifico un valore");
        for (String nome : list) {
            System.out.println(nome);
        }
        System.out.println(list.size());
        System.out.println(list.isEmpty());
        System.out.println();

        System.out.println("restisuisco la posizione di dove si trova questo carattere mario -> " + list.indexOf("mario"));
        System.out.println("-------");
        System.out.println(list);
        System.out.println("-------");
        System.out.println("converto la lista in un array di stringhe");
        //String[] listaToArrayCast = (String[]) list.toArray();//non garantisce la corretta conversione
        String[] listaToArrayIsta = list.toArray(new String[list.size()]);

        for (String l : listaToArrayIsta) {
            System.out.println(l);
        }

        System.out.println();
        list.clear();
        System.out.println(list.size());
        System.out.println(list.isEmpty());
        System.out.println();


        List<Smartphone> sm = new ArrayList<Smartphone>();
        Smartphone sm1 = new Smartphone();
        sm1.setMarca("Apple");
        sm1.setModello("iphone1");

        Smartphone sm2 = new Smartphone();
        sm2.setMarca("Samsung");
        sm2.setModello("A20");

        sm.add(sm1);
        sm.add(sm2);

        for (Smartphone smart : sm) {
            System.out.println(smart.getMarca() + " " + smart.getModello());
        }
        System.out.println(sm);

    }


    public void arrayMultidimensionale() {
        int[][] matrice = new int[10][10];

        for (int i = 0; i < matrice.length; i++) {
            for (int j = 0; j < matrice[i].length; j++) {
                matrice[i][j] = i + j;
            }
        }

        for (int i = 0; i < matrice.length; i++) {
            int contatore = matrice[i].length;
            for (int j = 0; j < matrice[i].length; j++) {

                if (contatore == 1) {
                    System.out.println();
                } else {
                    contatore--;
                    System.out.print(matrice[i][j] + " ");
                }

            }
        }
    }

    public void creaArray() {
        int[] test;

        test = new int[5];

        int[] numeri = new int[10];

        numeri[0] = 10;
        numeri[1] = 10;
        numeri[2] = 10;
        numeri[3] = 10;

        for (int i = 0; i < numeri.length; i++) {
            numeri[i] = 10 + i;
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
