package it.thread.sync;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        /*Cliente c1 = new Cliente("simone", 10);
        Cliente c2 = new Cliente("silvia", 50);

        //Avvio i thread
        c1.start();
        c2.start();

        //Attendo il completamento
        c1.join();
        c2.join();*/

        ClienteNonSync c1 = new ClienteNonSync("simone", 30);
        ClienteNonSync c2 = new ClienteNonSync("silvia", 30);

        //Avvio i thread
        c1.start();
        c2.start();

        //Attendo il completamento
        c1.join();
        c2.join();

    }

}
