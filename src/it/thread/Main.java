package it.thread;

import it.thread.concorrenza.GetSitePage;

public class Main {
    public static void main(String[] args) {

    }


    private void esempioConcorrenzaThread(){
        GetSitePage s1 = new GetSitePage();
    }

    private void thread() {
        EsempioThread thread = new EsempioThread();
        thread.start();

        EsempioRunnable esempioRunnable = new EsempioRunnable();
        Thread t1 = new Thread(esempioRunnable);
        t1.start();
    }


    private void esempioMultiTasking() {


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
