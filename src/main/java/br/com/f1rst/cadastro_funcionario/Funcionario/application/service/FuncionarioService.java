package br.com.f1rst.cadastro_funcionario.Funcionario.application.service;

import br.com.f1rst.cadastro_funcionario.Funcionario.application.api.FuncionarioRequest;
import br.com.f1rst.cadastro_funcionario.Funcionario.application.api.FuncionarioResponse;

public interface FuncionarioService {
    FuncionarioResponse criaFuncionario(FuncionarioRequest funcionarioRequest);
}
