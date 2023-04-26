package Entidades;

public class Pagamento {
    private double valor;
    private Date dataVencimento;
    private String beneficiario;
    private String tipoConta;
    private ArrayList<Date> historicoPagamentos;

    public Pagamento(double valor, Date dataVencimento, String beneficiario, String tipoConta) {
        this.valor = valor;
        this.dataVencimento = dataVencimento;
        this.beneficiario = beneficiario;
        this.tipoConta = tipoConta;
        this.historicoPagamentos = new ArrayList<Date>();
    }

    public void pagar() {
        // Lógica para realizar o pagamento da conta
        Date dataAtual = new Date();
        historicoPagamentos.add(dataAtual);
        System.out.println("Conta de " + tipoConta + " no valor de " + valor + " paga para " + beneficiario + " na data " + dataAtual);
    }

    public void cancelar() {
        // Lógica para cancelar o pagamento da conta
        System.out.println("Pagamento da conta de " + tipoConta + " no valor de " + valor + " para " + beneficiario + " cancelado.");
    }

    public void agendarPagamento(Date data) {
        // Lógica para agendar um pagamento recorrente
        System.out.println("Agendamento de pagamento da conta de " + tipoConta + " no valor de " + valor + " para " + beneficiario + " na data " + data);
    }

    // Getters e setters
    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Date getDataVencimento() {
        return dataVencimento;
    }

    public void setDataVencimento(Date dataVencimento) {
        this.dataVencimento = dataVencimento;
    }

    public String getBeneficiario() {
        return beneficiario;
    }

    public void setBeneficiario(String beneficiario) {
        this.beneficiario = beneficiario;
    }

    public String getTipoConta() {
        return tipoConta;
    }

    public void setTipoConta(String tipoConta) {
        this.tipoConta = tipoConta;
    }

    public ArrayList<Date> getHistoricoPagamentos() {
        return historicoPagamentos;
    }

    public void setHistoricoPagamentos(ArrayList<Date> historicoPagamentos) {
        this.historicoPagamentos = historicoPagamentos;
    }
}

