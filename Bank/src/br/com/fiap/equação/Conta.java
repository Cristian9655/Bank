package br.com.fiap.equação;

public class Conta {
	private String titular;
	private double saldo;

	public Conta(String titular, double saldo) {
		super();
		this.titular = titular;
		this.saldo = saldo;
	}

	public String getTitular() {
		return titular;
	}
	public void setTitular(String titular) {
		this.titular = titular;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public void realizarDeposito(double valor) {
		if (valor < 0) {
			throw new ValorInvalidoException("Não é permitido realizar depósitos com valores negativos.");
		}
		setSaldo(getSaldo() + valor); 
	}

	public void realizarSaque(double valor) {
		if (this instanceof ContaPoupanca) {
			throw new OperacaoInvalidaException("Não é possível realizar saques em conta poupança.");
		}
		if (valor > getSaldo()) {
			throw new SaldoInsuficienteException("Saldo insuficiente para realizar o saque.");
		}
		setSaldo(getSaldo() - valor); 
	}

	public void realizarTransferencia(Conta destino, double valor) {
		if (!titular.equals(destino.titular)) {
			throw new TransferenciaInvalidaException("Não é permitido realizar transferências para contas com titularidades diferentes.");
		}
		if (valor < 0) {
			throw new ValorInvalidoException("Não é permitido realizar transferências com valores negativos.");
		}
		if (valor > getSaldo()) {
			throw new SaldoInsuficienteException("Saldo insuficiente para realizar a transferência.");
		}
		
		setSaldo(getSaldo() - valor); 
		destino.saldo += valor;
	}

}
