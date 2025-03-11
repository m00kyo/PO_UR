import java.util.Random;
import java.util.Scanner;

public class lab01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = Integer.parseInt(sc.nextLine());
        int b = Integer.parseInt(sc.nextLine());
        Liczenie(a, b);

        System.out.println(CzyParzysta(a));

        System.out.println(Sprawdzanie(a));

        System.out.println(Potega(a));

        System.out.println(Pierwiastek(a));

        Random random = new Random();
        int x, y, z;
        x = random.nextInt(b - a + 1) + a;
        y = random.nextInt(b - a + 1) + a;
        z = random.nextInt(b - a + 1) + a;

        System.out.println(x + " " + y + " " + z);
        System.out.println(Trojkat(x, y, z));
    }

    public static String Ja() {
        return "Oliwia, 21 lat";
    }

    public static void Liczenie(int a, int b) {
        int suma, iloczyn, roznica;
        suma = a + b;
        roznica = a - b;
        iloczyn = a * b;
        System.out.println(suma + " " + iloczyn + " " + roznica);
    }

    public static boolean CzyParzysta(int liczba) {
        if (liczba % 2 == 0) {
            return true;
        }
        return false;
    }

    public static boolean Sprawdzanie(int liczba) {
        if (liczba % 5 == 0 && liczba % 3 == 0) {
            return true;
        }
        return false;
    }

    public static int Potega(int liczba) {
        return (int) Math.pow(liczba, 3);
    }

    public static double Pierwiastek(int liczba) {
        return Math.sqrt(liczba);
    }

    public static boolean Trojkat(int a, int b, int c) {
        int max = Math.max(Math.max(a, b), c);
        if (max == a) {
            if (a > b + c) {
                return false;
            }
        }
        if (max == b) {
            if (b > a + c) {
                return false;
            }
        }
        if (max == c) {
            if (c > b + a) {
                return false;
            }
        }
        if ((Math.pow(a,2)+Math.pow(b,2)==Math.pow(c,2))||
        (Math.pow(c,2)+Math.pow(b,2)==Math.pow(a,2))||
        (Math.pow(a,2)+Math.pow(c,2)==Math.pow(b,2))) {
            return true;
        }
        return false;
    }
}