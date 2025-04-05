package Pliki;

public class Kwadrat extends Prostokat{
    public Kwadrat(double bok) {
        super(bok, bok);
    }

    public Kwadrat(float bok, String kolor) {
        super(bok, bok, kolor);
    }

    public double getbok(){
        return this.wys;
    }

    public void setbok(double bok){
        this.szer = bok;
        this.wys = bok;
    }

    @Override
    public String opis() {
        return "Klasa Kwadrat. Kolor obiektu: "+kolor;
    }
}
