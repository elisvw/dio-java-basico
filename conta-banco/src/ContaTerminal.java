import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        // TODO: Conhecer e importar a classe scanner
        Scanner scanner = new Scanner(System.in);

        // Exibir as mensagens para o usuário
        System.out.println("Para criar sua conta, siga os seguintes passos: ");

        System.out.println("Digite seu nome");
        // Obter pelo scanner os valores digitados no terminal
        String cliente = scanner.nextLine();

        System.out.println("Digite o número da agência");
        String numeroAgencia = scanner.nextLine();

        System.out.println("Digite o número da conta");
        int numeroConta = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Digite o saldo inicial");
        double saldo = scanner.nextDouble();
        scanner.nextLine();

        scanner.close();;

        // Exibir a mensagem da conta criada 
        System.out.println("Olá " + cliente + ", obrigado por criar uma conta em nosso banco, sua agência é " +
        numeroAgencia + ", conta " + numeroConta + " e seu saldo " + saldo + " já está disponível para saque");
    }
}
