package it.thread;

public class EsempioThread extends Thread {
    @Override
    public void run() {
        System.out.println("thread1" + getName());
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
