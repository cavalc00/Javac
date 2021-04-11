package com.company;

public class Main {

    public static void main(String[] args) {
        Banco bank = new Banco(10);
        AtualizadorDeContas adc = new AtualizadorDeContas(0.02);
        Conta c1 = new Conta();
        Conta c2 = new Conta();
        ContaCorrente cc1 = new ContaCorrente();
        ContaCorrente cc2 = new ContaCorrente();
        ContaPoupanca cp1 = new ContaPoupanca();
        ContaPoupanca cp2 = new ContaPoupanca();

        bank.adicionaConta(c1);
        bank.adicionaConta(cc1);
        bank.adicionaConta(cp1);
        bank.adicionaConta(c2);
        bank.adicionaConta(cc2);
        bank.adicionaConta(cp2);

        c1.deposita(2500);
        c2.deposita(45200);
        cc1.deposita(2500);
        cc2.deposita(45200);
        cp1.deposita(2500);
        cp2.deposita(45200);

        for(int i = 0; i<bank.pegaTotalDeContas(); i++){  //Usa a classe atualizador de contas de forma mais automatica
            adc.roda(bank.pegaConta(i));
        }
    }
}
