package it.oop.parte_uno.esempio;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        Utente pippo = new Utente();


        Prodotto p = new Prodotto();
        List<String> pr = p.getSores();

        Smartphone sm = new Smartphone();
        List<String> s =sm.getSores();

        Libro l = new Libro();
        List<String> li =l.getSores();


        System.out.println(li);
        System.out.println(s);
        System.out.println(pr);

//        p.azienda = "pippo";

        //instanceof ritorna true se il valore object è non null ed è di tipo TypeClass, altrimenti ritorna false.
    }
}
