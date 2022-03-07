package it.thread;

import it.thread.concorrenza.GetSitePage;
import it.thread.concorrenza.GetSitePageExecutor;
import it.thread.concorrenza.GetSitePageForkJoin;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class Main {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
            Main m = new Main();
        m.esempioConcorrenzaForkJoin();
    }


    private void esempioConcorrenzaForkJoin(){
        ForkJoinPool forkJoinPool = new ForkJoinPool();

        String five = forkJoinPool.invoke(new GetSitePageForkJoin("https://www.fivebroker.it/"));
        String go = forkJoinPool.invoke(new GetSitePageForkJoin("https://www.google.it/"));

        System.out.println("Five");
        System.out.println(five);
        System.out.println("Google");
        System.out.println(go);

        forkJoinPool.shutdown();
    }

    private void esempioConcorrenzaExecutor() throws InterruptedException, ExecutionException {
        List<Callable<String>> siti = new ArrayList<Callable<String>>();
        siti.add(new GetSitePageExecutor("https://www.fivebroker.it/"));
        siti.add(new GetSitePageExecutor("https://www.google.it/"));

        ExecutorService ex = Executors.newSingleThreadExecutor();
        List<Future<String>> s = ex.invokeAll(siti);

        for (var g : s) {
            System.out.println(g.get());
        }
        ex.shutdown();
    }


    private void esempioConcorrenzaThread() throws InterruptedException {
        GetSitePage s1 = new GetSitePage("https://www.fivebroker.it/");
        GetSitePage s2 = new GetSitePage("https://www.google.it/");
        s1.start();
        s2.start();

        s1.join();
        s2.join();

        System.out.println("FIVEBROKER");
        System.out.print(s1.getContent());
        System.out.println("GOOGLE");
        System.out.print(s2.getContent());

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
