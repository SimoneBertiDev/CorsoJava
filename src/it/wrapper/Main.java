package it.wrapper;

public class Main {
    public static void main(String[] args) {
        int a = 10;//essendo un dato primitivo non ho la disponibilità di avere metodi a.qualcosa
        Integer a1 = new Integer(10);//non so da quale versione
        Integer a2 = 10;//ma si puo scrivere anche cosi non so da quale versione
        //mentre se viene dichiarato come classe si
        System.out.println(a1.intValue());

        String s = new String("simone");
    }
}
