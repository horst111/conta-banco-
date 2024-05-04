import java.util.Scanner;

import javax.print.DocFlavor.STRING;

import java.util.Locale;

public class ContaTerminal {
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
    
        System.out.println("Digite seu nome e sobrenome");
        String nomeCliente = scanner.nextLine();

        System.out.println("Digite seu número ");
        int numero = scanner.nextInt();
       
        System.out.println("Digite sua Agência");
        int agencia = scanner.nextInt();

        System.out.println("Digite seu saldo");
        Double saldo = scanner.nextDouble();

        System.out.println("Olá," + " " + nomeCliente + " " + "obrigado por criar uma conta em nosso banco, sua agência é" +  " " + agencia + "," + " " + "conta"+ " " + numero + " " + "e seu saldo" + " " + saldo + " " + "já está disponível para saque" );
    }
}
