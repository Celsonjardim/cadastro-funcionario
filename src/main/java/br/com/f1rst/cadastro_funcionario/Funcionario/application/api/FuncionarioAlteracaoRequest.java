package br.com.f1rst.cadastro_funcionario.Funcionario.application.api;

import jakarta.validation.constraints.NotBlank;
import lombok.Value;

@Value
public class FuncionarioAlteracaoRequest {
    @NotBlank
    private String designacao;
    @NotBlank
    private String salario;
    @NotBlank
    private String celular;
    @NotBlank
    private String endereco;
}
