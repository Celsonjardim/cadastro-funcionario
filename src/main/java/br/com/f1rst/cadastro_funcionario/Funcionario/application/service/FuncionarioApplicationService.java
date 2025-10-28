package br.com.f1rst.cadastro_funcionario.Funcionario.application.service;

import br.com.f1rst.cadastro_funcionario.Funcionario.application.api.FuncionarioDetalhadoResponse;
import br.com.f1rst.cadastro_funcionario.Funcionario.application.api.FuncionarioListResponse;
import br.com.f1rst.cadastro_funcionario.Funcionario.application.api.FuncionarioRequest;
import br.com.f1rst.cadastro_funcionario.Funcionario.application.api.FuncionarioResponse;
import br.com.f1rst.cadastro_funcionario.Funcionario.application.repository.FuncionarioRepository;
import br.com.f1rst.cadastro_funcionario.Funcionario.domain.Funcionario;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@Log4j2
@RequiredArgsConstructor
public class FuncionarioApplicationService implements FuncionarioService {
    private final FuncionarioRepository funcionarioRepository;

    @Override
    public FuncionarioResponse criaFuncionario(FuncionarioRequest funcionarioRequest) {
        log.info("[start] FuncionarioApplicationService - criaFuncionario");
        Funcionario funcionario = funcionarioRepository.salva(new Funcionario(funcionarioRequest));
        log.info("[finish] FuncionarioApplicationService - criaFuncionario");
        return FuncionarioResponse.builder()
                .idFuncionario(funcionario.getIdFuncionario())
                .build();
    }

    @Override
    public List<FuncionarioListResponse> buscaTodosFuncionarios() {
        log.info("[start] FuncionarioApplicationService - buscaTodosFuncionarios");
        List<Funcionario> funcionarios = funcionarioRepository.buscaTodosFuncionarios();
        log.info("[finish] FuncionarioApplicationService - buscaTodosFuncionarios");
        return FuncionarioListResponse.converte(funcionarios);
    }

    @Override
    public FuncionarioDetalhadoResponse buscaFuncionarioAtravesId(UUID idFuncionario) {
        log.info("[start] FuncionarioApplicationService - buscaFuncionarioAtravesId");
        Funcionario funcionario = funcionarioRepository.buscaFuncionarioAtravesId(idFuncionario);
        log.info("[finish] FuncionarioApplicationService - buscaFuncionarioAtravesId");
        return new FuncionarioDetalhadoResponse(funcionario);
    }
}
