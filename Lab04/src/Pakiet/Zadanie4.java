package Pakiet;

import java.util.Scanner;

public class Zadanie4 {
    private static Student[] studenci = new Student[100];

    public static void GenerujStudentow() {
        for (int i = 0; i < studenci.length; i++) {
            studenci[i] = new Student();

        }
    }

    public static void wprowadzStudenta(int index){
        Scanner sc = new Scanner(System.in);
        studenci[index].imie = sc.nextLine();
        studenci[index].nazwisko = sc.nextLine();
        studenci[index].rok_studiow = sc.nextInt();
        studenci[index].nr_indeksu = sc.nextInt();
        studenci[index].nazwa_spec = sc.nextLine();
    }

    public static void usunStudenta(int index){
        studenci[index] = new Student();
    }

    public static void wyswietlStudenta(int index){
        System.out.println(studenci[index].imie + studenci[index].nazwisko);
    }

    public static void calaLista(){
        for (int i = 0; i < studenci.length; i++) {
            System.out.println(studenci[i].imie + studenci[i].nazwisko);
        }
    }

    public static void zakresStudentow(int start, int koniec) {
        for (int i = start; i < koniec; i++) {
            System.out.println(studenci[i].imie + studenci[i].nazwisko);
        }
    }
}

//W nowym pakiecie utwórz klasę zawierającą 100 elementową tablicę klasy Pakiet.Student (użyj klasy Pakiet.Student
//z zadania 2). Utwórz metodę tworzącą obiekt dla każdego elementu tablicy i ustawiającą domyślne
//wartości dla niego tj. dla typu liczbowego: 0, dla typu łańcuchowego: łańcuch pusty "". Utwórz metody
//umożliwiające:
//• wprowadzanie danych studenta pod wybrany index tablicy,
//• edycję (nadpisanie danych studenta) spod wybranego indeksu,
//• usunięcie danych studenta (tj. nadpisanie elementów tablicy wartościami domyślnymi),
//• wyświetlenie obiektu o danym indeksie.
//• wyświetlenie wszystkich obiektów,
//• wyświetlenie zakresu obiektów w podanym zakresie