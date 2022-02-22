package it.corso.java.modificatori.modificatori2;

import it.corso.java.modificatori.modificatori1.Persona;

public class Main {
    public static void main(String[] args) {
        Persona person = new Persona();
        person.cammina();//unico metodo possibile da usare perché è public
    }
}
