package Reto2Abril;

//Tu misión es simple, soldado: crear un calendario que muestre todos los meses del año y sus semanas
// de forma clara y organizada. Nada de efectos especiales ni complicaciones innecesarias, solo un buen
// código que haga el trabajo. Crea un programa que:
//Itere los meses del año
//Itere las semanas del mes
//PISTA: Bucle for anidad.
//
//--Ejemplo:
//Enero
//Semana 1
//Semana 2
//Semana 3
//        …
public class Reto2Abril {
    public static void main(String[]args){
        String[] meses={"Enero","Febrero","Marzo","Abril","Mayo","Junio","Julio","Agosto","Septiembre","Octubre","Noviembre","Diciembre"};//Escribo array con los 12 meses
        int semanas = 4; //Se toman cuatro semanas por mes

        for ( int i = 0; i<meses.length; i++){ // Bucle for y función lenght para recorrer cada mes de la lista (tambén valdría poner 12 sin length -Bucle exterior
            System.out.println("\n"+meses[i]);// \n para hacer salto de línea -Bucle exterior
            for (int j = 1; j<= semanas; j++){ // Bucle for empieza en uno y va recorriendo hasta llegar a 4 valor recogido anteriormente en semanas -Bucle interior
                    System.out.println("Semana "+ j); // Imprime la semana seguida de su número (max. 4) -Bucle interior
                }
            }

        }

    }

