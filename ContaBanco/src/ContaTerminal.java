import java.util.Locale;
import java.util.Scanner;



public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        int numero;
        String agencia;
        String nomeCliente;
        double saldo;

        System.out.println("Bem-vindo ao Banco Spellman, digite o número da conta!");
        numero = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Digite o número da agência!");
        agencia = scanner.nextLine();
        System.out.println("Digite o nome do cliente!");
        nomeCliente = scanner.nextLine();
        System.out.println("Digite o saldo da conta!");
        saldo = scanner.nextDouble();

        System.out.println("Conta criada com sucesso!");
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco!");
        System.out.println("Sua agência é " + agencia + ", conta " + numero + " e seu saldo é R$ " + String.format(Locale.forLanguageTag("pt-BR"), "%.2f", saldo) + ".");
        System.out.println("O saldo já está disponível para saque! Aproveite nossos serviços!");
        scanner.close();

        // Configurar o Locale para pt-BR
        //TODO: Conhecer a classe Scanner do Java
        // Exibir uma mensagem de boas-vindas ao usuário
        // Obter pela scanner os valores digitados no terminal
        // Exibir a mensagem conta criada com sucesso
        // Exibir os dados da conta do usuário
    }
}
