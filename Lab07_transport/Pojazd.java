public class Pojazd {
    public String nazwa;
    public float cena_h;

    public Pojazd(String nazwa, float cena_h) {
        this.nazwa = nazwa;
        this.cena_h = cena_h;
    }

    public void Wypisz(){
        System.out.printf("%-15s %-10s %10.2f zl/h \n", this.getClass().getName(), this.nazwa, this.cena_h);

    }
}
