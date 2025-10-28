package br.com.f1rst.cadastro_funcionario.Funcionario.application.api;

import br.com.f1rst.cadastro_funcionario.Funcionario.domain.Funcionario;
import lombok.Value;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Value
public class FuncionarioListResponse {
    private UUID idFuncionario;
    private String nomeCompleto;
    private String designacao;
    private String salario;
    private String celular;
    private String endereco;

    public static List<FuncionarioListResponse> converte(List<Funcionario> funcionarios) {
        return funcionarios.stream()
                .map(FuncionarioListResponse::new)
                .collect(Collectors.toList());
    }
    public FuncionarioListResponse(Funcionario funcionario) {
        this.idFuncionario = funcionario.getIdFuncionario();
        this.nomeCompleto = funcionario.getNomeCompleto();
        this.designacao = funcionario.getDesignacao();
        this.salario = funcionario.getSalario();
        this.celular = funcionario.getCelular();
        this.endereco = funcionario.getEndereco();
    }
}
