public class ContaCorrente extends ContaBancaria {
    // Atributo
    private int chequeEspecial;

    // Construtor
    public ContaCorrente(int numeroConta, int saldo, int chequeEspecial) {
        // Chama o construtor da superclasse
        super(numeroConta, saldo);
        this.chequeEspecial = chequeEspecial;
    }

    // Método
    public boolean usarChequeEspecial(int valor) {
        // Verifica se o valor é menor ou igual ao cheque especial
        if (valor <= this.chequeEspecial) {
            // Retorna true
            return true;
        } else {
            // Retorna false
            return false;
        }
    }
}
