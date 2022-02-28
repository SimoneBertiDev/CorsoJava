package it.oop.parte_due;

import java.util.ArrayList;
import java.util.List;

public class Prodotto {
    private int id;
    private String name;
    private String descrizione;
    private double prezzo;
    //public String azienda; //Non c'è bisogno di creare i get e i set di questa varibile dal momento in cui e gia accessibile
    //solo le costanti possono essere dichiarate di tipo pubblico perché sono inmutabili.
    public static final String TIPO_PRODOTTO = "GENERICO";


    //Costruttore default anche se non lo dichiariamo e gia dichiarato automaticamente cioe non serve specificarlo
    public Prodotto(){
        super();
    }

    public Prodotto(int id, String name, double prezzo) {
        super();
        //si come bisogna elaborare il dato non basta dire che questo e uguale a questo ma bisogna far lavorare il metodo
        setName(name);
        setId(id);
        setPrezzo(prezzo);
    }

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
        String tmp = name.concat("...");
        this.name = tmp;
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
        if(prezzo == 0){
            prezzo = 1;
        }
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
