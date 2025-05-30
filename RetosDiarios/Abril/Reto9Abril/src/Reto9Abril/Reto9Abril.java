package Reto9Abril;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Reto9Abril {
    public static void main(String[] args) {
// Los alumnos de Prometeo que cursan DAM/DAW + Master andan muy liados y no tienen claro cuando tienen clase
// y cuando no.
//Haz un programa que les indique si tienen clase de FP, de Máster, o de las dos en un conjunto de fechas dado.
// El usuario introduce un número N, que indica el número de días que quiere ver, se deberá imprimir el
// número del día, si no tienen nada en esa fecha, FP si tiene clase de un módulo de DAM/DAW o Máster si ese
// día tiene clase de máster.
//Los días múltiplos de 3 tienen clase de FP.
//Los días múltiplos de 5, de máster
// Los días que son múltiplos de 3 y 5 tienen clase de las dos.
//Ejemplo de entrada: 15
// Ejemplo de salida:
// 1 2 FP 4 Máster FP 7 8 FP Máster 11 FP 13 14 FP + Máster
        Scanner clases = new Scanner(System.in);
        System.out.println("Dime que día necesitas saber: ");
        try {
            int dia = clases.nextInt();

            if (dia % 3 == 0 && dia % 5 == 0) {
                System.out.println("El día " + dia + " clase del máster y de FP.");
            } else if (dia % 3 == 0) {
                System.out.println("El día " + dia + " tienes clase de FP.");
            } else if (dia % 5 == 0) {
                System.out.println("El día " + dia + " tienes clase de Máster.");
            } else {
                System.out.println("El día " + dia + " no tienes clase.");
            }
        } catch (InputMismatchException e) {
            System.out.println("Solo puedes escribir números");
        } finally {
            System.out.println("Fin");
        }
        clases.close();
    }
}