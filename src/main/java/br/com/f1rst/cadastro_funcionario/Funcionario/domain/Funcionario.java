package br.com.f1rst.cadastro_funcionario.Funcionario.domain;

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

    public Funcionario(Integer id, String nomeCompleto, String designacao,
                       String salario, String celular, String endereco,
                       LocalDateTime dataHoraDoCadasto) {
        this.nomeCompleto = nomeCompleto;
        this.designacao = designacao;
        this.salario = salario;
        this.celular = celular;
        this.endereco = endereco;
        this.dataHoraDoCadasto = LocalDateTime.now();
    }
}
