package it.thread;

public class Main {
    public static void main(String[] args) {
//        EsempioThread thread = new EsempioThread();
//        thread.start();
//
//        EsempioRunnable esempioRunnable = new EsempioRunnable();
//        Thread t1 = new Thread(esempioRunnable);
//        t1.start();

        EsempioThread thread = new EsempioThread();
        thread.setName("EsempioClass");

        EsempioThread thread1 = new EsempioThread();
        thread1.setName("EsempioClass1");

        EsempioThread thread2 = new EsempioThread();
        thread2.setName("EsempioClass2");

        EsempioThread thread3 = new EsempioThread();
        thread3.setName("EsempioClass3");

        EsempioThread thread4 = new EsempioThread();
        thread4.setName("EsempioClass4");

        thread.start();
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        //Multi Threading
    }
}
