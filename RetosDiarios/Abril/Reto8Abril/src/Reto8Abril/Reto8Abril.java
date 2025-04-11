package Reto8Abril;
import java.util.Scanner;
public class Reto8Abril {
    public static void main(String[] args) {
//        Escribe un programa que le pregunte al usuario su nombre.
//        Si el nombre comienza con la letra "A" (mayúscula o minúscula), el robot responderá
//        con un saludo entusiasta como: ¡Hola, Asombroso/a "Nombre"!.
//        Si el nombre tiene más de 7 letras, el robot dirá: ¡Vaya, "Nombre", ¡qué nombre tan
//        largo y sofisticado!.
//        Para cualquier otro nombre, el robot simplemente dirá: Saludos, "Nombre".
//
//¡Prepara al robot para todo tipo de nombres! Como un saludo especial a un nombre que
// empiece por A y tenga 7 letras, o que cuente un chiste si saluda a Jaimito...

        Scanner saludos = new Scanner(System.in);
        System.out.println("Hola, soy robotín ¿y tú?, ¿Cual es tu nombre? ");
            String nombre = saludos.nextLine();
            String nombreMayuscula = nombre.toUpperCase();

            if (!nombre.matches("[a-zA-Z]+"))
                System.out.println("No puedes tener un número en tu nombre.");
            if (nombreMayuscula.charAt(0) == 'A') {
                System.out.println("Genial me encanta que tu nombre empiece por a bienvenido " + nombre + ".");
            }
            if (nombre.length() > 7) {
                System.out.println("Hola " + nombre + ". Que nombre tan largo y sofisticado tienes.");
            }
            if (nombreMayuscula.equals("JAIMITO")) {
                System.out.println("Hola Jaimito cuéntanos un chiste");
            }else {
                System.out.println("Saludos");
            }
        }
    }

