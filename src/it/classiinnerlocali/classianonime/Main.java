package it.classiinnerlocali.classianonime;

public class Main {
    public static void main(String[] args) {

        Main m = new Main();
        m.eseguiAzione2().esequiAzione();
        Azione a = m.eseguiAzione();
        a.esequiAzione();

    }

    public Azione eseguiAzione() {
        return new AzioneImp();
    }

    //Classe anonima
    public Azione eseguiAzione2(){
        return new Azione() {
            @Override
            public void esequiAzione() {
                System.out.println("Classe anonima");
            }
        };
    }
}
