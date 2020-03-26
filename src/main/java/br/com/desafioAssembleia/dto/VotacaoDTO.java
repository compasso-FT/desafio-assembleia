package br.com.desafioAssembleia.dto;

public class VotacaoDTO {

	private Long id;
	private String detalheVotacao;
	private String resultado;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDetalheVotacao() {
		return detalheVotacao;
	}

	public void setDetalheVotacao(String detalheVotacao) {
		this.detalheVotacao = detalheVotacao;
	}

	public String getResultado() {
		return resultado;
	}

	public void setResultado(String resultado) {
		this.resultado = resultado;
	}
}
