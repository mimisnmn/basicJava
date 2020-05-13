package gNumericTypes;

public class botellasAgua {
    public static void main(String[] args) {

        int botellasAgua= 12;

        for(int i=1; i<=10; i++){

            int totalDeBotellas= i * botellasAgua;
            System.out.println("Total de botellas de agua en ronda"+ " " + i + " " + "=" +" " + totalDeBotellas);
        }

    }
}
