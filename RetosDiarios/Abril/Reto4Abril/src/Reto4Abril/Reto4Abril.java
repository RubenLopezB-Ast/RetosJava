package Reto4Abril;
//Haz un programa que, dado un número que se pasa por entrada, haga una cuenta
//        atrás y acabe con un ¡BOOM!.

import java.util.Scanner;
public class Reto4Abril {
    public static void main(String[] args) {
Scanner bomba = new Scanner(System.in);

        System.out.println("¿Donde quieres que empiece la cuenta atrás dí un número?");
        int cuenta = bomba.nextInt();
        for(int i = cuenta; i > 0; i = i-1){
            System.out.println(i);
        }
        System.out.println("Boom");
        bomba.close();
    }

}
