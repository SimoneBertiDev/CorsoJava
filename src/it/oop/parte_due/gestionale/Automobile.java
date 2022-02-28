package it.oop.parte_due.gestionale;

public class Automobile extends Prodotto {
    private String classe;
    private String verniciatura;
    private String alimentazione;
    private String motore;


    @Override
    public void stampaProdotto() {
        System.out.println(getAlimentazione() + " " + getClasse() + " " + getMotore() + " " + getVerniciatura());
    }

    public String getClasse() {
        return classe;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }

    public String getVerniciatura() {
        return verniciatura;
    }

    public void setVerniciatura(String verniciatura) {
        this.verniciatura = verniciatura;
    }

    public String getMotore() {
        return motore;
    }

    public void setMotore(String motore) {
        this.motore = motore;
    }

    public String getAlimentazione() {
        return alimentazione;
    }

    public void setAlimentazione(String alimentazione) {
        this.alimentazione = alimentazione;
    }
}
