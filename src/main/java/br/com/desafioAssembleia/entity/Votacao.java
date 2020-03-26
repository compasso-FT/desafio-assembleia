package br.com.desafioAssembleia.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.DynamicUpdate;

import br.com.desafioAssembleia.enums.Resultado;

@Entity
@Table(name = "votacao")
@DynamicUpdate
public class Votacao {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", updatable = false, nullable = false)
	private Long id;
	private String detalheVotacao;
	@Enumerated(EnumType.STRING)
	private Resultado resultado;

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
	public Resultado getResultado() {
		return resultado;
	}
	public void setResultado(Resultado resultado) {
		this.resultado = resultado;
	}
}
