package br.com.f1rst.cadastro_funcionario.Funcionario.application.api;

import lombok.Value;

import java.time.LocalDateTime;
import java.util.UUID;

@Value
public class FuncionarioDetalhadoResponse {
    private UUID idFuncionario;
    private String nomeCompleto;
    private String designacao;
    private String salario;
    private String celular;
    private String endereco;

    private LocalDateTime dataHoraDoCadasto;
}
