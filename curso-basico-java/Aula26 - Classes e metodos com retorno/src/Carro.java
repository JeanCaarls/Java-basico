public class Carro {

    String marca;
    String modelo;
    int ano;
    int numPassageiros;
    double capDeCombustivel;
    double consumoDeCombustivel;

    double autonomiaDoAutomovel() {
        System.out.println("Metodo autonomiaDoAutomovel chamado!");
        return capDeCombustivel * consumoDeCombustivel;
    };
}
