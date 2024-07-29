import java.util.Scanner;

public class UsuarioConta {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        ContaCorrent conta = new ContaCorrent();
        conta.SaldoConta = 10;
        conta.LimiteConta = 10000;
        conta.NumeroConta = 1234;


        System.out.print("Informe o valor do saque: ");
        int ValorDoSaque = scan.nextInt();
        conta.saqueConta(ValorDoSaque);

        scan.nextLine();
        if(conta.SaldoConta < ValorDoSaque) {
            System.out.println("Deseja usar cheque especial?");
            String respostaUsarCheque = scan.nextLine();
            if (respostaUsarCheque.contains("s")) {
                conta.Especial = true;
                conta.UsandoChequeEspecial();
            };
        };


        System.out.print("Deseja verificar o saldo?: ");
        String respostaVerificarSaldo = scan.nextLine();
        if (respostaVerificarSaldo.contains("s")) {
            conta.VerificarSaldo();
        };


        System.out.println("Deseja fazer deposito?: ");
        String resposta1 = scan.nextLine();
        if (resposta1.contains("s")) {
            System.out.println("Quanto deseja depositar?");
            double resposta2 = scan.nextDouble();
            conta.depositarDinheiro(resposta2);
        };


    }
}
