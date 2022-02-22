package it.corso.java;

import Corso.lezione.Calcolatore.Calcolatrice;

import java.io.File;

public class CorsoJava {
    /*Variabili di classe*/
    public static String j = "classe";

    /*Variabili d'istanza*/
    private final int contatore = 0;
    int s = 5;

    /*Costruttori*/
    public CorsoJava() {
        super();
    }

    public static void main(String[] args) {
        System.out.println("hellos");
        /*Variabile locale*/
        int a = 10;
        CorsoJava c = new CorsoJava(); /*Due in uno Dichiarazione + Inizializzazione Molto Easy se si sa già ma è giusto per ripassare un po di nozioni*/
        int s = c.s;

        System.out.println(CorsoJava.j);

        CorsoJava c1; /*Dichiarazione*/
        c1 = new CorsoJava();/*Inizializzazione*/

        int p = 10;
        int b = 20;

        Calcolatrice cal = new Calcolatrice();
        cal.somma(p,b);
    }

    /*Metodi*/
    private String test() {
        return "ok";
    }

    /*Parametri ARGS*/
    public String concatena(String string1, String string2, double c, File file) {
        return string1.concat(string2);
    }
}
