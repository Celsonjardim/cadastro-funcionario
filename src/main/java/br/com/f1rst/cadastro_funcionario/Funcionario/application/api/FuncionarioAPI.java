package br.com.f1rst.cadastro_funcionario.Funcionario.application.api;

import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/v1/funcionario")
public interface FuncionarioAPI {
    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    FuncionarioResponse postFuncionario(@Valid @RequestBody FuncionarioRequest funcionarioRequest);

    @GetMapping
    @ResponseStatus(code = HttpStatus.OK)
    List<FuncionarioListResponse> getTodosFuncionarios();

    @GetMapping(value = "/{idFuncionario}")
    @ResponseStatus(code = HttpStatus.OK)
    FuncionarioDetalhadoResponse getFuncionariosAtravesId(@PathVariable UUID idFuncionario);
}
