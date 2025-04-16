package Reto14Abril;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

public class Reto14Abril {

    static class Flashcard {
        String pregunta;
        String respuesta;

        Flashcard(String pregunta, String respuesta) {
            this.pregunta = pregunta;
            this.respuesta = respuesta;
        }
    }

    static ArrayList<Flashcard> flashcards = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);
    static Random random = new Random();

    // Función para agregar flashcards
    public static void agregarFlashcard() {
        System.out.print("Escribe la pregunta (Anverso): ");
        String pregunta = scanner.nextLine();

        System.out.print("Escribe la respuesta (Reverso): ");
        String respuesta = scanner.nextLine();

        flashcards.add(new Flashcard(pregunta, respuesta));
        System.out.println(" Flashcard añadida.");
    }

    public static void mostrarFlashcardAleatoria() {
        if (flashcards.isEmpty()) {
            System.out.println("Sin flashcards. Agrega algunas primero.");
            return;
        }

        int indice = random.nextInt(flashcards.size());
        Flashcard tarjeta = flashcards.get(indice);

        System.out.println("Anverso: " + tarjeta.pregunta);
        System.out.print("Tu respuesta: ");
        String respuestaUsuario = scanner.nextLine();

        if (respuestaUsuario.equalsIgnoreCase(tarjeta.respuesta)) {
            System.out.println("¡Correcto!");
        } else {
            System.out.println("Incorrecto. La respuesta correcta es: " + tarjeta.respuesta);
        }
    }

    // Menú principal
    public static void iniciarEstudio() {
        boolean continuar = true;

        while (continuar) {
            System.out.println("\n¿Qué deseas hacer?");
            System.out.println("1. Agregar flashcard");
            System.out.println("2. Practicar");
            System.out.println("3. Salir");
            System.out.print("Elige una opción: ");
            String opcion = scanner.nextLine();

            switch (opcion) {
                case "1":
                    agregarFlashcard();
                    break;
                case "2":
                    mostrarFlashcardAleatoria();
                    break;
                case "3":
                    continuar = false;
                    System.out.println("¡Hasta luego y feliz estudio!");
                    break;
                default:
                    System.out.println("⚠Opción no válida. Intenta de nuevo.");
            }
        }
    }

    public static void main(String[] args) {
        iniciarEstudio();
    }
}
