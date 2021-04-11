/*
*       A Classe Banco é responsável por ter um array de contas, e guardar o total de contas que existem nesse array.
*       Em seu construtor foi criado um array de contas do tamanho determinado por quem criar este banco.
*
*       Regras: - Poder adicionar e pegar as contas no array
*               - Um metodo para ver quantas contas foram adicionadas ao banco
*
*
* */

package com.company;

public class Banco {
    private Conta[] contas; //Isto é um composição.(Pesquisa)
    private int proximoindice = 0;
    private int totaldecontas = 0;

    public Banco(int x){
        this.contas = new Conta[x];
    }

    public void adicionaConta(Conta c){
        if(this.proximoindice < contas.length){ //Tomar cuidado para não estourar a capacidade do array
            this.contas[proximoindice] = c;
            this.proximoindice++;
            this.totaldecontas++;
        } else System.out.println("Array de contas cheio");
    }

    public Conta pegaConta(int x){
        return this.contas[x];
    }

    public int pegaTotalDeContas(){
        return this.totaldecontas;
    }
}
