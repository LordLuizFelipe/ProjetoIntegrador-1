package Entidades;

public class Transferencia {
    private double valorTransferido;
    private ContaCorrente contaOrigem;
    private ContaCorrente contaDestino;


    public Transferencia(double valorTransferido, ContaCorrente contaOrigem, ContaCorrente contaDestino) {
        this.valorTransferido = valorTransferido;
        this.contaOrigem = contaOrigem;
        this.contaDestino = contaDestino;

    }

    public void transferenciaEntreContas() {
        if (contaOrigem.getSaldo() >= valorTransferido) {
            contaOrigem.sacar(valorTransferido);
            contaDestino.depositar(valorTransferido);
            String transferencia = "Transferência de " + valorTransferido + " da conta " + contaOrigem.getNumeroConta() + " para a conta " + contaDestino.getNumeroConta();
            System.out.println(transferencia + " realizada com sucesso!");
        } else {
            System.out.println("Saldo insuficiente para realizar a transferência.");
        }
    }
}

