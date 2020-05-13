package jStrings;

import libs.Input;

public class SegundosReproduccion {

    public static void main(String[] args) {


//        Dada la leyenda de duracion de un video, en el formato mm:ss, proporcione el numero de segundos que habra que esperar
//        para que dicha reproduccion termine.
//
//                ejemplo:
//        duracion del video: 5:45
//        el video dura 345 segundos.
//
//        1.  imprimo mensaje "durancion del video: (mm:ss)"


        System.out.println("Ingresa la duración del video en (mm:ss):");
        String duracion= Input.get_string();

        String [] dividirvideo= (duracion.split(":"));

        int totalSegundos= Integer.parseInt(dividirvideo[0])*60+ Integer.parseInt(dividirvideo[1]);

        System.out.println("El total de segundos es:" +totalSegundos );

//        2.  capturar el dato del usuario guardarlo en un string
//        3.  partir la informacion en dos:  el primero es minutos, el otro es segundos
//        4.  multiplicar los minutos por sesenta y sumarle los segundos.
//        5. imprimir el resultado
    }
}
