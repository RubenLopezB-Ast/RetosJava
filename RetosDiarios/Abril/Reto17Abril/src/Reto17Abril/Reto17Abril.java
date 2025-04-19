package Reto17Abril;

import java.util.Scanner;
import java.util.StringTokenizer;

/*
Pide al usuario que introduzca un poema de hasta 4 líneas. Lola la Crítica intentará analizar
su "métrica" según reglas muy extrañas:
Línea 1: Debe tener exactamente 5 palabras.
Línea 2: Debe contener la letra 'z' al menos una vez.
Línea 3: Debe tener más vocales que consonantes.
Línea 4: Debe terminar con la misma palabra con la que empezó la primera línea (ignorando
mayúsculas/minúsculas).
Para llevar a cabo el programa:
Usa un bucle for para leer cada línea del poema.
Usa if/else para verificar si cada línea cumple su regla. Si no, Lola da una crítica divertida
(ej., "¡Demasiadas palabras para mi gusto!", "¡Le falta un toque de 'z'!".).
Usa try-catch para manejar si el usuario introduce menos de 4 líneas (simulando un poema
incompleto).
Al final, da una "puntuación poética" basada en cuántas reglas cumplió el poema.
*/

public class Reto17Abril {
    public static void main(String[] args) {
        Scanner poema = new Scanner(System.in);
        int puntuacion = 0;

        try {
            System.out.println("Escribe la primera línea de tu poema: ");
            String lineaUno = poema.nextLine();
            System.out.println("Escribe la segunda línea de tu poema: ");
            String lineaDos = poema.nextLine();
            System.out.println("Escribe la tercera líena de tu poema: ");
            String lineaTres = poema.nextLine();
            System.out.println("Por último escribe la cuarta línea de tu poema: ");
            String lineaCuatro = poema.nextLine();

            StringTokenizer contador = new StringTokenizer(lineaUno);

            if (contador.countTokens() != 5) {
                System.out.println("Primera línea: Ni más ni menos palabras que cinco debe de contener tu primera linea ni un solo más caracter.");
            } else if (!lineaDos.contains("z") && !lineaDos.contains("Z")) {
                System.out.println("Segunda línea: Esta línea debe de contener al menos una z/Z para poder el poema poder leer");
            } else {
                String textoLimpio = lineaTres.toLowerCase().replaceAll("[^a-z]", "");
                int vocales = 0, consonantes = 0;

                for (char c : textoLimpio.toCharArray()) {
                    if ("aeiou".indexOf(c) != -1) {
                        vocales++;
                    } else {
                        consonantes++;
                    }
                }

                if (vocales <= consonantes) {
                    System.out.println("Línea 3: ¡Debe contener más vocales que consonantes!");
                }

                String primeraPalabra = lineaUno.split("\\s+")[0].toLowerCase();
                String[] palabrasLinea4 = lineaCuatro.split("\\s+");
                String ultimaPalabra = palabrasLinea4[palabrasLinea4.length - 1].toLowerCase();

                if (!ultimaPalabra.equals(primeraPalabra)) {
                    System.out.println("Línea 4: ¡Debe terminar con la misma palabra que empezó el poema!");
                }

                if (lineaUno.toLowerCase().contains("tesoro")) {
                    puntuacion += 2;
                } else {
                    puntuacion += 1;
                }

                if (lineaDos.toLowerCase().contains("maravilla")) {
                    puntuacion += 3;
                } else {
                    puntuacion += 2;
                }

                if (lineaTres.toLowerCase().contains("rima")) {
                    puntuacion += 2;
                } else {
                    puntuacion += 1;
                }

                if (lineaCuatro.toLowerCase().contains("alfombra")) {
                    puntuacion += 3;
                } else {
                    puntuacion += 2;
                }

                System.out.println("Puntuación total: " + puntuacion + " puntos");
            }
        } catch (Exception e) {
            System.out.println("Poema incompleto, continúa.");
        } finally {
            poema.close();
        }
    }
}



