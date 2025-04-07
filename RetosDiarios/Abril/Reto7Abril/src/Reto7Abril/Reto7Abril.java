package Reto7Abril;
import java.util.Scanner;
import java.util.Random;
public class Reto7Abril {
    public static void main(String[] args) {
//        Imagina una emocionante carrera entre caracoles cibernéticos. Cada caracol tiene una
//        velocidad aleatoria entre 1 y 5 (¡qué emoción!).
//
//        Escribe un programa que simule una carrera de 20 "pasos" entre dos caracoles.
//                En cada paso, la posición de cada caracol aumenta según su velocidad.
//        Al final, ¡declara al caracol ganador (o si hay un emocionante empate)!
//
//                Pista: usar java.util.Random
        Scanner caracol = new Scanner(System.in);
        Scanner apuesta = new Scanner(System.in);

        System.out.println("Escoge el caracol que quieras rojo, amarillo, azul o el villano negro: " );
        String colorCaracol = caracol.nextLine().toLowerCase().replace("_"," ");

        System.out.println("Esto no tiene gracia sin que juguemos con tus ahorros, apuesta y llévate el doble o piérdelo todo");
        System.out.println("¿Cuantos € vas a apostar? Recuerda los céntimos también cuentan pon dos decimales");
        Double dineroApuesta = apuesta.nextDouble();

        int ROJO = 1, AMARILLO = 1, AZUL = 1, VILLANO_NEGRO = 1;

        Random aleatorio = new Random();
        for (int i = 1; i < 21; i++){
            ROJO += aleatorio.nextInt(5) +1;
            AMARILLO += aleatorio.nextInt(5) +1;
            AZUL += aleatorio.nextInt(5)+1;
            VILLANO_NEGRO += aleatorio.nextInt(5)+1;

            System.out.println("En el control "+i+" El caracol Rojo recorre: "+ROJO+"cm. El caracol Amarillo recorre: "+AMARILLO+"cm. El caracol Azul recorre: "+AZUL+"cm. y El Villano Negro recorre: "+VILLANO_NEGRO+"cm.");
            }
            int ganadores = Math.max(Math.max(ROJO,AMARILLO), Math.max(AZUL,VILLANO_NEGRO));
            String gana = "";

            if (ROJO == ganadores) gana += "rojo";
            if (AMARILLO == ganadores) gana += "amarillo";
            if (AZUL == ganadores) gana += "azul";
            if (VILLANO_NEGRO == ganadores) gana += "Villano Negro";

            System.out.println("La carrera ha acabado siendo el caracol o caracoles gandor o ganadores: " + gana.trim());

            if (gana.contains(colorCaracol)) {
                System.out.println("Enhorabuena has ganado: " + dineroApuesta * 2 + "€" + " puedes reclamarselo a los creadores del reto.");
            }else{
                System.out.println("Ohhh has perdido tus "+dineroApuesta+"€"+" , la banca gana pero intenta recuperarlo.");
        }
        caracol.close();
        apuesta.close();
    }

}
