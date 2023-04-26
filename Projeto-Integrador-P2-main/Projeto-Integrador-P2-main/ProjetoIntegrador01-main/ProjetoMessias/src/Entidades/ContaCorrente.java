package Entidades;

import java.util.ArrayList;

public class ContaCorrente {
    private int numeroConta;
    private String nomeTitular;
    private double saldo;
    private double limiteChequeEspecial;
    private List<String> extratoBancario;

    public ContaCorrente(int numeroConta, String nomeTitular, double saldo, double limiteChequeEspecial) {
        this.numeroConta = numeroConta;
        this.nomeTitular = nomeTitular;
        this.saldo = saldo;
        this.limiteChequeEspecial = limiteChequeEspecial;
        this.extratoBancario = new ArrayList<>();
    }

    public void transferencia(double valor, ContaCorrente contaDestino) {
        if (valor <= 0) {
            System.out.println("Valor inválido para transferência.");
            return;
        }

        if (valor > saldo + limiteChequeEspecial) {
            System.out.println("Saldo insuficiente para realizar a transferência.");
            return;
        }

        saldo -= valor;
        contaDestino.deposito(valor);
    }

    public void deposito(double valor) {
        if (valor <= 0) {
            System.out.println("Valor inválido para depósito.");
            return;
        }

        saldo += valor;

    }

    public void saque(double valor) {
        if (valor <= 0) {
            System.out.println("Valor inválido para saque.");
            return;
        }

        if (valor > saldo + limiteChequeEspecial) {
            System.out.println("Saldo insuficiente para realizar o saque.");
            return;
        }

        saldo -= valor;
    }

    public void consultaSaldo() {
        System.out.printf("Saldo atual: R$%.2f%n", saldo);
    }

    public int getNumeroConta() {
        return numeroConta;
    }
}

