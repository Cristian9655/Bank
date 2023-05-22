package br.com.fiap.equação;

public class App {

	public static void main(String[] args) {
		Conta conta1 = new Conta("João", 1000);
		Conta conta2 = new Conta("Marcos", 500);
		ContaPoupanca contaPoupanca = new ContaPoupanca("João", 1500);

		try {
			conta1.realizarDeposito(200);
			System.out.println("Depósito realizado com sucesso.\nSaldo da conta1: " + conta1.getSaldo());

			conta1.realizarSaque(300);
			System.out.println("Saque realizado com sucesso.\nSaldo da conta1: " + conta1.getSaldo());

			// ERRO ESPERADO
			contaPoupanca.realizarSaque(100);
			System.out.println("Saldo da conta poupança: " + contaPoupanca.getSaldo());
			// ERRO ESPERADO
			contaPoupanca.realizarDeposito(-500);
			System.out.println("Saldo da conta poupança: " + contaPoupanca.getSaldo());
			// ERRO ESPERADO
			conta1.realizarTransferencia(conta2, 400);
			System.out.println("Transferência realizada com sucesso. Saldo da conta 1: " + conta1.getSaldo());
			System.out.println("Saldo da conta 2: " + conta2.getSaldo());

		} catch (RuntimeException e) {
			System.err.println("Ocorreu um erro: " + e.getMessage());
		}

	}

}
