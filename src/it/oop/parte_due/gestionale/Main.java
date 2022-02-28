package it.oop.parte_due.gestionale;

import java.util.ArrayList;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        OrdineDiVendita odv = new OrdineDiVendita();

        odv.setCliente(new Cliente());
        odv.setDataOrdine(new Date());
        odv.setStatoOrdine(OrdineDiVendita.STATO_IN_ATTESA);
        odv.setRigheOrdine(new ArrayList<RigaOrdine>());

        odv.getCliente().setCodiceFiscale("FRNGFK88R88SJ102V");
        odv.getCliente().setNome("Mario");
        odv.getCliente().setCognome("Rossi");

        Smartphone sm1 = new Smartphone();
        sm1.setMarca("Apple");
        sm1.setModello("iPhone 11");
        sm1.setPrezzo(600.99);

        Televisore tv1 = new Televisore();
        tv1.setMarca("SONY");
        tv1.setModello("Alfa 1");
        tv1.setPrezzo(800.22);

        RigaOrdine rg1 = new RigaOrdine(1,sm1,1, sm1.getPrezzo());
        RigaOrdine rg2 = new RigaOrdine(2,tv1,1, tv1.getPrezzo());

        odv.getRigheOrdine().add(rg1);
        odv.getRigheOrdine().add(rg2);

        sm1.stampaProdotto();
        tv1.stampaProdotto();
    }
}
