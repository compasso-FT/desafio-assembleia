package br.com.desafioAssembleia.dto;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;

public class PautaDTO {

	private Long id;
	private String nomePauta;
	@NotNull(message = "informe a descrição da pauta")
	@Length(min = 10, max = 2000, message = "A descrição deve conter entre 10 e 2000 caracteres")
	private String descricao;

	private Long votacao;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNomePauta() {
		return nomePauta;
	}

	public void setNomePauta(String nomePauta) {
		this.nomePauta = nomePauta;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Long getVotacao() {
		return votacao;
	}

	public void setVotacao(Long votacao) {
		this.votacao = votacao;
	}
}
