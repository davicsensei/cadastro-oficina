package com.oficina;
import com.oficina.veiculos.Carro;
import com.oficina.veiculos.Motocicleta;
import com.oficina.veiculos.Veiculo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Cadastro de Veículos ===");
        System.out.println("Digite o tipo do veículo, 1 para carro e 2 para motocicleta.");
        int opcao = sc.nextInt();
        sc.nextLine();

        System.out.println("Digite a marca do veículo: ");
        String marca = sc.nextLine();

        System.out.println("Digite o modelo do veículo: ");
        String modelo = sc.nextLine();

        System.out.println("Digite o ano do veículo: ");
        int ano = sc.nextInt();

        if (opcao == 1) {
            System.out.print("Quantidade de portas: ");
            int portas = sc.nextInt();

            Carro carro = new Carro(marca, modelo, ano, portas);
            System.out.println(carro.exibirDetalhes());

        } else if (opcao == 2) {
            System.out.print("Cilindradas: ");
            int cilindradas = sc.nextInt();

            Motocicleta moto = new Motocicleta(marca, modelo, ano, cilindradas);
            System.out.println(moto.exibirDetalhes());
        } else {
            System.out.println("Opção inválida!");
        }
        sc.close();
    }
}
