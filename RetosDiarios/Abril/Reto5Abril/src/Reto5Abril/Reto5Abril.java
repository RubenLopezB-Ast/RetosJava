package Reto5Abril;
import java.util.Scanner;
public class Reto5Abril {
    public static void main(String[] args) {
//        Vamos a crear un programa que asegure que hay tantos abrir exclamación (¡) como cerrar exclamación (!) para flamearlo.
//        Ejemplo de entrada:
        Scanner exclama = new Scanner(System.in);
        System.out.println("Pón tu frase o palabra:");
        String palabra = exclama.nextLine();

        int abrir = 0;
        int cerrar = 0;

        for (int i = 0; i < palabra.length(); i++){
            char c = palabra.charAt(i);
            if (c=='¡') {
                abrir++;
            }else if(c=='!'){
                cerrar++;
            }

        }
if (abrir == cerrar) {
    System.out.println("Frase con exclamaciones correctas");
}else{
    System.out.println("Frase con exclamaciones incorrectas");
}
exclama.close();
    }
}
