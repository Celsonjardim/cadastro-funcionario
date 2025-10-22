package br.com.f1rst.cadastro_funcionario.Funcionario.domain;

import br.com.f1rst.cadastro_funcionario.Funcionario.application.api.FuncionarioRequest;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.UUID;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
@Entity
public class Funcionario {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", updatable = false, unique = true, nullable = false)
    private UUID idFuncionario;
    @NotBlank
    private String nomeCompleto;
    @NotBlank
    private String designacao;
    @NotBlank
    private String salario;
    @NotBlank
    private String celular;
    @NotBlank
    private String endereco;

    private LocalDateTime dataHoraDoCadasto;
    private LocalDateTime dataHoraDaUltimaAlteracao;

    public Funcionario(FuncionarioRequest funcionarioRequest) {
        this.nomeCompleto = funcionarioRequest.getNomeCompleto();
        this.designacao = funcionarioRequest.getDesignacao();
        this.salario = funcionarioRequest.getSalario();
        this.celular = funcionarioRequest.getCelular();
        this.endereco = funcionarioRequest.getEndereco();
        this.dataHoraDoCadasto = LocalDateTime.now();
    }
}
