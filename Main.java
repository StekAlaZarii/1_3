import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    int a, b;
    double wynik;

    Scanner skaner = new Scanner(System.in);

    System.out.println();
    System.out.print("Podaj pierwszą liczbę: ");
    a = skaner.nextInt();

    System.out.print("Podaj drugą liczbę: ");
    b = skaner.nextInt();
    skaner.close();

    wynik = Math.pow(a,b);

    System.out.println();
    System.out.println("Wynik: " + wynik);
    System.out.println();
  }
}