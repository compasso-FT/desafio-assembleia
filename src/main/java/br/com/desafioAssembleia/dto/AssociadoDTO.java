package br.com.desafioAssembleia.dto;

import java.util.List;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.br.CPF;

import com.fasterxml.jackson.annotation.JsonInclude;

import br.com.desafioAssembleia.entity.Assembleia;
import br.com.desafioAssembleia.entity.Pauta;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class AssociadoDTO {

	private Long id;
	@NotNull
	@Length(min = 3, max = 50, message = "O nome deve conter entre 3 e 50 caracteres")
	private String nomeAssociado;
	@NotNull
	@CPF(message = "CPF inválido")
	private String cpf;
	@NotNull
	@Length(min = 6, message = "A senha deve conter no mínimo 6 caracteres")
	private String senha;
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

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
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
