import java.util.Scanner; 

public class Ex2CasoQueiraVer {

    public static void main(String[] args) {
        String escolha= "";
        int op1, op2, op3, op4, op5;
        int quantidade1=0, quantidade2=0, quantidade3=0, quantidade4=0;
        int preco1=0, preco2=0, preco3=0, preco4=0;
        int  troco, dinheiro;
        int notas50, notas20, notas10, notas5, notas2, notas1;
        int total1=0, total2=0, total3=0, total4=0;
    
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Máquina de Vendas!");
        
        System.out.println("A máquina aceita apenas notas de: \n R$ 50,00 \n R$ 20,00 \n R$ 10,00 \n R$ 5,00 \n R$ 2,00 \n R$ 1,00 \n");
        
        System.out.println("1 - Salgados: 5,00 R$ \n 2 - doces: 2,00 R$ \n 3 - sucos: 10,00 R$ \n 4 - refrigerantes: 9,00 R$" );
        System.out.println("Escolha uma opção acima pelo número dela");
        op1 = scanner.nextInt();
     
        switch (op1) {
            case 1:
                preco1 = 5;
                System.out.println("Quer quantos Salgados?");
                quantidade1 = scanner.nextInt();
                while (quantidade1 == 0){
                    System.out.println("Quantidade inválida ");
                    System.out.println("Insira a quantidade novamente:");
                    quantidade1 = scanner.nextInt();
                }
                break;
            case 2:
                preco1 = 2;
                System.out.println("Quer quantos doces?");
                quantidade1 = scanner.nextInt();

                while (quantidade1 == 0){
                    System.out.println("Quantidade inválida ");
                    System.out.println("Insira a quantidade novamente:");
                    quantidade1 = scanner.nextInt();
                }
                break;
            case 3:
                preco1 = 10;
                System.out.println("Quer quantos sucos?");
                quantidade1 = scanner.nextInt();

                while (quantidade1 == 0){
                    System.out.println("Quantidade inválida ");
                    System.out.println("Insira a quantidade novamente:");
                    quantidade1 = scanner.nextInt();
                }
                break;
            case 4:
                preco1 = 9;
                System.out.println("Quer quantos refrigerantes?");
                quantidade1 = scanner.nextInt();

                while (quantidade1 == 0){
                System.out.println("Quantidade inválida ");
                System.out.println("Insira a quantidade novamente:");
                quantidade1 = scanner.nextInt();
                }
                break;
            default:
                while( op1<=0 | op1>=5) { 
                    System.out.println("O número inserido é inválido");
                    System.out.println("Insira o número novamente:");
                    op1 = scanner.nextInt();
                }
        }   
        total1 = preco1 * quantidade1;
        
        System.out.println("Quer escolher mais uma opção? sim ou não");
        escolha = scanner.next();
        
        if(escolha.equals("s") || escolha.equals("sim") || escolha.equals("S") || escolha.equals("Sim")) {
            
            System.out.println("1 - Salgados: 5,00 R$ \n 2 - doces: 2,00 R$ \n 3 - sucos: 10,00 R$ \n 4 - refrigerantes: 9,00 R$");
            System.out.println("Escolha uma opção acima pelo número dela");
            op2 = scanner.nextInt();
            
            switch (op2) {
                case 1:
                    preco2 = 5;
                    System.out.println("Quer quantos Salgados?");
                    quantidade2 = scanner.nextInt();

                    while (quantidade2 == 0){
                        System.out.println("Quantidade inválida ");
                        System.out.println("Insira a quantidade novamente:");
                        quantidade2 = scanner.nextInt();
                    }
                    break;
                case 2:
                    preco2 = 2;
                    System.out.println("Quer quantos doces?");
                    quantidade2 = scanner.nextInt();

                    while (quantidade2 == 0){
                        System.out.println("Quantidade inválida ");
                        System.out.println("Insira a quantidade novamente:");
                        quantidade2 = scanner.nextInt();
                    }
                    break;
                case 3:
                    preco2 = 10;
                    System.out.println("Quer quantos sucos?");
                    quantidade2 = scanner.nextInt();

                    while (quantidade2 == 0){
                        System.out.println("Quantidade inválida ");
                        System.out.println("Insira a quantidade novamente:");
                        quantidade2 = scanner.nextInt();
                    }
                    break;
                case 4:
                    preco2 = 9;
                    System.out.println("Quer quantos refrigerantes?");
                    quantidade2 = scanner.nextInt();

                    while (quantidade2 == 0){
                        System.out.println("Quantidade inválida ");
                        System.out.println("Insira a quantidade novamente:");
                        quantidade2 = scanner.nextInt();
                    }
                    break;
                default:
                    while( op1<=0 | op1>=5) { 
                        System.out.println("O número inserido é inválido");
                        System.out.println("Insira o número novamente:");
                        op1 = scanner.nextInt();
                    }
                
            } 
        }else{
            System.out.print("O total é:"+ total1 +" R$"+"\n" );

            System.out.println("Coloque o dinheiro na máquina");
            dinheiro = scanner.nextInt();
            
            System.out.println("Dinheiro colocado: " + dinheiro + " R$");
            
            
            
            while (dinheiro< total1) {
                System.out.println("O dinheiro colocado é insificiente!");
                System.out.println("Coloque o dinheiro na máquina novamente");
                dinheiro = scanner.nextInt();
            }

            troco = dinheiro - total1;
            System.out.println("O troco é: " + troco);

            if(troco == 0) {
                System.out.println("Sem troco!");
                System.exit(0);
            }else {notas50 = troco / 50;
            troco = troco % 50;
            
            notas20 = troco / 20;
            troco =troco % 20;
            
            notas10 = troco / 10;
            troco =troco % 10;
            
            notas5 = troco / 5;
            troco = troco % 5;
        
            notas2 = troco / 2;
            troco = troco % 1;
           
            notas1 = troco / 1;
            troco = troco % 1;

            
            
             System.out.println("Notas de R$50:  " + notas50 + "\n");
             System.out.println("Notas de R$20:  " + notas20 + "\n");
             System.out.println("Notas de R$10:  " + notas10+ "\n");
             System.out.println("Notas de R$5:  " + notas5 + "\n");
             System.out.println("Notas de R$2:  " + notas2 + "\n");          
             System.out.println("Notas de R$1:  " + notas1 + "\n");     
             System.exit(0);
            }
        }
        total2 = (preco2 * quantidade2) + total1;
        
        System.out.println("Quer escolher mais uma opção?");
        escolha = scanner.next();
        
        if(escolha.equals("s") || escolha.equals("sim") || escolha.equals("S") || escolha.equals("Sim")) {
            
            System.out.println("Escolha uma opção acima pelo número dela");
            op3 = scanner.nextInt();

            switch (op3) {
                case 1:
                    preco3 = 5;
                    System.out.println("Quer quantos Salgados?");
                    quantidade3 = scanner.nextInt();

                    while (quantidade3 == 0){
                        System.out.println("Quantidade inválida ");
                        System.out.println("Insira a quantidade novamente:");
                        quantidade3 = scanner.nextInt();
                    }
                    break;
                case 2:
                    preco3 = 2;
                    System.out.println("Quer quantos doces?");
                    quantidade3 = scanner.nextInt();

                    while (quantidade3 == 0){
                        System.out.println("Quantidade inválida ");
                        System.out.println("Insira a quantidade novamente:");
                        quantidade3 = scanner.nextInt();
                    }
                case 3:
                    preco3 = 10;
                    System.out.println("Quer quantos sucos?");
                    quantidade3 = scanner.nextInt();

                    while (quantidade3 == 0){
                        System.out.println("Quantidade inválida ");
                        System.out.println("Insira a quantidade novamente:");
                        quantidade3 = scanner.nextInt();
                    }
                    break;
                case 4:
                    preco3 = 9;
                    System.out.println("Quer quantos refrigerantes?");
                    quantidade3 = scanner.nextInt();

                    while (quantidade3 == 0){
                        System.out.println("Quantidade inválida ");
                        System.out.println("Insira a quantidade novamente:");
                        quantidade3 = scanner.nextInt();
                    }
                    break;
                default:
                    while( op1<=0 | op1>=5) { 
                        System.out.println("O número inserido é inválido");
                        System.out.println("Insira o número novamente:");
                        op1 = scanner.nextInt();
                    }
            }
        } else {
             
            System.out.print("O total é:"+ total2 +" R$"+"\n" );

            System.out.println("Coloque o dinheiro na máquina");
            dinheiro = scanner.nextInt();
            
            System.out.println("Dinheiro colocado: " + dinheiro + " R$");
            
            
            
            while (dinheiro< total2) {
                System.out.println("O dinheiro colocado é insificiente!");
                System.out.println("Coloque o dinheiro na máquina novamente");
                dinheiro = scanner.nextInt();
            }
           
            troco = dinheiro - total2;
            System.out.println("O troco é: " + troco);

            if(troco == 0) {
                System.out.println("Sem troco!");
                System.exit(0);
            }else {notas50 = troco / 50;
            troco = troco % 50;
            
            notas20 = troco / 20;
            troco =troco % 20;
            
            notas10 = troco / 10;
            troco =troco % 10;
            
            notas5 = troco / 5;
            troco = troco % 5;
        
            notas2 = troco / 2;
            troco = troco % 1;
           
            notas1 = troco / 1;
            troco = troco % 1;

            
            
             System.out.println("Notas de R$50:  " + notas50 + "\n");
             System.out.println("Notas de R$20:  " + notas20 + "\n");
             System.out.println("Notas de R$10:  " + notas10+ "\n");
             System.out.println("Notas de R$5:  " + notas5 + "\n");
             System.out.println("Notas de R$2:  " + notas2 + "\n");          
             System.out.println("Notas de R$1:  " + notas1 + "\n");     
             System.exit(0);
            }
        }
        total3 = (preco3 * quantidade3)+ total2;
        
        System.out.println("Quer escolher mais uma opção?");
        escolha = scanner.next();

        
        if(escolha.equals("s") || escolha.equals("sim") || escolha.equals("S") || escolha.equals("Sim")) {
            
            System.out.println("Escolha uma opção acima pelo número dela");
            op4 = scanner.nextInt();

            switch (op4) {
                case 1:
                    preco4 = 5;
                    System.out.println("Quer quantos Salgados?");
                    quantidade4 = scanner.nextInt();
                    
                    while (quantidade4 == 0){
                        System.out.println("Quantidade inválida ");
                        System.out.println("Insira a quantidade novamente:");
                        quantidade4 = scanner.nextInt();
                    }
                    break;
                case 2:
                    preco4 = 2;
                    System.out.println("Quer quantos doces?");
                    quantidade4 = scanner.nextInt();

                    while (quantidade4 == 0){
                        System.out.println("Quantidade inválida ");
                        System.out.println("Insira a quantidade novamente:");
                        quantidade4 = scanner.nextInt();
                    }
                    break;
                case 3:
                    preco4 = 10;
                    System.out.println("Quer quantos sucos?");
                    quantidade4 = scanner.nextInt();

                    while (quantidade4 == 0){
                        System.out.println("Quantidade inválida ");
                        System.out.println("Insira a quantidade novamente:");
                        quantidade4 = scanner.nextInt();
                    }
                    break;
                case 4:
                preco4 = 9;
                    System.out.println("Quer quantos refrigerantes?");
                    quantidade4 = scanner.nextInt();

                    while (quantidade4 == 0){
                        System.out.println("Quantidade inválida ");
                        System.out.println("Insira a quantidade novamente:");
                        quantidade4 = scanner.nextInt();
                    }
                    break;
                default:
                    while( op1<=0 | op1>=5) { 
                    System.out.println("O número inserido é inválido");
                    System.out.println("Insira o número novamente:");
                    op1 = scanner.nextInt();
                }
            }
        } else {
    
            System.out.print("O total é:"+ total3 +" R$"+"\n" );

            System.out.println("Coloque o dinheiro na máquina");
            dinheiro = scanner.nextInt();
            
            System.out.println("Dinheiro colocado: " + dinheiro + " R$");
            
            
            
            while (dinheiro< total3) {
                System.out.println("O dinheiro colocado é insificiente!");
                System.out.println("Coloque o dinheiro na máquina novamente");
                dinheiro = scanner.nextInt();
            }

            troco = dinheiro - total3;
            System.out.println("O troco é: " + troco);

            if(troco == 0) {
                System.out.println("Sem troco!");
                System.exit(0);
            }else {notas50 = troco / 50;
            troco = troco % 50;
            
            notas20 = troco / 20;
            troco =troco % 20;
            
            notas10 = troco / 10;
            troco =troco % 10;
            
            notas5 = troco / 5;
            troco = troco % 5;
        
            notas2 = troco / 2;
            troco = troco % 1;
           
            notas1 = troco / 1;
            troco = troco % 1;

            
            
             System.out.println("Notas de R$50:  " + notas50 + "\n");
             System.out.println("Notas de R$20:  " + notas20 + "\n");
             System.out.println("Notas de R$10:  " + notas10+ "\n");
             System.out.println("Notas de R$5:  " + notas5 + "\n");
             System.out.println("Notas de R$2:  " + notas2 + "\n");          
             System.out.println("Notas de R$1:  " + notas1 + "\n");     
             System.exit(0);
            }
        }

        total4 = (preco4 * quantidade4) + total3;
            System.out.print("O total é:"+ total4 +" R$"+"\n" );

            System.out.println("Coloque o dinheiro na máquina");
            dinheiro = scanner.nextInt();
            
            System.out.println("Dinheiro colocado: " + dinheiro + " R$");
            
            
            
            while (dinheiro< total4) {
                System.out.println("O dinheiro colocado é insificiente!");
                System.out.println("Coloque o dinheiro na máquina novamente");
                dinheiro = scanner.nextInt();
            }

            troco = dinheiro - total4;
            System.out.println("O troco é: " + troco);

            troco = dinheiro - total3;
            System.out.println("O troco é: " + troco);

            if(troco == 0) {
                System.out.println("Sem troco!");
                System.exit(0);
            }else {notas50 = troco / 50;
            troco = troco % 50;
            
            notas20 = troco / 20;
            troco =troco % 20;
            
            notas10 = troco / 10;
            troco =troco % 10;
            
            notas5 = troco / 5;
            troco = troco % 5;
        
            notas2 = troco / 2;
            troco = troco % 1;
           
            notas1 = troco / 1;
            troco = troco % 1;

            
            
             System.out.println("Notas de R$50:  " + notas50 + "\n");
             System.out.println("Notas de R$20:  " + notas20 + "\n");
             System.out.println("Notas de R$10:  " + notas10+ "\n");
             System.out.println("Notas de R$5:  " + notas5 + "\n");
             System.out.println("Notas de R$2:  " + notas2 + "\n");          
             System.out.println("Notas de R$1:  " + notas1 + "\n");     
             System.exit(0);
            }     
        
        scanner.close();

    }


}
        


       
    