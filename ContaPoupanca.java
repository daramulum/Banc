public class ContaPoupanca extends ContaBancaria {
    // Atributo
    private double taxaRendimento;

    // Construtor
    public ContaPoupanca(int numeroConta, int saldo, double taxaRendimento) {
        // Chama o construtor da superclasse
        super(numeroConta, saldo);
        this.taxaRendimento = taxaRendimento;
    }

    // Método
    public double calcularRendimento() {
        // Calcula o rendimento com base no saldo e na taxa
        double rendimento = this.ExibirSaldo() * this.taxaRendimento / 100;
        // Retorna o rendimento
        return rendimento;
    }
}
