import java.util.Scanner;
import java.util.Random;
public class Ex6 {
    public static void main(String[] args) {
        int numero1, numero2, sorteio, menor = 0, maior=0;
        
        System.out.println("Algoritmo Sorteio");

        Scanner leitor = new Scanner(System.in);

        System.out.print("Escreva o primeiro número: ");
        numero1 = leitor.nextInt();

        System.out.print("Escreva o segundo número: ");
        numero2 = leitor.nextInt();
        
        if(numero1> numero2) {
             maior = numero1;
             menor = numero2;
        }
        else{
            maior = numero2;
            menor = numero1;
        }
        
        Random random = new Random();
        sorteio = random.nextInt(menor,maior);

        System.out.println("O número sorteado entre " + numero1 + " e " + numero2 + " foi: " + sorteio);
        
        if( sorteio % 2 ==0) {
            System.out.println(" O número do sorteio, " + sorteio + ", é PAR");
        }
        else {
            System.out.println(" O número do sorteio, " + sorteio + ", é IMPAR");
        }

    }   
}
