package br.com.fiap.equação;

public class ContaPoupanca extends Conta {
	public ContaPoupanca(String titular, double saldo) {
		super(titular, saldo);
	}

	@Override
	public void realizarSaque(double valor) {
		throw new OperacaoInvalidaException("Não é possível realizar saques em conta poupança.");
	}
}
