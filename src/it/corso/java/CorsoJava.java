package it.corso.java;

//import Corso.lezione.Calcolatore.Calcolatrice;

//import Corso.lezione.Calcolatore.Calcolatrice;
import it.corso.java.ciclo.ForWhileDoWhile;
import it.corso.java.condizionali.ifElseSwitcCase;

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

        ForWhileDoWhile ciclo = new ForWhileDoWhile();
        ciclo.itera(0,5);
        ciclo.iteraDoWhile(0,0);

        String[] arr = new String[]{"simone","berti"};
        ciclo.iteraFor(arr);

        int[] arri = new int[]{1,2,3,4,5,6,7,8,9,10};
        ciclo.iteraFor(arri);



        //Implementiamo il singleton
        ifElseSwitcCase.getInstance().isNull("test");
        ifElseSwitcCase.getInstance().recuperaIlMaggore(44,55,77);//NON RICREARA L'ISTANZA PERCHè E GIà STATA CREATA IN PRECEDENZA.
        ifElseSwitcCase.getInstance().recuperaTest(4);




        /*ifElseSwitcCase condizionali = new ifElseSwitcCase();
        System.out.println(condizionali.recuperaIlMaggore(55,55,4));*/

//        System.out.println("hellos");
        /*Variabile locale*/
        int a = 10;
        CorsoJava c = new CorsoJava(); /*Due in uno Dichiarazione + Inizializzazione Molto Easy se si sa già ma è giusto per ripassare un po di nozioni*/
        int s = c.s;

        System.out.println(CorsoJava.j);

        CorsoJava c1; /*Dichiarazione*/
        c1 = new CorsoJava();/*Inizializzazione*/

        int p = 10;
        int b = 20;

        /*Calcolatrice cal = new Calcolatrice();
        cal.somma(p,b);*/
        float f = 100.45f;
        float g = -10.30f;

//        Calcolatrice cal = new Calcolatrice();
//        System.out.println(cal.somma(f,g));
//
//        double ddou = 100.45;
//        double doun = -10.30;
//
//        System.out.println(cal.somma(ddou,doun));

        char ch = 'a';
        char chf = 'b';
        char som = (char) (ch + chf); /*Non è la concatena di due stringhe ma la somma dei valori dei char quindi /u0003 + /u0004 (esempio)*/
        System.out.println(som);

        char concatena = 'd';
        String d = "Ciao ";
        System.out.println(d + concatena); /*Ora è si tratta di una concatenzione effettiva aggiungi alla mia stringa il char*/



        CorsoJava corso = new CorsoJava();
        corso.esempioStringhe();

        String simone = corso.Concatenatore("simon","simone2","simone3","simone4");
        System.out.println(simone);
    }

    public void esempioStringhe(){
        String var1 = "Lorem ipsum\" non so che scriver "; /*La classe string è imutabile non si puo modificare ma i suoi metodi si tipo il toString*/
        char[] array = {'S','t','r','i','n','g'};
        String str = new String(array);

        System.out.println(var1.concat(str));
        System.out.println(var1.toLowerCase());
        System.out.println(var1.toUpperCase());
        System.out.println(var1.trim());//eleimina gli spazzi allinizio e alla fine di una stringa

        //dai figa sono i soliti simone puoi andare a vanti pero no andiamo a vedere anche il replacee /all /First

        //estrazione substrings inizio e fine o solo inizio della stringa

        //confronto equals equalsIgnoreCase uno e casesenstive mentre l'altro no

        //Metodi generali valueOf Split startWith endsWith CharAt quello che ho usato di più nella mia vi

    }

    /*Immaginaiamo di avere un metodo che concatini più stringhe non si sa quante stringhe si devono concatenar*/
    public String Concatenatore(String...vars){
        String out = "";

        for(int i = 0; i < vars.length; i ++){
            out += vars[i];
        }

        return out;
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
