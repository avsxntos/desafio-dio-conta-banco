import java.util.Scanner;
public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        /* Criação de Scanner para fazer a criação do armazenamento de dados inseridos pelo usuário*/ 
        Scanner sc = new Scanner(System.in);

         /* Declaração de Varíaveis */
        String agencia = "5928-B";
        double saldo = 120.00;

        System.out.println("Por favor! Insira seu nome inteiro e pressione Enter para prosseguir com a criação da sua conta: ");
        String nomeCliente = sc.nextLine();

        System.out.println("Insira o número da sua agencia de sua escolha: ");
        String numero = sc.nextLine();

        System.out.println("Olá! " +nomeCliente ", obrigado por criar uma conta em nosso banco, sua agência é " +agencia ", conta " +numero "e seu saldo é de R$" +saldo " e já está disponível para saque!");


        

    }
}
