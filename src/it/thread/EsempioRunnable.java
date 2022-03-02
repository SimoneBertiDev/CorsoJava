package it.thread;

public class EsempioRunnable implements Runnable{
    @Override
    public void run() {
        System.out.println("sono runnable");
        for (int i =0; i <10;i ++){
            System.out.println(i);
        }
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
