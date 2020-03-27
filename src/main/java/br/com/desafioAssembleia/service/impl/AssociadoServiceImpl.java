package br.com.desafioAssembleia.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.desafioAssembleia.entity.Associado;
import br.com.desafioAssembleia.repository.AssociadoRepository;
import br.com.desafioAssembleia.service.AssociadoService;

@Service
public class AssociadoServiceImpl implements AssociadoService {

	@Autowired
	AssociadoRepository associadoRepository;
	
	@Override
	public Associado save(Associado associado) {
		return associadoRepository.save(associado);
	}

	
}
