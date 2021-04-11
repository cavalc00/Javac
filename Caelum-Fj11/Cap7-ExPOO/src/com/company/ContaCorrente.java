/*
    Classe conta corrente herda a classe conta, somente sobrescreve dois de seus métodos.

    Regras: - Conta corrente para fazer um deposito é necessario cobrar uma taxa de 10 centavos.
            - Para atualizar vai ser o dobro de uma conta normal (Utilizar super para chamar o método da classe herdada)

*/

package com.company;

public class ContaCorrente extends Conta {

    @Override
    public void atualiza(double taxa){
        super.atualiza(taxa*2);
    }
    @Override
    public void deposita(double valor){
        this.saldo += valor - 0.10;
    }
}
