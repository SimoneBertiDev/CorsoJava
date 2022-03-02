package it.files;

import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        Main m = new Main();

        String dir = "C:\\Users\\simone.berti\\eclipse-workspace\\CorsoJava\\src\\it\\files\\test";
        String file = dir + "\\test.txt";
        m.creaDir(dir);
        m.creaFile(file);
        File f = new File(dir);
        File f1 = new File(file);
        System.out.println(f.isDirectory());
        System.out.println(f.isFile());
        System.out.println("------------");
        System.out.println(f1.isDirectory());
        System.out.println(f1.isFile());
        System.out.println("------------");
        File[] fileArr = f.listFiles();
        for (File filo : fileArr) {
        System.out.println(filo.getName() +" "+ filo.isDirectory());
        filo.delete();
        }
    }
    public void creaFile(String path){
        File f = new File(path);
        if(!f.exists()){
            try {
                f.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    public void creaDir(String path){
        File d = new File(path);
        if(!d.exists()){
            d.mkdir();
        }
    }
}
