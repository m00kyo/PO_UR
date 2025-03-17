import java.util.Random;
import java.util.Scanner;

public class Lab03 {
    public static void main(String[] args) {
        //Zad1();
        // Zad2();
        // Zad3();
        //Zad4();
        //Zad5();
        //Zad6();
        Zad7();
    }

    public static int[] Losuj(int liczba) {
        int[] tablica = new int[liczba];

        Random random = new Random();
        for (int i = 0; i < liczba; i++) {
            tablica[i] = random.nextInt(100);
        }
        return tablica;
    }

    public static void Zad1() {
        int suma = 0;
        int[] tablica = Losuj(10);
        for (int i = 0; i < tablica.length; i++) {
            suma += tablica[i];
        }
        int suma2 = 0;
        for (int i : tablica) {
            suma2 += i;
        }
        float srednia = suma2 / 10.0f;
    }

    public static void Zad2() {
        int[] tablica1 = Losuj(10);
        int[] tablica2 = Losuj(9);

        for (int i = 0; i < tablica1.length; i += 2) {
            System.out.println(i + " " + tablica1[i]);
        }

        for (int i = 0; i < tablica2.length; i += 2) {
            System.out.println(i + " " + tablica2[i]);
        }
    }

    public static void Zad3() {
        String[] wartosci = {"Piksel", "Piesek", "Wesna", "Leon"};

        for (String i : wartosci) {
            System.out.println(i.toUpperCase());
        }
    }

    public static void Zad4() {
        Scanner sc = new Scanner(System.in);
        String[] slowa = new String[5];

        for (int i = 0; i < 5; i++) {
            slowa[i] = sc.nextLine();
        }

        for (int i = 4; i >= 0; i--) {
            for (int j = slowa[i].length() - 1; j >= 0; j--) {
                System.out.print(slowa[i].charAt(j));
            }
            System.out.println();
        }
    }

    public static void Zad5() {
        Scanner sc = new Scanner(System.in);
        int[] tablica = new int[8];

        for (int i = 0; i < 8; i++) {
            tablica[i] = sc.nextInt();
        }

        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                if (tablica[j] > tablica[j + 1]) {
                    int temp = tablica[j];
                    tablica[j] = tablica[j + 1];
                    tablica[j + 1] = temp;
                }
            }
        }
        for (int element : tablica) {
            System.out.println(element);
        }
    }

    public static void Zad6() {
        Scanner sc = new Scanner(System.in);
        int[] tablica = new int[5];

        for (int i = 0; i < 5; i++) {
            tablica[i] = sc.nextInt();
        }
        for (int element : tablica) {
            System.out.println(element +" "+Silnia(element));
        }
    }

    public static int Silnia(int n) {
        if(n==1){
            return 1;
        }
        return n * Silnia(n-1);
    }

    public static void Zad7() {
        String[] wartosci1 = {"Piksel", "Piesek", "Wesna", "Leon"};
        String[] wartosci2 = {"Piksel", "Piesek", "Wesna", "Leon"};
        boolean czyIdentyczne = true;

        for (int i = 0; i < wartosci1.length; i++) {
            if(wartosci1[i].equals(wartosci2[i]) != true) {
                czyIdentyczne = false;
            }
        }
        System.out.println(czyIdentyczne);
    }
}

//Napisz program, w którym zdefiniujesz dwie tablice przechowujące wartości typu String.
//Zainicjalizuj obie tablice takimi samymi wartościami, w takiej samej kolejności. Napisz kod,
//który porówna obie tablice i odpowie na pytanie, czy są one takie same