package java;
import java.util.Scanner;

public class example {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
          System.out.print("Ingrese un número: ");
          int numero = sc.nextInt();

          if (numero % 2 == 0) {
              System.out.println("El número es divisible entre 2");
          } else {
              System.out.println("El número no es divisible entre 2");
          }
        }
    }
}