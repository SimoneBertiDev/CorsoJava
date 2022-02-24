package it.oop.parte_uno.esempio;

import java.util.ArrayList;
import java.util.List;

public class Libro extends Prodotto{
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

        tmp.add("libreria 1");
        tmp.add("Libreria 2");

        return tmp;
    }
}
