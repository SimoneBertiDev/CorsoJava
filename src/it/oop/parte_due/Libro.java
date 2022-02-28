package it.oop.parte_due;

import java.util.ArrayList;
import java.util.List;

public class Libro extends Prodotto {
    private String autore;


    public String getAutore() {
        return autore;
    }

    public void setAutore(String autore) {
        this.autore = autore;
    }

    @Override
    public List<String> getSores() {
        ArrayList<String> tmp = new ArrayList<String>();

        tmp.add("negozio 1");
        tmp.add("negozio 2");

        return tmp;
    }
}
