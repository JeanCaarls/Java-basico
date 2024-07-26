package com.Objetos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Caneta extends Papelaria {
    static Caneta caneta = new Caneta();
    static Scanner scan = new Scanner(System.in);
    static Object[][] matriz = new Object[4][4];


    public static void main(String[] args) {


        for (int i = 0; i < matriz.length; i++) {

            for (int j = 0; j < matriz.length; j++) {
                if (j == 0) {
                    System.out.println("Digite o nome do produto a cadastrar: ");
                    caneta.setProduto(scan.nextLine());
                    String produto = caneta.Produto;
                    matriz[i][j] = produto;

                } else if (j == 1) {
                    System.out.println("Qual a marca do produto?: ");
                    caneta.setMarca(scan.nextLine());
                    String marca = caneta.Marca;
                    matriz[i][j] = marca;


                } else if (j == 2) {
                    System.out.println("Qtde de produtos que será cadastrada: ");
                    caneta.setQtde(scan.nextInt());
                    int qtde = caneta.Qtde;
                    matriz[i][j] = qtde;


                } else {
                    System.out.println("Preço do produto: ");
                    caneta.setPreco(scan.nextDouble());
                    double preco = caneta.Preco;
                    matriz[i][j] = preco;
                };

                System.out.println("Valor Guardado na posição " + i + " " + j + ": " + matriz[i][j]);
            };
        };



    }

}
