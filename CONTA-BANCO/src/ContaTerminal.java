
import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(System.in)){;

        
        System.out.println("Por favor digite o numero da Agencia");
        String agencia = scanner.nextLine();

        System.out.println("Por favor digite o numero da Conta");
        String numeroConta = scanner.nextLine();

        System.out.println("Por favor digite o  Nome do cliente");
        String nomeCliente = scanner.nextLine();

        System.out.println("Por favor digite Saldo");
        String saldo = scanner.nextLine();

        String mensagem = "Ola" + nomeCliente + ", Obrigado por criar uma conta com o nosso banco sua Agencia e " + agencia + " sua Conta e " + numeroConta + " eu saldo e " + saldo + " Disponivel para saque";

        System.err.println(mensagem);

        
        scanner.close();

        }
    }
}
