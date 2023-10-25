import javax.swing.JOptionPane;

public class ContaBancaria {
    // Atributos
    private int numeroConta;
    private int saldo;

    // Construtor
    public ContaBancaria(int numeroConta, int saldo) {
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }

    // Métodos
    public void depositar(int valor) {
        // Adiciona o valor ao saldo
        this.saldo += valor;
        // Exibe uma mensagem de confirmação
        JOptionPane.showMessageDialog(null, "Depósito de R$ " + valor + " realizado com sucesso.");
    }

    public void sacar(int valor) {
        // Verifica se há saldo suficiente
        if (this.saldo >= valor) {
            // Subtrai o valor do saldo
            this.saldo -= valor;
            // Exibe uma mensagem de confirmação
            JOptionPane.showMessageDialog(null, "Saque de R$ " + valor + " realizado com sucesso.");
        } else {
            // Exibe uma mensagem de erro
            JOptionPane.showMessageDialog(null, "Saldo insuficiente para saque.");
        }
    }

    public void exibirSaldo() {
        // Exibe o saldo atual da conta
        JOptionPane.showMessageDialog(null, "O saldo da conta " + this.numeroConta + " é R$ " + this.saldo + ".");
    }
}
