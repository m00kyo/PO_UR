import Pakiet.Student;
import Pakiet.Zadanie4;

import java.util.Scanner;

public class Lab04 {
    public static void main(String[] args) {

        Osoba o1 = new Osoba("Kamila", "Kowalska", 13);
        Osoba o2 = new Osoba("Malwina", "Ryś");
        Osoba o3 = new Osoba();

        o1.pokazDane();
        o2.pokazDane();
        o3.pokazDane();

        Student s1 = new Student("Kamil", "Kowalski");
        Student s2 = new Student(134215);
        Student s3 = new Student("Informatyka AI", 2, 135555);
        Student s4 = new Student();

        s1.pokazDane();
        s2.pokazDane();
        s3.pokazDane();
        s4.pokazDane();

        wprowadzDane(s1);
        s1.pokazDane();

        Zadanie4.GenerujStudentow();
        Zadanie4.wprowadzStudenta(3);
        Zadanie4.zakresStudentow(0, 5);
    }

    public static void wprowadzDane(Student s) {
        Scanner sc = new Scanner(System.in);
        s.imie = sc.nextLine();
        s.nazwisko = sc.nextLine();
        s.nr_indeksu = sc.nextInt();
        s.rok_studiow = sc.nextInt();
        s.nazwa_spec = sc.nextLine();
    }
}

//Utwórz klasę (zawierającą metode main), która umożliwia wprowadzanie danych studenta z konsoli.
//Użyj do tego celu znanego już obiektu Scanner oraz klasy Pakiet.Student z zadania 2.