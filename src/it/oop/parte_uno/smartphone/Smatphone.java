package it.oop.parte_uno.smartphone;

public class Smatphone {
    private String serialNumber;
    private String imai;
    private String marca;
    private String modello;

    public Display getSchermo() {
        return schermo;
    }

    public void setSchermo(Display schermo) {
        this.schermo = schermo;
    }

    private Display schermo;


    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getImai() {
        return imai;
    }

    public void setImai(String imai) {
        this.imai = imai;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModello() {
        return modello;
    }

    public void setModello(String modello) {
        this.modello = modello;
    }
}
