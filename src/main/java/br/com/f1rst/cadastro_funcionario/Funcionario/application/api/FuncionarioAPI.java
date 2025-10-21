package br.com.f1rst.cadastro_funcionario.Funcionario.application.api;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/funcionario")
public interface FuncionarioAPI {
    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    FuncionarioResponse postFuncionario(
            @RequestBody FuncionarioRequest funcionarioRequest);
}
