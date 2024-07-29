import java.util.Scanner;

public class LigarOuDesligar extends Lampada{
    public static void main(String[] args) {
        Lampada lampada = new Lampada();
        Scanner scan = new Scanner(System.in);

        System.out.println("A lampada está " + verificarLampada());
        System.out.print("Deseja liga-lá?:");
        String resposta = scan.nextLine();
        lampada.setEstadoLampada(resposta);



    }
}
