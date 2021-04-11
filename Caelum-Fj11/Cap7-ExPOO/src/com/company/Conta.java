/* Classe conta responsável pelo atributo de saldo e métodos simples de uma conta qualquer.

   Regras: - Não pode depositar valores negativos.
           - Para sacar é necessario ter dinheiro na conta;
*/

package com.company;

public class Conta {
        protected double saldo = 0;

        public void deposita(double valor){
            if (valor > 0) {
                this.saldo += valor;
            } else System.out.println("Insira um valor válido");
        }

        public void saca(double valor){
            if (valor <= this.saldo){
                this.saldo -= valor;
            } else System.out.println("Saldo insuficiente!");
        }

        public void atualiza(double taxa){
            this.saldo += this.saldo * taxa;
        }

        public double getSaldo(){
            return this.saldo;
        }
}
