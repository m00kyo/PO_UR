import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        while (true) {
            try {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Podaj wartosc z ktorej chcesz policzyc silnie: ");
                int n = scanner.nextInt();
                Silnia silnia = new Silnia();
                long wynik = Silnia.silnia(n);
                System.out.println("Silnia z " + n + " to: " + wynik);
                break;
            } catch (BlednaWartosc e) {
                System.out.println(e.getMessage());
            }
        }
    }
}