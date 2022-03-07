package it.thread.sync;

public class Cliente extends Thread{
    private double sommaDaPrelevare;

    public Cliente(String nomeCliente, double sommaDaPrelevare) {
        super();
        this.setName(nomeCliente);
        this.sommaDaPrelevare = sommaDaPrelevare;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " arriva al bancomat");
        System.out.println("Quando arriva "+ Thread.currentThread().getName() + " il saldo è " + ContoCorrente.getInstance());
        System.out.println("La somma che vuole prelevare "+ Thread.currentThread().getName() + " è: " + sommaDaPrelevare);

        try {
            ContoCorrente.getInstance().prelievo(sommaDaPrelevare);
            System.out.println(Thread.currentThread().getName() + " TUTTO OK PRELIEVO EFFETTUATO");
        } catch (Exception e) {
            System.out.println(Thread.currentThread().getName() + " NOOOOOOOO NON HAI SOLDI !!!");
            e.printStackTrace();
        }

    }
}
