import java.util.Random;
import java.util.Scanner;


public class Lab02 {
    public static void main(String[] args) {
        Zad_1();
        Zad_2();
        Zad_3();
        Zad_4();
        Zad_5();
    }

    public static void Zad_1() {
        System.out.println("Podaj n: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        int l_student = n;
        int pkt = 0;
        while (n > 0) {
            System.out.println("Podaj liczbe punktow: ");
            pkt = sc.nextInt();
            n--;
            sum += pkt;
        }
        double srednia = (double) sum / l_student;
        System.out.println(srednia);
    }

    public static void Zad_2() {
        int dodatnie = 0;
        int ujemne = 0;
        int suma_d = 0;
        int suma_u = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.println("Podaj liczbe: ");
            Scanner sc = new Scanner(System.in);
            int liczba = sc.nextInt();
            if (liczba >= 0) {
                dodatnie++;
                suma_d += liczba;
            } else {
                ujemne++;
                suma_u += liczba;
            }
        }
        System.out.println("Dodatnie: " + dodatnie + " Ujemne: " + ujemne + " Suma dodatnich: " + suma_d + " Suma ujemnych: " + suma_u);
    }

    public static void Zad_3() {
        System.out.println("Podaj n: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int suma = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                suma += i;

            }
        }
        System.out.println(suma);
    }

    public static void Zad_4() {
        System.out.println("Podaj n: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int suma = 0;
        for (int i = 1; i <= n; i++) {
            Random random = new Random();
            int los = random.nextInt(-10, 46);
            if (los % 2 == 0) {
                suma += los;
            }
        }
        System.out.println(suma);
    }

    //Napisz program, który odpowie na pytanie, czy podane przez użytkownika słowo jest
    //palindromem.
    public static void Zad_5() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj tekst: ");
        String tekst = sc.nextLine();

        boolean czyPalindrom = true;
        for (int i = 0; i < tekst.length() / 2; i++) {
            if (tekst.toCharArray()[i] != tekst.toCharArray()[tekst.length() - 1 - i]) {
                czyPalindrom = false;
            }
        }
        if (czyPalindrom) {
            System.out.println("Jest palindromem");
        } else {
            System.out.println("Nie jest palindromem");
        }
    }
}