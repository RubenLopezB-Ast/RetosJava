package Reto11Abril;
//El programa elige una palabra secreta (por ejemplo, "programar"). El usuario tiene 5
//intentos para adivinar la palabra. En cada intento, el programa compara la palabra
//introducida por el usuario con la palabra secreta.
//Si son iguales, muestra un mensaje de felicitación y termina.
//Si no son iguales, indica cuántos intentos le quedan.
//Si se agotan los intentos sin adivinar, muestra la palabra secreta y un mensaje
//de "¡Game Over!".
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;
public class Reto11Abril {
    public static void main(String[] args) {
        String[] palabras = {"Lata", "Café", "Rioja", "Cerveza", "Sidra", "Té", "Ginebra", "Orujo", "Hidromiel", "Tequila"};
        int aleatorioProgrma = (int) Math.round(Math.random() * 9);

        String palabraPrograma = palabras[aleatorioProgrma];
        Scanner reto11 = new Scanner(System.in);
        System.out.println("¿De entre estás palabras cual estoy pensando? Lata,Café,Rioja,Cerveza,Sidra,Té,Ginebra,Orujo,Hidromiel,Tequila");
        try {
            String pala1 = reto11.nextLine();
            if (palabraPrograma.equalsIgnoreCase(pala1)) {
                System.out.println("Felicitaciones has acertado.");
                System.out.println("Programa finalizado");
            } else if (!palabraPrograma.equals(pala1)) {
                System.out.println("Vaya has fallado mmmm, venga escoge otra palabra anda te quedan 4 intentos.");
                String pala2 = reto11.nextLine();
                if (palabraPrograma.equalsIgnoreCase(pala2)) {
                    System.out.println("Felicitaciones has acertado. ");
                    System.out.println("Programa finalizado");
                } else if (!palabraPrograma.equals(pala2)) {
                    System.out.println("Vaya has fallado mmmm, venga escoge otra palabra anda te quedan 3 intentos.");
                    String pala3 = reto11.nextLine();
                    if (palabraPrograma.equals(pala3)) {
                        System.out.println("Felicitaciones has acertado. ");
                        System.out.println("Programa finalizado");
                    } else if (!palabraPrograma.equals(pala3)) {
                        System.out.println("Vaya has fallado mmmm, venga escoge otra palabra anda te quedan 2 intentos.");
                        String pala4 = reto11.nextLine();
                        if (palabraPrograma.equalsIgnoreCase(pala4)) {
                            System.out.println("Felicitaciones has acertado. ");
                            System.out.println("Programa finalizado");
                        } else if (!palabraPrograma.equalsIgnoreCase(pala4)) {
                            System.out.println("Vaya has fallado mmmm, venga escoge otra palabra anda te quedan 1 intentos.");
                            String pala5 = reto11.nextLine();
                            if (palabraPrograma.equalsIgnoreCase(pala5)) {
                                System.out.println("Felicitaciones has acertado. ");
                                System.out.println("Programa finalizado");
                            } else if (!palabraPrograma.equalsIgnoreCase(pala5)) {
                                System.out.println("Vaya has fallado");
                            }
                            System.out.println("¡Game Over!");
                            System.out.println("El nombre secreto es: " + palabraPrograma);
                        }
                    }
                }
            }
        } catch (Exception e) {
            System.out.println("Error empieza de nuevo");;
        }
    }
}


