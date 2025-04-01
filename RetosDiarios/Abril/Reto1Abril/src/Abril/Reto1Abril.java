package Abril;
import java.util.Scanner;

public class Reto1Abril {
    public static void main(String[]args){
        //Creo un scanner para recibir los datos
        Scanner notas = new Scanner(System.in);
        System.out.println("Introduce la nota real del alumno (Siempre con dos decimales):");
        double nota = notas.nextDouble();
        System.out.println("La nota redondeada es: " + Math.round(nota));
        notas.close();
    }
}
