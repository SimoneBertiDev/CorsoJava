package it.liste;

import it.oop.parte_due.gestionale.Smartphone;

public class Main {
    public static void main(String[] args) {
        Main m = new Main();
        m.creaArray();

        m.arrayMultidimensionale();
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
