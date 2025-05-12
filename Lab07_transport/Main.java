import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static ArrayList<Pojazd> dostepne_pojazdy = new ArrayList<>();
    static ArrayList<Pojazd> wypozyczone_pojazdy = new ArrayList<>();

    public static void main(String[] args) {
        int wybor;

        do {
            wybor = Menu();
            switch (wybor) {
                case 1:
                    Dodaj_pojazd();
                    break;
                case 2:
                    Wycen();
                    break;
                case 3:
                    Wypozycz();
                    break;
                case 4:
                    Zwroc();
                    break;
            }
        } while (wybor > 0);

    }

    public static int Menu() {
        System.out.println("\nWitaj w wypozyczalni pojazdow.");
        System.out.println("1. Dodaj pojazd");
        System.out.println("2. Wycen przejazd");
        System.out.println("3. Wypozycz pojazd");
        System.out.println("4. Zwroc pojazd");
        System.out.println("0. Wyjdz");
        System.out.print("> ");

        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }

    public static void Dodaj_pojazd() {
        System.out.println("\nDodawanie pojazdu");
        System.out.println("Typ (1-samochod, 2-hulajnoga elektryczna, 3-rower):");
        Scanner sc1 = new Scanner(System.in);
        int typ = sc1.nextInt();
        System.out.println("Nazwa: ");
        String nazwa = sc1.next();
        System.out.println("Cena za godzine: ");
        float cena_h = sc1.nextFloat();

        switch (typ) {
            case 1:
                dostepne_pojazdy.add(new Samochod(nazwa, cena_h));
                break;
            case 2:
                dostepne_pojazdy.add(new Hulajnoga(nazwa, cena_h));
                break;
            case 3:
                dostepne_pojazdy.add(new Rower(nazwa, cena_h));
                break;
            default:
                dostepne_pojazdy.add(new Pojazd(nazwa, cena_h));
        }
    }

    public static void Wycen() {
        System.out.println("\nWycena wypozyczenia");
        Lista(dostepne_pojazdy);
        System.out.print("> ");
        Scanner sc = new Scanner(System.in);
        Pojazd wybrany_pojazd = dostepne_pojazdy.get(sc.nextInt() - 1);
        System.out.printf("Wybrales pojazd [%s]\n", wybrany_pojazd.nazwa);
        System.out.print("Na ile godzin chcesz go wypozyczyc: ");
        int godziny = sc.nextInt();
        System.out.printf("Koszt takiego wypozyczenia wynosi: %.2f PLN", wybrany_pojazd.cena_h * godziny);
    }

    public static void Wypozycz() {
        System.out.println("\nWybierz pojazd do wypozyczenia:");
        Lista(dostepne_pojazdy);
        System.out.println("> ");
        Scanner sc = new Scanner(System.in);
        Pojazd wybrany_pojazd = dostepne_pojazdy.get(sc.nextInt() - 1);
        wypozyczone_pojazdy.add(wybrany_pojazd);
    }

    public static void Zwroc() {
        System.out.println("\nWybierz pojazd, który chcesz zwrocic:");
        Lista(wypozyczone_pojazdy);
        Scanner sc = new Scanner(System.in);
        System.out.print("> ");
        int wybrany = sc.nextInt();
        wypozyczone_pojazdy.remove(wybrany - 1);
    }

    public static void Lista(ArrayList<Pojazd> lista) {
        System.out.println("\nDostepne pojazdy:");
        for (int i = 0; i < lista.size(); i++) {
            System.out.printf("%d. ", i + 1);
            lista.get(i).Wypisz();
        }
    }
}