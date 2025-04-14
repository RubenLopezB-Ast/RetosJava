package Reto12Abril;
//Pide al usuario que introduzca varios números enteros (uno por uno, y que indique "fin"
//para terminar). El programa debe verificar si cada número introducido es un "número de la suerte".
//Se considera un número de la suerte si es múltiplo de 7 (el resto de la división entre 7 es 0).
//Por cada número de la suerte encontrado, el programa imprimirá "¡[número] es un número de la
//suerte!".
//Al final, mostrará cuántos números de la suerte se encontraron en total.
//Pista: No olvides usar el try/catch
import java.util.Scanner;
public class Reto12Abril {
    public static void main(String[] args) {
        Scanner suerte = new Scanner(System.in);
        String numeros;
        int contdor = 0;
        System.out.println("Introduce un número entero o varios escribe fin para terminar: ");
        while (true) {
            System.out.println("Introduce otro número: ");
            numeros = suerte.nextLine();
            if (numeros.equalsIgnoreCase("fin")) {
                break;
            }
            try {
                int siete = Integer.parseInt(numeros);
                if (siete % 7 == 0) {
                    System.out.println("i" + siete + " es el número de la suerte.");
                    contdor++;
                }
            } catch (NumberFormatException e) {
                System.out.println("Error introduce lo que se te pide.");
            }
        }
        System.out.println("Se encontraron" + contdor + "numeros de la suerte");
        suerte.close();
    }
}

