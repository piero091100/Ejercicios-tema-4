import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numeroIf;
        int numeroWhile = 0;
        int numeroDoWhile = 2;
        String estacion = "Invierno";

        System.out.println("Ingrese número: ");
        numeroIf = entrada.nextInt();

        if(numeroIf > 0){
            System.out.printf("%d es un número positivo\n\n", numeroIf);
        }

        if(numeroIf < 0){
            System.out.printf("%d es un número negativo\n\n", numeroIf);
        }

        if(numeroIf == 0){
            System.out.printf("%d es un número neutro\n\n", numeroIf);
        }

        System.out.println("*** Bucle While ***");
        while( numeroWhile < 3){
            System.out.println(numeroWhile);
            numeroWhile++;
        }

        System.out.println("\n\n*** Bucle Do While ***");
        do{
            System.out.println(numeroDoWhile);
            numeroDoWhile++;
        }while(numeroDoWhile < 3);

        System.out.println("\n\n*** Bucle For ***");
        for(int numeroFor = 0 ; numeroFor <= 3 ; numeroFor++ ){
            System.out.println(numeroFor);
        }

        System.out.println("\n\n*** Switch ***");
        switch (estacion){
            case "Verano":
                System.out.printf("Te encuentras en la estación de %s" ,estacion);
                break;
            case "Otoño":
                System.out.printf("Te encuentras en la estación de %s" ,estacion);
                break;
            case "Invierno":
                System.out.printf("Te encuentras en la estación de %s" ,estacion);
                break;
            case "Primavera":
                System.out.printf("Te encuentras en la estación de %s" ,estacion);
                break;
            default:
                System.out.println("No es una estación");
                break;
        }
    }
}