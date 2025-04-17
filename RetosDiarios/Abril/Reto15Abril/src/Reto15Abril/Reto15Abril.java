package Reto15Abril;
//Resulta que nos piden que programemos un validador de contraseñas. Algo fácil para los alumnos
//de Prometeo. Solo tenemos que decir si, una contraseña introducida por terminal es válida o no.
//Para que una contraseña sea válida debe:
//Tener al menos 8 caracteres.
//Tener al menos una letra minúscula.
//Tener al menos una letra mayúscula.
//Tener al menos un número.
//Tener al menos un símbolo especial  de entre los siguientes *, ?, !, ^, “, $.
//No contener la palabra GIT, en ningún formato (ni GIT, ni git, ni gIt, ni giT, ni Git, ni GIt,
// ni gIT, ni GiT). Odiamos Git.
import java.util.Scanner;
public class Reto15Abril {
    public static void main(String[] args) {
        String contrasena;
        Scanner validador = new Scanner(System.in);
        System.out.println("Escribe la contraseña: ");
        contrasena = validador.nextLine();
        if(contrasena.length()<8){
            System.out.println("Contraseña corta debe de tener al menos 8 caracteres");
        }else if (!contrasena.matches(".*[a-z].*")){
            System.out.println("Contraseña incorrecta pon alguna letra minúscula");
        }else if(!contrasena.matches(".*[A-Z].*")){
            System.out.println("Contraseña incorrecta pon alguna letra mayúscula");
        }else if (!contrasena.matches(".*[0-9].*")){
            System.out.println("Contraseña incorrecta pon algún número");
        }else if (!contrasena.matches(".*[*?!^“$].*")){
            System.out.println("Contraseña incorrecta pon algún caractér especial");
        }else if (contrasena.toUpperCase().contains("GIT")){
            System.out.println("Contraseña incorrecta no puede conter el término (GIT) de ninguna forma");
        }else{
            System.out.println("Contraseña correcta. TODO OK");
        }

    }
}
