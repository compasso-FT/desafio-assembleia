package br.com.desafioAssembleia.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.desafioAssembleia.dto.AssociadoDTO;
import br.com.desafioAssembleia.entity.Associado;
import br.com.desafioAssembleia.response.Response;
import br.com.desafioAssembleia.service.AssociadoService;
import br.com.desafioAssembleia.util.Bcrypt;

@RestController
@RequestMapping("/")
public class AssociadoController {

	@Autowired
	private AssociadoService associadoService;
	
	@PostMapping
	public ResponseEntity<Response<AssociadoDTO>> create(@Valid @RequestBody AssociadoDTO dto, BindingResult result) {
		
		Response<AssociadoDTO> response = new Response<AssociadoDTO>();
		
		if(result.hasErrors()) {
			result.getAllErrors().forEach(e -> response.getErrors().add(e.getDefaultMessage()));
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(response);
		}
		
		Associado associado = associadoService.save(this.convertDtoToEntity(dto));
		
		response.setData(this.convertEntityToDto(associado));
		
		return ResponseEntity.status(HttpStatus.CREATED).body(response);
	}
	
	public Associado convertDtoToEntity(AssociadoDTO dto) {
		
		Associado associado = new Associado();
		associado.setId(dto.getId());
		associado.setNomeAssociado(dto.getNomeAssociado());
		associado.setCpf(dto.getCpf());
		associado.setSenha(Bcrypt.getHash(dto.getSenha()));
		
		return associado;
	}
	
	public AssociadoDTO convertEntityToDto(Associado associado) {
		
		AssociadoDTO dto = new AssociadoDTO();
		dto.setId(associado.getId());
		dto.setNomeAssociado(associado.getNomeAssociado());
		dto.setCpf(associado.getCpf());
		
		return dto;
	}
}
