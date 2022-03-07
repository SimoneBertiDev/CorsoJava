package it.thread.prodcons;

import java.util.List;

public class Consumer implements Runnable {
    private final List<Integer> bufferCondiviso;

    public Consumer(List<Integer> bufferCondiviso, int size) {
        this.bufferCondiviso = bufferCondiviso;
    }

    @Override
    public void run() {
        while (true) {
            try {
                System.out.println("Il thread sta leggendo il buffer ... ");
                consume();
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private void consume() throws InterruptedException {
        //Il thread rimane in stato wait se il buffer e vuoto.
        while (bufferCondiviso.isEmpty()) {
            synchronized (bufferCondiviso) {
                System.out.println("Il buffer è vuoto, il thread Consumer resta in attesa... la dimensione del buffer adesso è: " + bufferCondiviso.size());
                bufferCondiviso.wait();
            }
        }

        //Il buffer contiene elementi, quindi può eliminare uno e notificarlo al producer
        synchronized (bufferCondiviso) {
            System.out.println("Il thread Consumer sta leggendo il buffer ed eliminando il seguente elemento " + bufferCondiviso.remove(0) + " la dimensione del buffer è: " + bufferCondiviso.size());
            bufferCondiviso.notifyAll();
        }

    }
}
