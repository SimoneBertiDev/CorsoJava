package it.classiinnerlocali;

import java.util.ArrayList;
import java.util.List;

public class Appertamento {
    private int piano;
    private List<StanzaInner> stanzeInners;
    private List<StanzaStandard> stanzeStandards;

    public int getPiano() {
        return piano;
    }

    public void setPiano(int piano) {
        this.piano = piano;
    }

    public List<StanzaInner> getStanzeInners() {
        if(stanzeInners == null){
            stanzeInners = new ArrayList<StanzaInner>();
        }

        return stanzeInners;
    }

    public void setStanzeInners(List<StanzaInner> stanzeInners) {
        this.stanzeInners = stanzeInners;
    }

    public List<StanzaStandard> getStanzeStandards() {
        if(stanzeStandards == null){
            stanzeStandards = new ArrayList<StanzaStandard>();
        }
        return stanzeStandards;
    }

    public void setStanzeStandards(List<StanzaStandard> stanzeStandards) {
        this.stanzeStandards = stanzeStandards;
    }

    //usare i metodi della classe inner in altre classi non apartenenti a questa calsse
    public void aggiungiStanza(double mq, String accessori){
        //Classi locali sono dichiarate dentro i metodi
        //questa classe e visiile sono dentro questo metodo
        class CalcolaSomma{
            public double calcolaPerimetro(double lato1, double lato2){
                return lato1 + lato2;
            }
        }

        CalcolaSomma calcolaSomma = new CalcolaSomma();
        calcolaSomma.calcolaPerimetro(3,6);

        getStanzeInners().add(new StanzaInner(mq,accessori));
    }

    //classe Inner dentro appartamento che non è come la classe standard (StanzaStandard)
    class StanzaInner{
        private double mq;
        private String accessori;

        public StanzaInner(double mq, String accessori) {
            this.mq = mq;
            this.accessori = accessori;
        }

        public double getMq() {
            return mq;
        }

        public void setMq(double mq) {
            this.mq = mq;
        }

        public String getAccessori() {
            return accessori;
        }

        public void setAccessori(String accessori) {
            this.accessori = accessori;
        }
    }
}
