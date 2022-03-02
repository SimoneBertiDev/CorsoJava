package it.wrapper;

public class Main {
    public static void main(String[] args) {
        int a = 10;//essendo un dato primitivo non ho la disponibilità di avere metodi a.qualcosa
        Integer a1 = new Integer(10);//non so da quale versione
        Integer a2 = 10;//ma si puo scrivere anche cosi non so da quale versione
        //mentre se viene dichiarato come classe si
        System.out.println(a1.intValue());

        String s = new String("simone");

        /*boxing*/
        Double d1 = new Double(10);

        double d2 = 90.451;

        Double d3 = new Double(d2);
        /*autoboxing*/
        Double d4 = 3.44;//crea in automatico l'istanza

        /*unboxing*/
        double d5 = d4;
    }
}
