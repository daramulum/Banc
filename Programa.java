import javax.swing.JOptionPane;

public class Programa {
    public static void main(String[] args) {
        // Cria duas contas do tipo ContaCorrente e ContaPoupanca
        ContaCorrente cc = new ContaCorrente(1234, 1000, 500);
        ContaPoupanca cp = new ContaPoupanca(4321, 2000, 1);

        // Cria uma variável para armazenar a opção do usuário
        int opcao;

        // Cria um laço while para exibir o menu até o usuário sair
        while (true) {
            // Exibe o menu com as opções usando JOptionPane
            opcao = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "Escolha uma opção:\n" +
                            "1 - Criar contas\n" +
                            "2 - Realizar depósitos\n" +
                            "3 - Realizar saques\n" +
                            "4 - Exibir saldos\n" +
                            "5 - Usar cheque especial\n" +
                            "6 - Calcular rendimento\n" +
                            "0 - Sair"));

            // Usa um switch para executar a opção escolhida
            switch (opcao) {
                case 1:
                    // Cria novas contas com os dados informados pelo usuário
                    int numeroConta = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o número da conta:"));
                    int saldo = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o saldo inicial da conta:"));
                    int tipoConta = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o tipo da conta:\n" +
                            "1 - Conta corrente\n" +
                            "2 - Conta poupança"));
                    if (tipoConta == 1) {
                        // Cria uma conta corrente
                        int chequeEspecial = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o limite do cheque especial:"));
                        cc = new ContaCorrente(numeroConta, saldo, chequeEspecial);
                        JOptionPane.showMessageDialog(null, "Conta corrente criada com sucesso.");
                    } else if (tipoConta == 2) {
                        // Cria uma conta poupança
                        double taxaRendimento = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a taxa de rendimento:"));
                        cp = new ContaPoupanca(numeroConta, saldo, taxaRendimento);
                        JOptionPane.showMessageDialog(null, "Conta poupança criada com sucesso.");
                    } else {
                        // Exibe uma mensagem de erro
                        JOptionPane.showMessageDialog(null, "Tipo de conta inválido.");
                    }
                    break;
                case 2:
                    // Realiza depósitos nas contas
                    int valorDeposito = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o valor do depósito:"));
                    int contaDeposito = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a conta para depósito:\n" +
                            "1 - Conta corrente\n" +
                            "2 - Conta poupança"));
                    if (contaDeposito == 1) {
                        // Deposita na conta corrente
                        cc.depositar(valorDeposito);
                    } else if (contaDeposito == 2) {
                        // Deposita na conta poupança
                        cp.depositar(valorDeposito);
                    } else {
                        // Exibe uma mensagem de erro
                        JOptionPane.showMessageDialog(null, "Conta inválida.");
                    }
                    break;
                case 3:
                    // Realiza saques nas contas
                    int valorSaque = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o valor do saque:"));
                    int contaSaque = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a conta para saque:\n" +
                            "1 - Conta corrente