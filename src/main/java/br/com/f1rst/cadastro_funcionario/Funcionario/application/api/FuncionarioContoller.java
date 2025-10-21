package br.com.f1rst.cadastro_funcionario.Funcionario.application.api;

import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Log4j2
public class FuncionarioContoller implements FuncionarioAPI {

    @Override
    public FuncionarioResponse postFuncionario(FuncionarioRequest funcionarioRequest) {
        log.info("[start] FuncionarioContoller - postFuncionario");
        log.info("[finish] FuncionarioContoller - postFuncionario");
        return null;
    }
}
