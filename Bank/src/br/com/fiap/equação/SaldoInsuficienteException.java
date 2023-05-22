package br.com.fiap.equação;

public class SaldoInsuficienteException extends RuntimeException {
	public SaldoInsuficienteException(String mensagem) {
		super(mensagem);
	}
}
