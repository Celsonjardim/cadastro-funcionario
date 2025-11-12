package br.com.f1rst.cadastro_funcionario.Funcionario.application.api;

import br.com.f1rst.cadastro_funcionario.Funcionario.application.service.FuncionarioService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

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

    @Override
    public List<FuncionarioListResponse> getTodosFuncionarios() {
        log.info("[start] FuncionarioContoller - getTodosFuncionarios");
        List<FuncionarioListResponse> Funcionarios = funcionarioService.buscaTodosFuncionarios();
        log.info("[finish] FuncionarioContoller - getTodosFuncionarios");
        return Funcionarios;
    }

    @Override
    public FuncionarioDetalhadoResponse getFuncionariosAtravesId(UUID idFuncionario) {
        log.info("[start] FuncionarioContoller - getFuncionariosAtravesId");
        log.info("[idFuncionario] {}", idFuncionario);
        FuncionarioDetalhadoResponse funcionarioDetalhado = funcionarioService.buscaFuncionarioAtravesId(idFuncionario);
        log.info("[finish] FuncionarioContoller - getFuncionariosAtravesId");
        return funcionarioDetalhado;
    }

    @Override
    public void deletaFuncionariosAtravesId(UUID idFuncionario) {
        log.info("[start] FuncionarioContoller - deletaFuncionariosAtravesId");
        log.info("[idFuncionario] {}", idFuncionario);
        funcionarioService.deletaFuncionarioAtravesId(idFuncionario);
        log.info("[finish] FuncionarioContoller - deletaFuncionariosAtravesId");
    }

    @Override
    public void petchAlteraFuncionario(UUID idFuncionario, @Valid FuncionarioAlteracaoRequest funcionarioAlteracaoRequest) {
        log.info("[start] FuncionarioContoller - petchAlteraFuncionario");
        log.info("[idFuncionario] {}", idFuncionario);
        funcionarioService.petchAlteraFuncionario(idFuncionario, funcionarioAlteracaoRequest);
        log.info("[finish] FuncionarioContoller - petchAlteraFuncionario");

    }
}
