import java.util.Scanner;
public class Ex3 {
    public static void main(String[] args) {
        int a = 0, b = 0, c = 0;
        double raiz1=0, raiz2=0;
       
        Scanner scanner = new Scanner(System.in);
        System.out.println("Algoritmo equação de segundo grau!");

        System.out.println("Coloque o valor de a");
        a = scanner.nextInt();
        System.out.println("Coloque o valor de b");
        b = scanner.nextInt();
        System.out.println("Coloque o valor de c");
        c = scanner.nextInt();
        
        double delta = Math.pow(b,2) - (4 * a *c);
        System.out.println("delta: " +delta);
        //a
        while ( a==0 & b==0 & c!=0) {
            System.out.println("Coeficientes a, b e c informados incorretamente");
            System.out.println("Escreva a novamente");
            a = scanner.nextInt();
            System.out.println("Escreva b novamente");
            b = scanner.nextInt();
            System.out.println("Escreva c novamente");
            c = scanner.nextInt();

        }

        //b  bx + c =0
        if (a==0 & b!=0) {
            System.out.println("Essa é uma equação de primeiro grau");
            int x = -c/b;  
            System.out.print("O x da equação é:" + x);
            System.exit(0);
        }
        //c
        if ( delta>0 ) {
            System.out.println("Essa equação possui raizes reais diferentes");
            raiz1 = (-b + Math.sqrt(delta) ) / (2*a);
            raiz2 = (-b - Math.sqrt(delta) ) / (2*a);
            System.out.printf("A raiz 1 vale:" + raiz1, "%.2f");
            System.out.printf("\n" + "A raiz 2 vale:" + raiz2, "%.2f");

        } else if (delta==0) {
            System.out.println("Essa equação possui raizes reais iguais");
            raiz1 = (-b + Math.sqrt(delta)) / (2*a);
            raiz2 = (-b + Math.sqrt(delta)) / (2*a);
            System.out.printf("A raiz 1 vale:" + raiz1, "%.2f" + "/n");
            System.out.printf("\n"+ "A raiz 2 vale:" + raiz2, "%.2f");

        }
        else if (delta < 0){
            System.out.println("Essa equação não possui raiz");
        }
    }
  
}

