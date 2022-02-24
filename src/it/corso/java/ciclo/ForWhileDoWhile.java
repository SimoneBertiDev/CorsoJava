package it.corso.java.ciclo;

public class ForWhileDoWhile {

    public void itera(int contatore, int estremo) {
        while (contatore < estremo) {
            System.out.println("Contatore vale -> " + contatore);
            contatore++;
        }
        System.out.println("Sono uscito dal ciclo");
    }

    public void iteraDoWhile(int contatore, int estremo) {
        do {
            System.out.println("Contatore vale -> " + contatore);
            contatore++;
        } while (contatore < estremo);
        System.out.println("Sono uscito dal ciclo");
    }

    public void iteraFor(int contatore){
        for (int i = 0; i < contatore; i++){
            System.out.println("Valore di i -> " + i);
        }
    }

    public void iteraFor(String[] arr){
        if(arr != null){
            for (int i = 0; i < arr.length; i++){
                System.out.println(arr[i]);
            }
        }
    }

    public void iteraFor(int[] val){
        if(val != null){
            for (int i: val) {
                System.out.println(i);
            }
        }
    }
}
