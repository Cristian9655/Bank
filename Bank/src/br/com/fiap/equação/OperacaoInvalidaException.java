package br.com.fiap.equação;

public class OperacaoInvalidaException extends RuntimeException {
	public OperacaoInvalidaException(String mensagem) {
		super(mensagem);
	}
}
