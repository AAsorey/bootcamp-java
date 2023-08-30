package Clase4;

import org.w3c.dom.ls.LSInput;

import java.util.Scanner;

class HelloWord {
    public static void main(String[] args) {
        System.out.println("Hello, World Alb!");

        String nombre = "Alberto";
        Integer nEquipo = 1;
        String texto = "Hola soy " + nombre + ", del equipo nro. " + nEquipo;
        System.out.println(texto);

        System.out.println("Dime tu edad: ");
        Scanner leerEdad = new Scanner(System.in);
        Integer edad = leerEdad.nextInt();

        if (edad >= 18)
            System.out.println("Es mayor de edad");
        else
            System.out.println("Es menor de edad");
    }

}