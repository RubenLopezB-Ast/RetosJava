package Reto1;
import java.util.Scanner;
public class Reto1 {
    public static void main(String[] args) {
        //1. Crea un programa en Java que calcule la calificación de un estudiante
// a partir de un número entero. Solicita un número (x) al usuario y
// responde de la siguiente manera:
//
//        10 - Matrícula de honor
//9 - Sobresaliente
//7.8 - Notable
//6 - Bien
//5 - Aprobado
//0.4 - Suspenso
//Utiliza la instrucción switch con los casos break y default en Java.
        Scanner reto = new Scanner(System.in);
//        System.out.println("Esctibe la nota del alumno: ");
//        int nota = reto.nextInt();
//        if (nota < 0) {
//            System.out.println("Menos de cero imposible repasalo");
//        }else{
//            switch (nota) {
//                case 1:
//                    System.out.println("Suspenso");
//                    break;
//                case 2:
//                    System.out.println("Suspenso");
//                    break;
//                case 3:
//                    System.out.println("Suspenso");
//                    break;
//                case 4:
//                    System.out.println("Suspenso");
//                    break;
//                case 5:
//                    System.out.println("Aprobado");
//                    break;
//                case 6:
//                    System.out.println("Bien");
//                    break;
//                case 7:
//                    System.out.println("Notable");
//                    break;
//                case 8:
//                    System.out.println("Notable");
//                    break;
//                case 9:
//                    System.out.println("Sobresaliente");
//                    break;
//                case 10:
//                    System.out.println("Matrícula de Honor");
//                    break;
//
//                default:
//                    System.out.println("No puedes tener más de diez revísalo");
//                    break;
//            }
//
//        }
//        System.out.println("/n");
////   2. Cree un programa en Java que solicite al usuario una letra (x) y compruebe si es una vocal o
//// cualquier otro símbolo. El programa debe mostrar por pantalla "Vocal" si la entrada es una
//// vocal (a, e, i, o, u) y "Otro símbolo" si es cualquier otro carácter.
//
//        reto.nextLine();
//        System.out.println("Pon un caractér y yo te digo que es");
//        String caracter = reto.nextLine().toUpperCase();
//        if (caracter.equals("A") || caracter.equals("E") || caracter.equals("I") || caracter.equals("O") || caracter.equals("U")){
//            System.out.println("Has introducido una vocal");
//        }else {
//            System.out.println("A saber que has introducido pero una vocal NO¡¡¡");
//        }
//        System.out.println("/n");
//
//        //7. Crea un programa en Java que simule una caja registradora de supermercado para devolver el cambio de una compra.
//// Solicita la cantidad total de dinero que tienes en la caja registradora (x) y el valor de la compra (y) como
//// un número entero.
////Debes utilizar billetes de 100, 50, 20, 10, 5, 2 o 1 y devolver el cambio utilizando primero los billetes de
//// mayor valor.
//
//        System.out.println("Dinero entregado" );
//        int totalCaja = reto.nextInt();
//
//        System.out.println("Introduce el valor de la compra: ");
//        int valorCompra = reto.nextInt();
//        int cambio = totalCaja - valorCompra;
//        System.out.println("La vuelta es: "+ cambio + "€");
//        int[] billetes ={100, 50, 20, 10, 5, 2, 1};
//        for (int billete : billetes){
//            if(cambio>=billete){
//                int numeroBilletes = cambio / billete;
//                cambio %= billete;
//                System.out.println("Devolución de "+ numeroBilletes + " en billetes de "+ billete+" €.");
//            }
//            System.out.println("/n");
//
//           // 3. Escribe un programa en Java que solicite al usuario ingresar tres números (x, y, z) y determine
//            // cuál de ellos es el número más grande. Luego, muestra ese número en la pantalla.
//
//            System.out.println("Dime el número x: ");
//            int numeroX = reto.nextInt();
//
//            System.out.println("Dime el número y: ");
//            int numeroY = reto.nextInt();
//
//            System.out.println("Dime el número z: ");
//            int numeroZ = reto.nextInt();
//
//            int numeroMayor = Math.max(numeroX,Math.max(numeroY,numeroZ));
//            System.out.println("El número mayor es: "+ numeroMayor);
//
//
//        }
//        System.out.println("/n");
//
//        //4. Escribe un programa en Java que actúe como una calculadora básica. El programa solicitará al
//        // usuario ingresar dos números y una operación matemática (+, -, x, /). Luego, calculará la operación
//        // seleccionada y mostrará el resultado en la pantalla.
//        //Si el símbolo de la operación es diferente a los operadores permitidos (+, -, x, /), el programa
//        // indicará "Caracter no reconocido".
//        System.out.println("Menú:");
//     System.out.println("1. Sumar");
//       System.out.println("2. Restar");
//       System.out.println("3. Multiplicar");
//       System.out.println("4. Dividir");
//       System.out.println("5. Resto");
//     System.out.println("Elige un opción:  ");
//       int operacion = reto.nextInt();
//
//      System.out.println("Número A");
//       double numA = reto.nextDouble();
//       System.out.println("Número B");
//      double numB = reto.nextDouble();
//       switch (operacion){
//          case 1:
//               System.out.println("Resultado de la suma: " + (numA + numB));
//               break;
//           case 2:
//              System.out.println("Resultado de la resta: " + (numA - numB));
//              break;
//              case 3:
//               System.out.println("Resultado de la multiplicación: " + (numA*numB));
//               break;
//          case 4:
//              if (numB !=0){
//                  System.out.println("Resultado de la división: " +(numA/numB));
//              }else{
//                  System.out.println("Error no se puede dividir entre cero");
//              }
//              break;
//           case 5:
//              if (numB !=0){
//              System.out.println("Resultado del resto de la división entre: "+numA+" y "+numB+" = " +(numA % numB));
//              }else{
//                  System.out.println("Error no se puede dividir entre cero");
//              }
//               }
//        System.out.println("/n");
        //5. Escribe un programa en Java que pregunte al usuario por un número x y muestre el resultado de su
        // tabla de multiplicar del 1 al 10.

        System.out.println("Dime un número");
        int numeroUsuario = reto.nextInt();
        int resultado1 = numeroUsuario*1;
        int resultado2 = numeroUsuario*2;
        int resultado3 = numeroUsuario*3;
        int resultado4 = numeroUsuario*4;
        int resultado5= numeroUsuario*5;
        int resultado6= numeroUsuario*6;
        int resultado7= numeroUsuario*7;
        int resultado8= numeroUsuario*8;
        int resultado9= numeroUsuario*9;
        int resultado10= numeroUsuario*10;
        System.out.println("Su número es "+numeroUsuario+" y da como resultado "+resultado1+" "+resultado2+" "+resultado3+" "+resultado4+" "+resultado5+" "+resultado6+" "+resultado7+" "+resultado8+" "+resultado9+" "+resultado10);
        System.out.println("/n");

        //6. Escribe un programa en Java que muestre los números impares desde x hasta y en orden descendente.
        System.out.println("Introduce el número x: ");
        int x = reto.nextInt();
        System.out.println("Introduce el número y: ");
        int y = reto.nextInt();
        if (x<y) {
            System.out.println("X tiene que ser siempre el número mayor.");
        }else{
            for (int i = x; i >= y; i --){
                if (i%2!=0){
                    System.out.println(i+" ");
                }
            }
        }
    }

    }

