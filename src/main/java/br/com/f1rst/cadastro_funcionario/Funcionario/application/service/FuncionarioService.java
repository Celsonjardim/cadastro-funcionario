package br.com.f1rst.cadastro_funcionario.Funcionario.application.service;

import br.com.f1rst.cadastro_funcionario.Funcionario.application.api.FuncionarioDetalhadoResponse;
import br.com.f1rst.cadastro_funcionario.Funcionario.application.api.FuncionarioListResponse;
import br.com.f1rst.cadastro_funcionario.Funcionario.application.api.FuncionarioRequest;
import br.com.f1rst.cadastro_funcionario.Funcionario.application.api.FuncionarioResponse;

import java.util.List;
import java.util.UUID;

public interface FuncionarioService {
    FuncionarioResponse criaFuncionario(FuncionarioRequest funcionarioRequest);
    List<FuncionarioListResponse> buscaTodosFuncionarios();
    FuncionarioDetalhadoResponse buscaFuncionarioAtravesId(UUID idFuncionario);
    void deletaFuncionarioAtravesId(UUID idFuncionario);
}
