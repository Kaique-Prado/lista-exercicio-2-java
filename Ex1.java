import java.util.Scanner;

public class Ex1 {

    public static void main(String[] args) {

        float numero1, numero2, numero3, media;
        
        Scanner tecladoScan= new Scanner(System.in); 

        System.out.println("Algoritmo leitura de três números");
        
        System.out.println("Escreva o primeiro número: ");
        n1 = tecladoScan.nextFloat();

        System.out.println("Escreva o segundo número: ");
        n2 = tecladoScan.nextFloat(); 

        System.out.println("Escreva o terceiro número:");
        n3 = tecladoScan.nextFloat();

        
        if (numero1 > numero2 & numero1 > numero3) {
            System.out.println("O primeiro número é o maior");
        } else if(numero1 < numero2 & numero1 < numero3) {
            System.out.println("O primeiro número é o menor");
        }
        
        if (numero2 > numero1 & numero2 > numero3) {
            System.out.println("O segundo número é o maior");
        } else if(numero2 < numero1 & numero2 < numero3) {
            System.out.println("O segundo número é o menor");
        }

        if (numero3 > numero2 & numero3 > numero1) {
            System.out.println("O terceiro número é o maior");
        } else if(numero3 < numero2 & numero3 < numero1) {
            System.out.println("O terceiro número é o menor");
        }
        media = numero1 + numero2 + numero3 /3;
        System.out.printf( "A média aritmética é: " + media);
        
        tecladoScan.close();
    }
}