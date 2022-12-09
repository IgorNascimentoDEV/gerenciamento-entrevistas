package com.squad2.accenture.model;
import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@ToString
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "TGE_CANDIDATO")

public class TgeCandidatoModel {
    
    @Column
    @NotNull(message = "O campo de cpf não pode ser vazio")
    private String cpf;

    @Column
    @NotNull(message = "O campo nome não pode ser vazio")
    private String nome;

    @Column(name = "DESCRICAO_TECNICA")
    private String descricaoTecnica;

    @Column
    @NotNull(message = "O campo de email naõ pode ser vazio")
    private String email;

    @Column(name = "PRETENCAO_SALARIO")
    @NotNull(message = "Este campo não pode ser vazio")
    private double pretencaoSalario;

    @Column(name = "NOTA_INGLES")
    @NotNull(message = "Este campo não pode ser vazio")
    private double notaIngles;

    @Column(name = "NOTA_LOGICA")
    @NotNull(message = "Este campo não pode ser vazio")
    private double notaLogica;

    @Column(name = "NOTA_SQL")
    @NotNull(message = "Este campo não pode ser vazio")
    private double notaSql;

    @Column(name = "ID_SENIORIDADE")
    @NotNull(message = "Este Campo não pode ser vazio")
    private Integer idSenioridade;

    @Column(name = "STATUS_ID_STATUS")
    @NotNull(message = "Este campo não pode ser vazio")
    private Integer statusIdStatus;

    @Column(name = "VAGAS_ID_VAGA")
    @NotNull(message = "Este campo não pode ser vazio")
    private Integer vagasIdVaga;

}
