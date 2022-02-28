package it.oop.parte_due;

import java.util.ArrayList;
import java.util.List;

public class Televisore extends Prodotto{
    private String pollici;
    private String accessori;

    public String getPollici() {
        return pollici;
    }

    public void setPollici(String pollici) {
        this.pollici = pollici;
    }

    public String getAccessori() {
        return accessori;
    }

    public void setAccessori(String accessori) {
        this.accessori = accessori;
    }

    public void cambiaCanale(){

    }

    public void accendi(){

    }

    public void spegni(){

    }

    @Override
    public List<String> getSores() {
        List<String> tmp = super.getSores();

        List<String> temp2 = new ArrayList<String>();

        for (String string : tmp) {
            if (string.contains("1") || string.contains("2")){
                temp2.add(string);
            }
       }
        return temp2;
    }
}
