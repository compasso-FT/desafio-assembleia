package br.com.desafioAssembleia.dto;

import java.time.LocalDateTime;
import java.util.List;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;

import com.fasterxml.jackson.annotation.JsonFormat;

public class AssembleiaDTO {

	private Long id;
	private String nomeAssembleia;
	@NotNull(message = "informe um local")
	@Length(min = 2, max = 50, message = "O local deve conter entre 2 e 50 caracteres")
	private String local;
	@NotNull(message = "informe uma data")
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd hh:mm", locale = "pt-BR", timezone = "Brazil/East")
	private LocalDateTime data;

	private List<Pauta> pautas;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNomeAssembleia() {
		return nomeAssembleia;
	}

	public void setNomeAssembleia(String nomeAssembleia) {
		this.nomeAssembleia = nomeAssembleia;
	}

	public String getLocal() {
		return local;
	}

	public void setLocal(String local) {
		this.local = local;
	}

	public LocalDateTime getData() {
		return data;
	}

	public void setData(LocalDateTime data) {
		this.data = data;
	}

	public List<Pauta> getPautas() {
		return pautas;
	}

	public void setPautas(List<Pauta> pautas) {
		this.pautas = pautas;
	}
}
