package it.corso.java;

import java.io.File;

public class CorsoJava {
    /*Variabili d'istanza*/
    private final int contatore = 0;
    int s = 5;

    /*Variabili di classe*/
    public static String j = "classe";

    /*Costruttori*/
    public CorsoJava() {
        super();
    }

    public static void main(String[] args) {
        System.out.println("hellos");
        /*Variabile locale*/
        int a = 10;
        CorsoJava c = new CorsoJava();
        int s = c.s;
    }

    /*Metodi*/
    private String test() {
        return "ok";
    }
    /*Parametri ARGS*/
    public String concatena(String string1, String string2, double c, File file){
        return string1.concat(string2);
    }
}
