package Reto6Abril;
import java.util.Scanner;
public class Reto6Abril {
    public static void main(String[]args) {
//        Crea un programa que:
//        Reciba la cantidad de dinero (double) que el usuario ha entregado para pagar.
//                Compare la cantidad entregada con el precio del producto y calcule la
//    diferencia.
//            Súmale el IVA porque esto es españa, redondeado a dos décimas (+21%)
//        Devuelva el valor utilizando la menor cantidad de billetes y monedas posibles
//        siendo estos billete de 500 €, billete de 200 €, billete de 100 €, billete de 50 €,
//            billete de 20 €, billete de 10 €, billete de 5 €, moneda de 2 €, moneda de 1 €,
//            moneda de 50 cnts, moneda de 20 cnts, moneda de 10 cnts, moneda de 2 cnts y
//        moneda de 1 cnt.
//                Pero cuidado, si un cliente intenta pagar con menos dinero del
//        necesario… ¡tendrás que avisarle antes de que se lleve el producto gratis!
        Scanner precio = new Scanner(System.in);
        System.out.println("Introduce el precio del producto sin IVA: " );
        double precioDado = precio.nextDouble();
        double precioIVA = Math.round(precioDado*1.21*100.0)/100.0;
        System.out.println("El precio con IVA del producto es:" + precioIVA + "€");

        System.out.println("Dinero entregado para pagar: ");
        double dineroCliente= precio.nextDouble();
        if (dineroCliente<precioIVA){
            System.out.println("El producto cuesta más dinero que el introducido");
        }
        double cambio = dineroCliente - precioIVA;
        System.out.println("Devolución a cliente: " + Math.round(cambio*100.0)/100.0+"€");

        //Necesito pasarlo a céntimos
        int cambioCentimos = (int) Math.round(cambio*100);

        //Caja con los billetes pasados a céntimos
        int[] valoresCaja = {50000,20000,10000,5000,2000,1000,500,200,100,50,20,10,5,2,1};
        String[]billetesMonedasCaja={
                "B500€","B200€","B100€","B50€","B20€","B10€","B5€","M2€","M1€","M0,50€","M0,20€","M0,10€","M0,02","M0,05€","M0,01€"
        };
        System.out.println("Cambio a entregar al cliente: ");
        for (int i = 0; i< valoresCaja.length; i++){
            int cantidad = cambioCentimos / valoresCaja[i];
            if (cantidad>0){
                System.out.println(cantidad + " = " + billetesMonedasCaja[i]);
                cambioCentimos %= valoresCaja[i];
            }
        }
        precio.close();
    }
}
