package Pakiet;

public class Student {
    public String imie;
    public String nazwisko;
    public int nr_indeksu;
    public String nazwa_spec;
    public int rok_studiow;

    public Student(String imie, String nazwisko) {
        this.imie = imie;
        this.nazwisko = nazwisko;
    }

    public Student(int nr_indeksu) {
        this.nr_indeksu = nr_indeksu;
    }

    public Student(String nazwa_spec, int rok_studiow, int nr_indeksu) {
        this.nazwa_spec = nazwa_spec;
        this.rok_studiow = rok_studiow;
        this.nr_indeksu = nr_indeksu;
    }

    public Student() {

    }

    public void pokazDane() {
        System.out.println("Imie: " + imie + " Nazwisko: " + nazwisko + " Nr indeksu: " + nr_indeksu + " Rok studiów: " + rok_studiow + " Specjalność: " + nazwa_spec);
    }
}
