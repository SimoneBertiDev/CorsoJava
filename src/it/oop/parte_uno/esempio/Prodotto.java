package it.oop.parte_uno.esempio;

import java.util.ArrayList;
import java.util.List;

public class Prodotto {
    private int id;
    private String name;
    private String descrizione;
    private double prezzo;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    public double getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(double prezzo) {
        this.prezzo = prezzo;
    }
    public List<String> getSores(){
        ArrayList<String> tmp = new ArrayList<String>();

        tmp.add("negozio 1");
        tmp.add("negozio 2");
        tmp.add("negozio 3");
        tmp.add("negozio 4");

        return tmp;
    }

}
