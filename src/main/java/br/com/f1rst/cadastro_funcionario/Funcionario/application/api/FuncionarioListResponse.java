package br.com.f1rst.cadastro_funcionario.Funcionario.application.api;

import br.com.f1rst.cadastro_funcionario.Funcionario.domain.Funcionario;

import java.util.List;
import java.util.UUID;

public class FuncionarioListResponse {

    private UUID idFuncionario;
    private String nomeCompleto;
    private String designacao;
    private String salario;
    private String celular;
    private String endereco;

    public static List<FuncionarioListResponse> converte
            (List<Funcionario> funcionarios) {
        return null;
    }
}
