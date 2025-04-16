package Reto13Abril;
/*
¿Alguna vez te has levantado con la necesidad de crear un cronómetro? Tranquilo, no eres el único.
Hoy vas a poder hacer tu sueño realidad. Crea un programa que: Pida al usuario que ingrese el
número de segundos que desea contar. Usa un bucle para contar desde el primer segundo hasta el
número total de segundos indicado por el usuario. Cada vez que el cronómetro llegue a 60
segundos, debe reiniciar los segundos a 0 y sumar 1 minuto. Cuando los minutos lleguen a 60,
debe reiniciar los minutos a 0 y sumar 1 hora. El cronómetro debe mostrar el tiempo en formato
hh:mm:ss, donde hh son las horas, mm los minutos y ss los segundos. PISTA: Para que el cronómetro
se actualice cada segundo, puedes utilizar la función time.sleep(1). Esto hará que el programa
espere 1 segundo entre cada iteración del bucle, imitando el comportamiento de un cronómetro real.
Ejemplo:
-------------------------------
00:00:01
00:00:02
00:00:03
etc.
*/
import java.util.Scanner;
import java.util.InputMismatchException;
public class Reto13Abril {
    public static void main(String[] args) {
        Scanner cronometro = new Scanner(System.in);

        int seg = 0;
        int min = 0;
        int h = 0;
        boolean userTime = false;

        while (!userTime) {
            try {
                System.out.println("¿Cuántos segundos quieres contar?");
                seg = cronometro.nextInt();
                userTime = true;
            } catch (InputMismatchException e) {
                System.out.println("Ese no es un número válido de segundos.");
                cronometro.nextLine();
            }
        }

        for (int i = 1; i <= seg; i++) {
            int segundos = i % 60;
            int minutos = (i/60) % 60;
            int horas = i / 3600;
            System.out.println(String.format("%02d", h) + ":" + String.format("%02d", min) + ":" + String.format("%02d", i)+" Tic ¡¡¡¡");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        cronometro.close();

    }
}
