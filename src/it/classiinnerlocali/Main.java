package it.classiinnerlocali;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Appertamento a = new Appertamento();
        a.setPiano(33);
        a.getStanzeStandards().add(new StanzaStandard(55,"prese"));
        //a.getStanzeInners().add(new Appertamento.StanzaInner(44,"siomne"));//Come aggirare questo problema
        //creando un metodo dentro la classe in cui ce il metodo che vogliamo usare
        //Quindi ->
        a.aggiungiStanza(55,"prese");

        List<StanzaStandard> st = a.getStanzeStandards();
        for (StanzaStandard s: st) {
            System.out.println(s.getMq() + " " + s.getAccessori());
        }
        
        List<Appertamento.StanzaInner> sI = a.getStanzeInners();
        for (Appertamento.StanzaInner sinn: sI) {
            System.out.println(sinn.getAccessori() + " " + sinn.getMq());
        }
    }
}
