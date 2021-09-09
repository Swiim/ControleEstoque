package com.company;

import java.util.Scanner;

public class Main {

    Estoque EstoquePecas = new Estoque();

    public static void main(String[] args) {

        Main gerenciarEstoque = new Main();
        Scanner input = new Scanner(System.in);
        int opcao=0;

        do{
            System.out.println("~~ MENU PRINCIPAL ~~");
            System.out.println("1.. Cadastrar");
            System.out.println("2.. Consultar");
            System.out.println("3.. Entrada - Estoque");
            System.out.println("4.. Saida - Estoque");
            System.out.println("9.. Encerrar");
            System.out.println("Escolha sua opção: ");
            opcao = Integer.parseInt(input.nextLine());

            switch (opcao){
                case 1:
                    gerenciarEstoque.execCadastrar();
                    break;

                case 2:
                    gerenciarEstoque.execConsultar();
                    break;

                case 3:
                    gerenciarEstoque.entrarProduto();
                    break;

                case 4:
                    gerenciarEstoque.sairProduto();
                    break;

                case 9:
                    System.out.println("PROGRAMA ENCERRADO!");
                    break;

                default:
                    System.out.println("Opção invalida.");

            }

        }while(opcao!=9);

    }

    public void execCadastrar(){
        Scanner input = new Scanner(System.in);
        System.out.println("~~ Cadastrando produto ~~");
        System.out.println("Codigo do Produto: ");
        EstoquePecas.codigo = Integer.parseInt(input.nextLine());

        System.out.println("Nome do Produto: ");
        EstoquePecas.nome = input.nextLine();

        System.out.println("Digite o Preço do Produto: ");
        EstoquePecas.preco = Double.parseDouble(input.nextLine());
    }

    public void execConsultar(){
        EstoquePecas.imprimir();
    }

    public void entrarProduto(){
        Scanner input = new Scanner(System.in);
        System.out.println("Adicionando produto ao estoque!");
        System.out.println("Digite quantos produtos estão entrando: ");
        Integer entradaProduto = Integer.parseInt(input.nextLine());
        EstoquePecas.entrada(entradaProduto);
        System.out.println("Novos itens adicionados ao estoque!");

    }

    public void sairProduto(){
        Scanner input = new Scanner(System.in);
        System.out.println("Retirando produto ao estoque!");
        System.out.println("Digite quantos produtos estão saindo: ");
        Integer saidaProduto = Integer.parseInt(input.nextLine());
        if (EstoquePecas.retirada(saidaProduto)==1){
            System.out.println("Produto retirado efetuado com sucesso!");
        }
        else {
            System.out.println("Estoque insuficiente para retirada!");
        }

    }
}
