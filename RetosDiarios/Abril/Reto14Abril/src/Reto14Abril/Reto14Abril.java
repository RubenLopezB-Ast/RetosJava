package Reto14Abril;
//Hoy en clase, a Federico le han dicho que las flashcards son un buen método de estudio .
// Pero Federico no tiene nada para escribir en su casa. ¿Se te ocurre alguna forma para que
// pueda estudiar con el método mencionado? . Pues claro que sí, vas a crear un programa que:
//Almacene las flashcards en una lista (pregunta, respuesta).
//Permita al usuario añadir nuevas flashcards.
//Muestra una pregunta aleatoria de la lista.
//Solicite una respuesta del usuario.
//Compare la respuesta del usuario con la correcta.
//Indique si la respuesta es correcta o incorrecta.
//Permita continuar practicando o salir.
//Ejemplo:
//Anverso: La programación es…
//Reverso: Darle una serie de instrucciones a una máquina para que ejecute una acción
//específica.
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
