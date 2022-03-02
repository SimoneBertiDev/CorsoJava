package it.annotation;

public class Telefono extends Prodotto{
    @Override
    @Deprecated
    public double calcolaIva(double perIva) {
        return super.calcolaIva(perIva);
    }
}
