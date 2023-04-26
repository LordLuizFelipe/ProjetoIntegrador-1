package Entidades;

public class Emprestimo {
    private double valorEmprestimo;
    private int prazoPagamento;
    private double taxaJuros;


    public Emprestimo(double valorEmprestimo, int prazoPagamento, double taxaJuros) {
        this.valorEmprestimo = valorEmprestimo;
        this.prazoPagamento = prazoPagamento;
        this.taxaJuros = taxaJuros;
    }

    public double getValorEmprestimo() {
        return valorEmprestimo;
    }

    public void setValorEmprestimo(double valorEmprestimo) {
        this.valorEmprestimo = valorEmprestimo;
    }

    public int getPrazoPagamento() {
        return prazoPagamento;
    }

    public void setPrazoPagamento(int prazoPagamento) {
        this.prazoPagamento = prazoPagamento;
    }

    public double getTaxaJuros() {
        return taxaJuros;
    }

    public void setTaxaJuros(double taxaJuros) {
        this.taxaJuros = taxaJuros;
    }


    public double calcularValorTotalEmprestimo() {
        double valorTotalEmprestimo = this.valorEmprestimo + (this.valorEmprestimo * this.taxaJuros);
        return valorTotalEmprestimo;
    }

    public double calcularValorParcelas() {
        double valorTotalEmprestimo = calcularValorTotalEmprestimo();
        double valorParcelas = valorTotalEmprestimo / this.prazoPagamento;
        return valorParcelas;
    }

    public void simularEmprestimo() {
        double valorTotalEmprestimo = calcularValorTotalEmprestimo();
        double valorParcelas = calcularValorParcelas();

        System.out.println("Valor total do empréstimo: R$" + valorTotalEmprestimo);
        System.out.println("Valor das parcelas: R$" + valorParcelas);
    }

    public void solicitarEmprestimo() {
        System.out.println("Solicitação de empréstimo realizada com sucesso.");
        String historico = "Empréstimo solicitado no valor de R$" + this.valorEmprestimo;
    }
}

