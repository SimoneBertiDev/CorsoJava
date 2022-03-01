package it.eccezioni;

public class Main {
    public static void main(String[] args) throws JavaExec {
//        File file = new File("test.txt");
//        if (file.exists()) {
//            System.out.println("esisto");
//        }
//        try {
//            FileReader fr = new FileReader(file);
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }

        Main m = new Main();
//        m.stampaTesto3(null);

//        m.stampaTesto2("TEST");
//        m.stampaTesto2(null);

        String s = m.esegui(null);
        System.out.println(s);

        System.out.println("ciao");
        //Throws serve per inoltrare una eccezione mentre throw serve per creare una eccezione

    }

//    private void stampaTesto(String testo) {
//        if (testo != null) {
//            String tmp = testo.concat("...");
//            System.out.println(tmp);
//        }else {
//            System.out.println("Valore Nullo");
//        }
//    }

    private void stampaTesto(String testo) {
        String tmp = testo.concat("...");
        System.out.println(tmp);
    }

    private void stampaTesto2(String testo) {
        try {
            stampaTesto(testo);
            int val = 10;
            if(testo != null && testo.length() < val){
                System.out.println("il teto a meno valori di val "+val+" caratteri.");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }finally {
            System.out.println("SONO NEL FINALY");
        }
    }

    private void stampaTesto3(String testo) throws JavaExec {
        if(testo == null){
            throw new JavaExec();
        }
        stampaTesto(testo);
    }

    private String esegui(String testo)/*throws JavaExec Commento*/{
        try {
            stampaTesto3(testo);//usa la classe JavaExec quindi a sua volta si deve dichiarare o si usa la lasse
            //throws JavaExec che si vede nel commento nella dichiarazione del metodo
        } catch (JavaExec e) {
            e.printStackTrace();
        }

        return "ho stampato il testo";
    }
}
