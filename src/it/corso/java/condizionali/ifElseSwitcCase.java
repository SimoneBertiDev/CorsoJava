package it.corso.java.condizionali;

public class ifElseSwitcCase {
    public static ifElseSwitcCase singleton;

    public static ifElseSwitcCase getInstance() {
        if (singleton == null) {
            singleton = new ifElseSwitcCase();
        }
        //ci permette di usare sempre la stessa istanza per non occupare parti di memoria che potrebbero servire per altro
        return singleton;
    }

    public int recuperaIlMaggore(int a, int b, int c) {
        int maggiore = 0;

        if (a > b && a > b) {
            maggiore = a;
        } else if (b > a && b > c) {
            maggiore = b;
        } else if (c > a && c > b) {
            maggiore = c;
        }

        return maggiore;
    }

    public boolean isNull(String text){
        if(text == null){
            return true;
        }
        return false;
    }

    public String recuperaTest(int codice){
        switch (codice){
            case 4 :
                return "Quella casa nel lago";
            case 5 :
                return "Topolino";
            default:
                return "benvenuto nella tua libreria";
        }
    }
}
