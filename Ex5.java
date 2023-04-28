import java.util.Scanner;;
public class Ex5 {
    public static void main(String[] args) {
        double numero1, numero2, resposta=0;
        String operacao="";

        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Coloque o valor do número 1: ");
        numero1 = leitor.nextDouble(); 

        System.out.println("São aceitos + , - , * , / e ^, digite a operação: ");
        operacao = leitor.next();
        
        System.out.println("Coloque o valor do número 2: ");
        numero2 = leitor.nextDouble();
        
        while (!"+".equals(operacao) && !"-".equals(operacao) && !"*".equals(operacao) && !"/".equals(operacao) && !"^".equals(operacao)) {
            System.out.println("Operador inválido, escreva novamente: ");
            operacao = leitor.next();
        }

        switch(operacao) {
            case "+": 
               resposta = numero1 + numero2;
               System.out.println("O resultado da operação " + operacao +" é: " + resposta);
               break;
            case "-":
                resposta = numero1 - numero2;
                System.out.println("O resultado da operação " + operacao +" é: " + resposta);
                break;
            case "*":
                resposta = numero1 * numero2;
                System.out.println("O resultado da operação " + operacao +" é: " + resposta);
                break;
            case "^":
                resposta = Math.pow(numero1, numero2);
                System.out.println("O resultado da operação " + operacao +" é: " + resposta);
                break;
            default:    
                System.out.println("Operador inválido!");
   
        }
    }
    

    
   
} 
