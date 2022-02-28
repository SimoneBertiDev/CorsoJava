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
        m.stampaTesto3(null);
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
        } catch (Exception e) {
        }
    }

    private void stampaTesto3(String testo) throws JavaExec {
        if(testo == null){
            throw new JavaExec();
        }
        stampaTesto(testo);
    }
}
