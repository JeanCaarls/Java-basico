public class Exerc01 {
    public static void main(String[] args) {
        Carro carro = new Carro();
        carro.marca = "Fiat";
        carro.modelo = "Ducato";
        carro.numPassageiros = 10;
        carro.capDeCombustivel = 100;
        carro.consumoDeCombustivel = 0.2;
        carro.ano = 2010;

        System.out.println(carro.autonomiaDoAutomovel());

    }

}
