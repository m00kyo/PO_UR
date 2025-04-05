import Pliki.*;

public class Main {
    public static void main(String[] args) {
        Punkt P1 = new Punkt(3,5);
        P1.opis();
        P1.przesun(2,6);
        P1.zeruj();
        Figura F1 = new Figura();
        Prostokat Pr = new Prostokat(5,6);
        Trojkat T1 = new Trojkat(6,4);
        System.out.println(Pr.getPowierzchnia());
        Pr.przesun(3,5);

        Kwadrat K1 = new Kwadrat(13);
        Okrag O1 = new Okrag();

        System.out.println(F1.opis());
        System.out.println(Pr.opis());
        System.out.println(T1.opis());
        System.out.println(O1.opis());
    }
}
