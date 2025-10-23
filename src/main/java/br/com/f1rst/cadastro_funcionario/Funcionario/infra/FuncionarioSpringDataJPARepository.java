package br.com.f1rst.cadastro_funcionario.Funcionario.infra;

import br.com.f1rst.cadastro_funcionario.Funcionario.domain.Funcionario;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface FuncionarioSpringDataJPARepository extends JpaRepository<Funcionario, UUID> {
}
