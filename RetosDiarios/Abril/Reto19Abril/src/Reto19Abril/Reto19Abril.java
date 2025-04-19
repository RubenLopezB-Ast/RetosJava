package Reto19Abril;
import java.util.Scanner;

public class Reto19Abril {
    public static void main(String[] args) {

        final String PIN_OK = "2233";
        double saldo = 3000.0; // Saldo inicial
        int intentos = 0;

        Scanner cajero = new Scanner(System.in);

        while (intentos < 3) {
            System.out.print("Introduce tu PIN: ");
            String pinIngresado = cajero.nextLine();

            if (pinIngresado.equals(PIN_OK)) {
                System.out.println("PIN correcto.\n");

                boolean salir = false;
                while (!salir) {
                    // Menú de opciones
                    System.out.println("MENÚ \n");
                    System.out.println("Selecciona una opción");
                    System.out.println("1. Consultar saldo");
                    System.out.println("2. Retirar fondos");
                    System.out.println("3. Salir");
                    System.out.print("Selecciona una opción: ");
                    String opcion = cajero.nextLine();

                    switch (opcion) {
                        case "1":
                            System.out.println("Tu saldo actual es: " + saldo + " €\n");
                            break;

                        case "2":
                            System.out.print("Introduce la cantidad a retirar: ");
                            try {
                                double cantidad = Double.parseDouble(cajero.nextLine());

                                if (cantidad <= 0) {
                                    System.out.println("Introduce una cantidad válida.\n");
                                } else if (cantidad > saldo) {
                                    System.out.println("Saldo insuficiente. Tienes " + saldo + " € .\n");
                                } else {
                                    saldo -= cantidad;
                                    System.out.println("Después de la operación te queda un  saldo de: " + saldo + " €\n");
                                }
                            } catch (NumberFormatException e) {
                                System.out.println("Introduce un número válido.\n");
                            }
                            break;

                        case "3":
                            System.out.println("Gracias por su visita");
                            salir = true;
                            break;

                        default:
                            System.out.println("Opción no válida. Inténtalo de nuevo.\n");
                    }
                }
                break;
            } else {
                intentos++;
                System.out.println("PIN incorrecto. Intento " + intentos + " de 3.\n");
            }
        }

        if (intentos == 3) {
            System.out.println("Tarjeta bloqueada ponte en contacto con tu banco.");
        }

        cajero.close();
    }
}
