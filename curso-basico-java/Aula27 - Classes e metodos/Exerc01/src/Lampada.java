public class Lampada {
    static boolean ligadaOuDesligada;
    static String estadoLampada;

    boolean getEstadoLampada() {
        return ligadaOuDesligada;

    };

    void setEstadoLampada(String resposta) {
        if (resposta.equalsIgnoreCase("sim")) {
            ligadaOuDesligada = true;
            System.out.println("Você ligou a Lampada");
        } else {
            ligadaOuDesligada = false;
            System.out.println("A Lampada continua desligada");
        };
    };

    static String verificarLampada() {
        if (ligadaOuDesligada == true) {
            estadoLampada = "Ligada";
        } else {
            estadoLampada = "Desligada";
        }
        return estadoLampada;
    };

}
