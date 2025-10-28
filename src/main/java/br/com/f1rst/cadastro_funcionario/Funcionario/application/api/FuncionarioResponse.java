package br.com.f1rst.cadastro_funcionario.Funcionario.application.api;

import lombok.Builder;
import lombok.Value;

import java.util.UUID;

@Value
@Builder
public class FuncionarioResponse {
    private UUID idFuncionario;
}
