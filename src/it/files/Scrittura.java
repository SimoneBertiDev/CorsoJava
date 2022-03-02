package it.files;

import java.io.*;

public class Scrittura {
    public static void main(String[] args) {
        Scrittura s = new Scrittura();
        String dir = "C:\\Users\\simone.berti\\eclipse-workspace\\CorsoJava\\src\\it\\files\\test";
        String testo = "Lorem ipsum dolor sit amet consectetur adipisicing elit. Maxime mollitia";
        s.esempioFileWriter(dir + "\\test.txt", testo);

        String[] arr = new String[3];
        arr[0] = "pippo";
        arr[1] = "pippo1";
        arr[2] = "pippo2";

        //s.esempioBufferedFileWriter(dir+"\\buffer.txt", arr);
        s.esempioBufferedFileWriter(dir+"\\buffer.txt","cosro", "java", "test");


    }

    private File getFile(String filePath) {
        File file = new File(filePath);
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return file;
    }

    public void esempioFileWriter(String filePath, String testo) {
        File file = getFile(filePath);
        //se il file non e una directory scrivi altrimenti no
        if (!file.isDirectory()) {
            FileWriter fileWriter = null; //Questa classe scrive un carattere per volta molto lenta
            try {
                fileWriter = new FileWriter(file);
                fileWriter.write(testo);
                fileWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                try {
                    fileWriter.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        } else {
            System.out.println("Sono una dir");
        }
    }

    public void esempioBufferedFileWriter(String filePath, String... testi) {//... stanno a indicare un array di valori ST
        File file = getFile(filePath);                      //Si poteva passare anche un array per non generare errori


        if (!file.isDirectory()) {
            BufferedWriter bw = null;
            try {
                bw = new BufferedWriter(new FileWriter(file));
                for (String testo : testi) {
                    bw.write(testo);
                    bw.newLine();
                }
                bw.close();
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                try {
                    bw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        } else {
            System.out.println("Sono una dir");
        }
    }

    public void esempioPrintWriter(String filePath, String... testi) {
        File file = getFile(filePath);           //la calasse print ci perette di stampare anche oggetti

        if (!file.isDirectory()) {
            PrintWriter pw = null;
            try {
                pw = new PrintWriter(file);
                for (String testo : testi) {
                    pw.write(testo);
                    pw.println();
                }
                pw.close();
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                    pw.close();
            }
        } else {
            System.out.println("Sono una dir");
        }
    }
}
