package br.com.f1rst.cadastro_funcionario.Funcionario.application.repository;

import br.com.f1rst.cadastro_funcionario.Funcionario.domain.Funcionario;

public interface FuncionarioRepository {
    Funcionario salva(Funcionario funcionario);
}
