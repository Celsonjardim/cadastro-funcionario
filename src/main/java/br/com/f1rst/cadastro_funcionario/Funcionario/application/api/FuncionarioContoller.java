package br.com.f1rst.cadastro_funcionario.Funcionario.application.api;

import br.com.f1rst.cadastro_funcionario.Funcionario.application.service.FuncionarioService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Log4j2
@RequiredArgsConstructor
public class FuncionarioContoller implements FuncionarioAPI {
    private final FuncionarioService funcionarioService;

    @Override
    public FuncionarioResponse postFuncionario(FuncionarioRequest funcionarioRequest) {
        log.info("[start] FuncionarioContoller - postFuncionario");
        FuncionarioResponse funcionarioCriado = funcionarioService.criaFuncionario(funcionarioRequest);
        log.info("[finish] FuncionarioContoller - postFuncionario");
        return funcionarioCriado;
    }
}
