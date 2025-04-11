package Reto10Abril;
import java.nio.channels.ScatteringByteChannel;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Reto10Abril {
    public static void main(String[] args) {
//Una tienda de galletas artesanales vende al por mayor en su página web.
// Cada caja de galletas cuesta 6€.
// Solicita la cantidad de cajas de galletas en cada venta y dependiendo de la cantidad introducida
// se realizan los siguientes pasos:
//Si la cantidad de cajas de galletas vendidas es menor a 5: no se permiten compras inferiores a 5 cajas
// de galletas.
//Si la cantidad de cajas de galletas es mayor o igual a 5, pero menor a 15: los gastos de envío son de 10€.
//Si la cantidad de cajas de galletas es mayor a 15: El envío es gratuito.
//Promociones:
//Si el precio total es inferior a 120€ no hay promociones.
//Si el precio total supera los 120€ pero es menor a 250€: Tiene un descuento del 5%.
//Si el precio total supera los 250€: Tiene un descuento del 10%.
//Muestra al cliente un mensaje por pantalla según la cantidad de cajas de galletas que quiera comprar:
//Número total de cajas a comprar.
//Total € de la compra.
//Gastos de envío (si los tiene o si es gratuito)
//Descuento por compra (Indicar al cliente cuántos € falta para entrar en una promoción si la compra
// es <100€ o el importe de descuento generado si es superior)
        Scanner galletas = new Scanner(System.in);
        System.out.println("¿Cuantas cajas deseas comprar?: ");
        try {
            int cajas = galletas.nextInt();
            if (cajas < 5) {
                System.out.println("Lo sentimos nuestas galletas estan buenisimas así que debes de comprar al menos cinco cajas");

            } else if (cajas >= 5 && cajas <= 15) {
                int precio1 = (cajas * 6) + 10;
                if (precio1 < 100) {
                    System.out.println("Has comprado " + cajas + " cajas. El precio total es: " + precio1 + "€. Los gastos de envío son 10€. Faltan " + (100 - precio1) + "€ para entrar en promociones.");
                } else if (precio1 >= 100 && precio1 <= 120) {
                    System.out.println("Has comprado " + cajas + " cajas. El precio total es: " + precio1 + "€. Los gastos de envío son 10€.");
                } else if (precio1 > 120 && precio1 <= 250) {
                    double porcentaje = precio1 * 0.05;
                    double total1 = precio1 - porcentaje;
                    System.out.println("Has comprado " + cajas + " cajas. El precio total es: " + total1 + "€. Los gastos de envío son 10€. Te has ahorrado " + porcentaje + "€ con nuestras promociones.");
                } else if (precio1 > 250) {
                    double porcentaje2 = precio1 * 0.10;
                    double total2 = precio1 - porcentaje2;
                    System.out.println("Has comprado " + cajas + " cajas. El precio total es: " + total2 + "€. Los gastos de envío son 10€. Te has ahorrado " + porcentaje2 + "€ con nuestras promociones.");
                }
            } else if (cajas > 15) {
                int precio2 = cajas * 6;
                if (precio2 < 100) {
                    System.out.println("Has comprado " + cajas + " cajas. El precio total es: " + precio2 + "€. Gastos de envío gratis. Faltan " + (100 - precio2) + "€ para entrar en promociones.");
                } else if (precio2 >= 100 && precio2 <= 120) {
                    System.out.println("Has comprado " + cajas + " cajas. El precio total es: " + precio2 + "€. Gastos de envío gratis.");
                } else if (precio2 > 120 && precio2 <= 250) {
                    double porcentaje2 = precio2 * 0.05;
                    double total2 = precio2 - (porcentaje2);
                    System.out.println("Has comprado " + cajas + " cajas. El precio total es: " + total2 + "€. Gastos de envío gratis. Te has ahorrado " + porcentaje2 + "€ con nuestras promociones.");
                } else if (precio2 > 250) {
                    double porcentaje2 = precio2 * 0.1;
                    double total2 = precio2 - (porcentaje2);
                    System.out.println("Has comprado " + cajas + " cajas. El precio total es: " + total2 + "€. Gastos de envío gratis. Te has ahorrado " + porcentaje2 + "€ con nuestras promociones.");
                }
                galletas.close();
            }
        } catch (InputMismatchException e) {
            System.out.println("Tienes que introducir un valor numérico");
        } finally {
            System.out.println("Fin.");
        }
    }
}