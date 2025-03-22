public class Osoba {
    String imie;
    String nazwisko;
    int wiek;

    public Osoba(String imie, String nazwisko, int wiek) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.wiek = wiek;
    }

    public Osoba(String imie, String nazwisko) {
        this.imie = imie;
        this.nazwisko = nazwisko;
    }

    public Osoba() {

    }

    public void pokazDane() {
        System.out.println("Imie: " + imie + " Nazwisko: " + nazwisko + " Wiek: " + wiek);
    }
}
