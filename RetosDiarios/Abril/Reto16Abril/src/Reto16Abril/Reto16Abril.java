package Reto16Abril;

//Crea una calculadora muy especial que a veces está de buen humor y otras no. Pide al usuario que
//introduzca dos números y la operación (+, -, *, /).
//Si la operación es división (/) y el segundo número es 0, la calculadora se pondrá de mal humor y
//lanzará un error (simúlalo con un try-catch que imprima un mensaje como "¡¿Dividir por cero?! " +
//        "¡¿Acaso quieres destruir el universo?!").
//Para las otras operaciones, realiza el cálculo normal y muestra el resultado con un mensaje
//alegre como "¡Tadá! El resultado es...".

import java.util.Scanner;
import java.util.InputMismatchException;
public class Reto16Abril {
    public static void main(String[] args) {
        Scanner smileCalculator = new Scanner(System.in);


        System.out.println("Introduce el primer número");
        try {

            int numero1 = smileCalculator.nextInt();

            System.out.println("Introduce el segundo número");
            int numero2 = smileCalculator.nextInt();

            System.out.println("¿Qué operación quieres realizar?/1=Suma, 2=Resta, 3=Multiplicación, 4=División/");
            int operacion = smileCalculator.nextInt();

            if (operacion == 1) {
                System.out.println("La suma de " + numero1 + " más " + numero2 + " es: " + (numero1 + numero2));
            } else if (operacion == 2) {
                System.out.println("La resta de " + numero1 + " menos " + numero2 + " es: " + (numero1 - numero2));
            } else if (operacion == 3) {
                System.out.println("La multiplicación de " + numero1 + " por " + numero2 + " es: " + (numero1 * numero2));
            } else if (operacion == 4) {
                try {
                    if (numero2 == 0) {
                        throw new ArithmeticException();
                    }
                    System.out.println("La división de " + numero1 + " entre " + numero2 + "es: " + ((double) numero1 / numero2));
                } catch (ArithmeticException e) {
                    System.out.println("No es posible dividir por cero¡ ¿Acaso quieres destruir el universo?!");
                }
            } else {
                System.out.println("Fin del programa");
            }
        } catch (InputMismatchException e) {
            System.out.println("Solo puedes introducir números.");
        }
    }
}