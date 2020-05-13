package jStrings;

import libs.Input;

public class Tocayos {

    public static void main(String[] args) {

//        REalizar un programa que detecte si dos personas son tocayos
//
//        Consideraciones
//        1. Nombres bien escritos.
//        2. Las preposiciones o articulos no cuentan. (de, la, los, a, ante bajo, con contra, de)
//        3. Con que coincida un nombre ya esta.
//
//        1.  Pedir el primer nombre

        System.out.print("Favor de ingresar el primer nombre");
        String pimerNombre = Input.get_string();
//        2. Pedir el segundo nombre.
        System.out.print("Favor de ingresar el segundo nombre");
        String segundoNombre = Input.get_string();
//        2A. crear un contador de coincidencias e igualarlo a cero
        int contadorCoincidencia=0;


//        3. Divides el primer nombre completo
        String divNom[] = (pimerNombre.split(" "));

//        4. tomo la primera palabra, y la checo con el segundo nombre completo

        for(int i=0; i<divNom.length; i++){
            String nombreactual=divNom[i];

            if(segundoNombre.contains(nombreactual)){
                contadorCoincidencia= contadorCoincidencia+1;
            }


        }
         if (contadorCoincidencia>=1){

             System.out.println("Son tocayos");
         }
         else
         {
             System.out.println("No son Tocayos");
         }

//        5. repetir el paso 4 con la siguiente palabra
//        6. repetir el paso 4 con la siguiente palabra
//        7. repetir el paso 4 con la siguiente palabra
//        8. Checar el numero de coincidencias.  Si es mayor que cero, entonces imprimir 'Tocayos'
//
//
//        Pedro Antonio Corona
//        Marco Antonio Coronado
    }
}
