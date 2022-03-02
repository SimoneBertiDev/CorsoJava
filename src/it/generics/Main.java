package it.generics;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //senza generics boh e ce sono gia parecchio abbituato a lavorare con dati tipicizati senza lascarli al caso
        List lista1 = new ArrayList();
        lista1.add(2);//e generica c'è non si sa se sono stringhe o interi o double
        lista1.add("simon");//si possono usare per mettere diversi tipi di dato pero boh lavoriamo a modelli a sto punto
        //puo creare dei probelmi perché non sappiamo l'iniesimo elemento che cosa sia banane mango ??? boh
        String g = (String) lista1.get(0);//ritorna un oggetto
        //ricordiamoci che il casting e sempre pesante
        for (var s :  lista1) {
            System.out.println(s.getClass());
        }
        /*con generics*/
        List<String> lista2 = new ArrayList<>();
        lista2.add("simone");
        lista2.add("stringa");
        lista2.add("pere");
        lista2.get(0);//ritorna un stringa
        //sappiamo che dentro saranno sempre presente stringhe non cavoli o finocchi
        for (String pere: lista2) {
            System.out.println(pere);
        }
    }
}
