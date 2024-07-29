public class ContaCorrent {
    int NumeroConta;
    double SaldoConta;
    double LimiteConta;
    boolean Especial;

    void saqueConta(int pedidoDeSaque) {
        if (SaldoConta > pedidoDeSaque) {

            System.out.println("Você sacou R$" + pedidoDeSaque);
            SaldoConta -= pedidoDeSaque;
            System.out.println("Saldo restante R$" + SaldoConta);
        } else {
            System.out.println("Saldo insuficiente!");
        };
    };

    void depositarDinheiro(double pedidoDeDeposito) {
        System.out.println("Saldo anterior: R$" + SaldoConta);
        SaldoConta += pedidoDeDeposito;
        System.out.println("Saldo atual: R$" + SaldoConta);
    };

    void VerificarSaldo() {
        System.out.println("Saldo atual de: R$" + SaldoConta);
    };

    void UsandoChequeEspecial() {
        if (Especial == true) {
            System.out.println("Cliente da conta " +NumeroConta+ " está usando cheque especial!");
        } else {
            System.out.println("Cliente da conta " +NumeroConta+ " não está usando cheque especial!");

        };
    };
}
