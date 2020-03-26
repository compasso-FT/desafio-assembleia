package br.com.desafioAssembleia.entity;

import java.time.LocalDateTime;
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
import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "assembleia")
@DynamicUpdate
public class Assembleia {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", updatable = false, nullable = false)
	private Long id;
	@NotBlank
	@Column(nullable = false)
	private String nomeAssembleia;
	@NotBlank
	@Column(nullable = false, unique = true)
	private String local;
	@Column(name = "data", columnDefinition = "TIMESTAMP", unique = true)
	@DateTimeFormat(iso = DateTimeFormat.ISO.TIME, pattern = "yyyy-MM-dd hh:mm")
	private LocalDateTime data;
	@OneToMany(fetch = FetchType.LAZY)
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
