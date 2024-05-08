/*
Kod bazowy programu Commit4_0: 
• Program dodaje do prostej bazy danych (pliku db.txt) dane odnośnie Studentów.
• Studenci dodawani są w klasie Main.
• Wszyscy studenci są wypisywani na końcu klasy Main.
• Klasa Service obsługuje odczyt i zapis do pliku bazy danych.
• Klasa Student reprezentuje pojedynczego studenta (Imię, Wiek).
*/

import java.io.IOException;
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    try {
      Service s = new Service();
      Scanner scanner = new Scanner(System.in);

      System.out.println("Wybierz opcję:");
      System.out.println("1. Dodaj studenta");
      int option = scanner.nextInt();
      scanner.nextLine(); 

      switch(option) {
        case 1:
          System.out.println("Podaj imię:");
          String name = scanner.nextLine();
          System.out.println("Podaj wiek:");
          int age = scanner.nextInt();
          scanner.nextLine(); 
          s.addStudent(new Student(name, age));
          System.out.println("Student dodany.");
          break;
          
        default:
          System.out.println("Niepoprawna opcja.");
      }
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
          
          
