package com.company;

public class Estoque {

    //Informações do Produto (peças)
    //Atributos
    public String nome;
    public long codigo;
    public int quantidade;
    public double preco;

    //Metódos
    public int retirada(int valor){
        if(valor <= quantidade){
            quantidade -= valor;
            return 1;
        }
        return 0;
    }

    public void entrada(int valor){
        quantidade += valor;
    }

    public void imprimir(){
        System.out.println("~~ Dados do Produto ~~");
        System.out.println("Codigo: " + codigo);
        System.out.println("Nome: " + nome);
        System.out.println("Quantidade: " + quantidade);
        System.out.println("Preço: R$" + preco);
        System.out.println("---------------------------------");
    }

}
