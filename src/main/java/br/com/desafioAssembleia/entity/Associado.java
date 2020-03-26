package br.com.desafioAssembleia.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

import org.hibernate.annotations.DynamicUpdate;

@Entity
@Table(name = "associado")
@DynamicUpdate
public class Associado {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", updatable = false, nullable = false)
	private Long id;
	@NotBlank
	@Column(nullable = false)
	private String nomeAssociado;
	@NotBlank
	@Column(nullable = false, unique = true)
	private String cpf;
	@NotBlank
	@Column(nullable = false)
	private String senha;

	@OneToMany(fetch = FetchType.LAZY)
	private List<Assembleia> assembleias;
	
	@OneToMany(fetch = FetchType.LAZY)
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
