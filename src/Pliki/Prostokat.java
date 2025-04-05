package Pliki;
public class Prostokat extends Figura  {
	double wys=0, szer=0;
	
	public Prostokat(double wys, double szer){
		this.wys = wys;
		this.szer = szer;
			
	}
	public Prostokat(float wys,float szer, String kolor){
		super(kolor);
		this.wys = wys;
		this.szer = szer;
	}
	public void przesun(float x, float y){
		super.punkt.przesun((int) x, (int) y);
	}
    public double getPowierzchnia() {
        return (szer * wys);
    }

	@Override
	public String opis() {
		return "Klasa Prostokat. Kolor obiektu: "+kolor;
	}
}