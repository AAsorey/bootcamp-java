package clase5;

import java.util.Scanner;

public class EdadPerro {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int edadPerro;
        int añosPerrunos;
        System.out.print("Ingrese la edad de su perro: ");
        edadPerro = teclado.nextInt();
        añosPerrunos = edadPerro * 7;
        System.out.println("La edad de sus perro en años perrunos es: " + añosPerrunos);
    }
}
