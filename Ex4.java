import java.util.Scanner;
public class Ex4 {
    public static void main(String[] args) {
        
        double x=0;
        String nome = "";
        Scanner scanner = new Scanner (System.in);

        System.out.println("Escolha qual operação: \n 1-Calcular o perimetro do circulo. \n 2-Calcular a área do circulo. \n 3-Calcular o volume da esfera.");
        int operacao = scanner.nextInt();

        System.out.print("Coloque o valor do raio do circulo ou esfera: ");
        int raio = scanner.nextInt();

        switch(operacao) {
            case 1:
                x = 2 * 3.14 * raio;
                nome = "perimetro";
                break;
            case 2:
                x = 3.14 * Math.sqrt(raio);
                nome = "área";
                break;
            case 3:
                x = (4/3) * Math.PI * Math.cbrt(raio);
                nome = "volume";
                break;
            default:
                System.out.println("O número colocado foi inválido");
                System.out.println("Insira novamente");
                operacao = scanner.nextInt();
        }
        
        System.out.printf("O valor da operação " + nome + " é: " + "%.2f", x);
    }

}
