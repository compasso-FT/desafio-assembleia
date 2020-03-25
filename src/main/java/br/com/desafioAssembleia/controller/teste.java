package br.com.desafioAssembleia.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping(value="/api")
@Api(value = "Desafio Assembleia", description = "Sistema de votação em uma assembleia")
public class teste {

    @ApiOperation(value = "Retorna Desafio Assembleia")
    @ApiResponses(
            value = {
                    @ApiResponse(code = 100, message = "100 is the message"),
                    @ApiResponse(code = 200, message = "Successful")
            }
    )
    @GetMapping
    public String desafio() {
        return "Desafio Assembleia";
    }

    @ApiOperation(value = "Salva Desafio Assembleia")
    @PostMapping("/post")
    public String desafioPost(@RequestBody final String desafio) {
        return desafio;
    }

    @ApiOperation(value = "Atualiza Desafio Assembleia")
    @PutMapping("/put")
    public String desafioPut(@RequestBody final String desafio) {
        return desafio;
    }
}
