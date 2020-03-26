package br.com.desafioAssembleia.dto;

import java.util.List;

import org.hibernate.validator.constraints.Length;

import com.fasterxml.jackson.annotation.JsonInclude;

import br.com.desafioAssembleia.entity.Assembleia;
import br.com.desafioAssembleia.entity.Pauta;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class AssociadoDTO {

	private Long id;
	@Length(min = 3, max = 50, message = "O nome deve conter entre 3 e 50 caracteres")
	private String nomeAssociado;
	private List<Assembleia> assembleias;
	private List<Pauta> pautas;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNomeAssociado() {
		return nomeAssociado;
	}

	public void setNomeAssociado(String nomeAssociado) {
		this.nomeAssociado = nomeAssociado;
	}

	public List<Assembleia> getAssembleias() {
		return assembleias;
	}

	public void setAssembleias(List<Assembleia> assembleias) {
		this.assembleias = assembleias;
	}

	public List<Pauta> getPautas() {
		return pautas;
	}

	public void setPautas(List<Pauta> pautas) {
		this.pautas = pautas;
	}
}
