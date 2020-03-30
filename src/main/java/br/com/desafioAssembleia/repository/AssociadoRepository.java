package br.com.desafioAssembleia.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.desafioAssembleia.entity.Associado;

@Repository
public interface AssociadoRepository extends JpaRepository<Associado, Long> {

}
