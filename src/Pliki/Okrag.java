package Pliki;

public class Okrag extends Figura {
    public Punkt srodek;
    public double promien;

    public double getSrednica(){
    return 2 * promien;
    }

    public double getPowierzchnia(){
        return 3.14 * promien * promien;
    }

    public double getPromien() {
        return promien;
    }

    public void setPromien(double promien) {
        this.promien = promien;
    }

    public boolean wSrodku(Punkt pkt){
        double wynik = Math.pow(pkt.x - this.srodek.x,2)-Math.pow(pkt.y - this.srodek.y,2);
        return wynik<Math.pow(this.promien,2);
    }

    public Okrag() {
    }

    public Okrag(Punkt srodek, double promien) {
        this.srodek = srodek;
        this.promien = promien;
    }

    @Override
    public String opis() {
        return "Klasa Okrag, kolor: " + this.getKolor();
    }
}

