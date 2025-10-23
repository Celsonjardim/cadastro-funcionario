package br.com.f1rst.cadastro_funcionario.Funcionario.infra;

import br.com.f1rst.cadastro_funcionario.Funcionario.application.repository.FuncionarioRepository;
import br.com.f1rst.cadastro_funcionario.Funcionario.domain.Funcionario;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.antlr.v4.runtime.misc.LogManager;
import org.springframework.stereotype.Repository;

@Repository
@Log4j2
@RequiredArgsConstructor
public class FuncionarioInfraRepository implements FuncionarioRepository {
    private final FuncionarioSpringDataJPARepository funcionarioSpringDataJPARepository;

    @Override
    public Funcionario salva(Funcionario funcionario) {
        log.info("[start] FuncionarioInfraRepository - salva");
        funcionarioSpringDataJPARepository.save(funcionario);
        log.info("[finish] FuncionarioInfraRepository - salva");
        return funcionario;
    }
}
