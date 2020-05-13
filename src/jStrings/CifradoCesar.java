package jStrings;

    public class CifradoCesar {
        public static void main(String[] args) {
            String msg = "VELOZzv";
            for(int i = 0; i < msg.length(); i++) {
                char actual = Character.toUpperCase(msg.charAt(i));
                char encriptado = (char) (actual + 5);

                if(encriptado>90)
                {
                    encriptado=encriptado-=26;
                    char encriptado2= (char)encriptado;
                }

                System.out.print(encriptado);
            }
            System.out.println();
        }
    }

