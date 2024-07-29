package com.Objetos;

import java.util.Scanner;

public class Papelaria {

    String Produto;
    String getProduto() {
        return Produto;
    };

    void setProduto(String produto) {
        Produto = produto;
    };

    String Marca;
    String getMarca() {
        return Marca;
    };

     void setMarca(String marca) {
        Marca = marca;
    };

    String MetodoDePagamento;
    String getMetodoDePagamento() {
        return MetodoDePagamento;
    };

    void setMetodoDePagamento(String metodoDePagamento) {
        MetodoDePagamento = metodoDePagamento;
    };

    double Preco;
    double getPreco() {
        return Preco;
    };

    void setPreco(double preco) {
        Preco = preco;
    };

    int Qtde;
    int getQtde() {
        return Qtde;
    };

    void setQtde(int qtde) {
        Qtde = qtde;
    };


    static void CadastroProduto(CadProdutos nomeProduto) {



        Object[][] matriz = new Object[4][4];

            for (int i = 0; i < matriz.length; i++) {
                Scanner scan = new Scanner(System.in);
                for (int j = 0; j < matriz.length; j++) {
                    if (j == 0) {
                        System.out.println("Digite o nome do produto: " + i + " a cadastrar: ");

                        nomeProduto.setProduto(scan.nextLine());
                        matriz[i][j] = nomeProduto.Produto;

                    } else if (j == 1) {
                        System.out.println("Qual a marca do produto?: ");

                        nomeProduto.setMarca(scan.nextLine());
                        matriz[i][j] = nomeProduto.Marca;


                    } else if (j == 2) {
                        System.out.println("Qtde de produtos que será cadastrada: ");

                        nomeProduto.setQtde(scan.nextInt());
                        matriz[i][j] = nomeProduto.Qtde;


                    } else {
                        System.out.println("Preço do produto: ");

                        nomeProduto.setPreco(scan.nextDouble());
                        matriz[i][j] = nomeProduto.Preco;
                    };


                };
            };




    };

};
