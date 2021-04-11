/*
    Classe conta poupança herda a classe conta, somente sobrescreve um de seus métodos.

    Regras: - Conta poupança triplica a taxa de uma conta comum (Utilizar super para chamar o método da classe herdada).

*/

package com.company;

public class ContaPoupanca extends Conta{

    @Override
    public void atualiza(double taxa){
        super.atualiza(taxa*3);
    }
}
