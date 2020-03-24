package desafioAssembleia.com.br.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/desafio")
@Api(value = "Desafio Assembleia", description = "Sistema de votação em uma assembleia")
public class teste {

    @ApiOperation(value = "Desafio Assembleia")
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

    @ApiOperation(value = "Desafio Assembleia")
    @PostMapping("/post")
    public String desafioPost(@RequestBody final String desafio) {
        return desafio;
    }

    @ApiOperation(value = "Desafio Assembleia")
    @PutMapping("/put")
    public String desafioPut(@RequestBody final String desafio) {
        return desafio;
    }
}
