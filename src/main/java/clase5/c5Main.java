package clase5;

import java.util.Scanner;

public class c5Main {
    public static void main(String[] args) {
        System.out.println("Dime tu edad: ");
        Scanner leerEdad = new Scanner(System.in);
        Integer edad = leerEdad.nextInt();

        if (edad >= 18)
            System.out.println("Es mayor de edad");
        else
            System.out.println("Es menor de edad");
    }
}
