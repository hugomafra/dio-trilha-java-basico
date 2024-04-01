import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        int numero;
        String agencia,nomeCliente;
        Double saldo = 237.48;

        System.out.print("Por favor, digite o número da Agência : ");
        agencia = sc.nextLine();

        System.out.print("Por favor, digite o número da Conta : ");
        numero = sc.nextInt();
        sc.nextLine();

        System.out.print("Agora informe seu nome completo: ");
        nomeCliente = sc.nextLine();

        System.out.println();
        System.out.print("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + " , conta " + numero +" e seu saldo é " + saldo +" já está disponível para saque.");

        sc.close();
    }
}