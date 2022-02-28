package it.oop.parte_uno.esempio;

import java.util.ArrayList;
import java.util.List;

public class Smartphone extends Prodotto{
    private String imei;



    public String getImei() {
        return imei;
    }

    public void setImei(String imei) {
        this.imei = imei;
    }

    @Override
    public List<String> getSores() {
        ArrayList<String> tmp = new ArrayList<String>();

        tmp.add("negozio 3");
        tmp.add("negozio 4");

        return tmp;
    }
}
