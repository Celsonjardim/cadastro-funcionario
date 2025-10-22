package br.com.f1rst.cadastro_funcionario.Funcionario.application.service;

import br.com.f1rst.cadastro_funcionario.Funcionario.application.api.FuncionarioRequest;
import br.com.f1rst.cadastro_funcionario.Funcionario.application.api.FuncionarioResponse;
import br.com.f1rst.cadastro_funcionario.Funcionario.domain.Funcionario;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

@Service
@Log4j2
public class FuncionarioApplicationService implements FuncionarioService {
    @Override
    public FuncionarioResponse criaFuncionario(FuncionarioRequest funcionarioRequest) {
        log.info("[start] FuncionarioApplicationService - criaFuncionario");
        Funcionario funcionario = funcionarioRepository.salva(new Funcionario(funcionarioRequest));
        log.info("[finish] FuncionarioApplicationService - criaFuncionario");
        return null;
    }
}
