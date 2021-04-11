/*
    A classe atualizador de contas serve para aplicar uma taxa especifica em alguma conta e pode retornar a soma de todas as contas
    que passaram pelo seu método de atualização.

    Regras: - Precisa ter um construtor especificando a taxa informada.
            - Precisa ter um método que recebe qualquer tipo de conta e a atualiza seu saldo conforme a taxa especificada e
            mostrar seu saldo antes e depois da atualização.
*/

package com.company;

public class AtualizadorDeContas {
    private double saldoTotal;
    private double selic;

    public AtualizadorDeContas(double selic){
        this.selic = selic;
    }

    public void roda(Conta c){ //Aqui se aplica o conceito de polimorfismo, posso referenciar uma conta corrente por um conta normal, pois a conta corrente é herdeira de uma conta.
        System.out.println("========================================================");
        System.out.println("Saldo anterior da conta: " +c.getSaldo());
        c.atualiza(selic);
        System.out.println("Saldo após aplicação de taxa selic: " +c.getSaldo());
        System.out.println("========================================================\n");
        this.saldoTotal += c.getSaldo() + (c.getSaldo()*selic);
    }

    public double getSaldoTotal(){
        return this.saldoTotal;
    }

}
