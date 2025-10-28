package br.com.f1rst.cadastro_funcionario.Funcionario.application.api;

import br.com.f1rst.cadastro_funcionario.Funcionario.domain.Funcionario;
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

    public FuncionarioDetalhadoResponse(Funcionario funcionario) {
        this.idFuncionario = funcionario.getIdFuncionario();
        this.nomeCompleto = funcionario.getNomeCompleto();
        this.designacao = funcionario.getDesignacao();
        this.salario = funcionario.getSalario();
        this.celular = funcionario.getCelular();
        this.endereco = funcionario.getEndereco();
        this.dataHoraDoCadasto = funcionario.getDataHoraDoCadasto();

    }
}