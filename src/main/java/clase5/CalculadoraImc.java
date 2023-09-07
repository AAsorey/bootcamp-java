package clase5;

import java.util.Scanner;

/**
 * Calculadora de Indice de Masa Corporal (IMC)
 */
public class CalculadoraImc {
    public static void main(String[] args) {
        //Peso en Kg / Altura en m2
        Scanner cargaDatos = new Scanner(System.in);

        System.out.print("Dime Peso en kg: ");
        double peso = cargaDatos.nextDouble();
        System.out.print("Dime Altura en metros: "); //1,90 -> coma decimal
        double altura = cargaDatos.nextDouble();

        double a = altura * altura;
        double imc = peso / a;
        System.out.println("Tu indice de masa corporal es: " + imc);

        //Mayor de 30     -> Obesidad
        if (imc >= 30) {
            System.out.println("Obesidad");
        } else if (imc>=25 && imc<30) { //Entre 25 y 30   -> Sobrepeso
            System.out.println("Sobrepeso");
        } else if (imc>=18.5 && imc<25) { //Entre 18.5 y 25 -> Normal
                System.out.println("Normal");
        } else if (imc<18.5) { //Menor de 18.5    -> Debajo del normal, delgado
            System.out.println("Delgado");
        }
    }
}
