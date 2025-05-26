public class Silnia  {

    public static long silnia(int n) {
        if (n < 0){
            throw new BlednaWartosc("Wartosc dla silni nie moze byc ujemna!");}
        long wynik=1;
        if (n == 1) {
            wynik = 1;}
        else {
            for (int i = 1; i <= n; i++) {
                wynik = wynik * i;
            }
        }
        return wynik;
    }
}