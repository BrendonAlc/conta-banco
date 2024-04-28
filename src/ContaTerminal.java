import java.math.BigDecimal;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        int numero;
        String agencia;
        String nomeDoCliente;
        BigDecimal saldoDaConta;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Por favor, digite o número da agência!");
        numero = scanner.nextInt();

        System.out.println("Por favor, digite a agência!");
        agencia = scanner.next();

        System.out.println("Por favor, digite o nome do cliente!");
        nomeDoCliente = scanner.next();

        System.out.println("Digite o saldo do cliente!");
        saldoDaConta = scanner.nextBigDecimal();

        System.out.println("Olá " + nomeDoCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia +
                ", conta " + numero + " e seu saldo " + saldoDaConta + " já está disponível para saque.");
    }
}