package Entidades;

import java.util.ArrayList;

public class CartaoCredito {
    private double limiteCredito;
    private double saldoDisponivel;


    public CartaoCredito(double limiteCredito, double saldoDisponivel) {
        this.limiteCredito = limiteCredito;
        this.saldoDisponivel = saldoDisponivel;
    }

    public double getLimiteCredito() {
        return limiteCredito;
    }

    public void setLimiteCredito(double limiteCredito) {
        this.limiteCredito = limiteCredito;
    }

    public double getSaldoDisponivel() {
        return saldoDisponivel;
    }

    public void setSaldoDisponivel(double saldoDisponivel) {
        this.saldoDisponivel = saldoDisponivel;
    }


    public void consultaFatura() {
        //método para consultar a fatura do cartão de crédito
    }

    public void realizarPagamento(double valor) {
        //método para realizar o pagamento da fatura do cartão de crédito
    }

}

public class Compra {
    private double valor;
    private String data;


    public Compra(double valor, String data) {
        this.valor = valor;
        this.data = data;

    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

}

