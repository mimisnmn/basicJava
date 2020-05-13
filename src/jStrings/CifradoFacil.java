package jStrings;

public class CifradoFacil {
    public static void main(String[] args) {

        String men="HOLA";
        for(int i =0; i< men.length();i++){
            char actual= men.charAt(i);
            char encriptado= (char) (actual+5);
            System.out.print(encriptado);

        }

    }
}
