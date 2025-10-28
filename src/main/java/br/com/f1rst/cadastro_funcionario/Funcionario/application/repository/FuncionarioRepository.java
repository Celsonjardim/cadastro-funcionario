package br.com.f1rst.cadastro_funcionario.Funcionario.application.repository;

import br.com.f1rst.cadastro_funcionario.Funcionario.application.api.FuncionarioListResponse;
import br.com.f1rst.cadastro_funcionario.Funcionario.domain.Funcionario;

import java.util.List;

public interface FuncionarioRepository {
    Funcionario salva(Funcionario funcionario);
    List<Funcionario> buscaTodosFuncionarios();
}
