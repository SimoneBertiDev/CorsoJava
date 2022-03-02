package it.files;

import java.io.*;
import java.util.Scanner;

public class Lettura {
    public static void main(String[] args) {
        Lettura l = new Lettura();
        String dir = "C:\\Users\\simone.berti\\eclipse-workspace\\CorsoJava\\src\\it\\files\\test";
        //l.esempioFileRead(dir + "\\test.txt");
        //l.esempioBufferedReader(dir + "\\test.txt");
        //leggi1();
        leggi2();
    }
    public File getFile(String filePath) throws IOException {
        File file = new File(filePath);
        if (!file.exists()){
            file.createNewFile();
        }
        return file;
    }

    public void esempioFileRead(String filePath){
        FileReader fileReader = null;
        try {
            File file = getFile(filePath);
            fileReader = new FileReader(file);
            char[] chars = new char[1024];
            int size = fileReader.read(chars);
            for (int i = 0; i < size; i++){
                System.out.print(chars[i]);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                fileReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public void esempioBufferedReader(String filePath){
        BufferedReader bufferedReader = null;
        try {
            File file = getFile(filePath);
            bufferedReader = new BufferedReader(new FileReader(file));
            char[] chars = new char[1024];
            int size = bufferedReader.read(chars);
            for (int i = 0; i < size; i++){
                System.out.print(chars[i]);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                bufferedReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void leggi1() {
        System.out.println("Benvenuto nel programma...");
        String saluto = "Ciao ";

        try {
            System.out.println("Inserisci il tuo nome:");

            BufferedReader bufferRead = new BufferedReader(new InputStreamReader(System.in));

            saluto += bufferRead.readLine();

            System.out.println("Inserisci il tuo cognome:");

            bufferRead = new BufferedReader(new InputStreamReader(System.in));

            saluto += " " + bufferRead.readLine();

            System.out.println(saluto);
        } catch(IOException e) {
            e.printStackTrace();
        }
    }

    public static void leggi2() {
        System.out.println("Benvenuto nel programma...");

        String saluto = "Ciao ";

        System.out.println("Inserisci il tuo nome:");
        Scanner scanIn = new Scanner(System.in);
        saluto += scanIn.nextLine();

        System.out.println("Inserisci il tuo cognome:");
        saluto += " " + scanIn.nextLine();

        scanIn.close();

        System.out.println(saluto);
    }
}
