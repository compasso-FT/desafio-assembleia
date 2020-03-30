package br.com.desafioAssembleia.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.desafioAssembleia.entity.Associado;

public interface AssociadoRepository extends JpaRepository<Associado, Long> {

}
