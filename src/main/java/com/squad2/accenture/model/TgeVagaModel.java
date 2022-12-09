package com.squad2.accenture.model;
import lombok.*;

import java.time.LocalDate;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;


@ToString
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "TGE_VAGA")
public class TgeVagaModel {
    
    @Id
    @Column(name = "ID_VAGA")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @NotBlank(message = "Campo idVaga não pode ser nulo")
    private Integer idVaga;

    @Column(name = "NOME_VAGA")
    @NotNull(message = "Este campo não pode ser vazio")
    private String nomeVaga;

    @Column(name = "TEMP_ALOCACAO")
    @NotNull(message = "Este campo não pode ser vazio")
    private LocalDate tempAlocacao;

    @Column(name = "ID_IDIOMA")
    @NotNull(message = "Este campo não pode ser vazio")
    private Integer idIdioma;

    @Column
    @NotNull(message = "Este campo não pode ser vazio")
    private String localidade;

    @Column
    @NotNull(message = "Este campo não pode ser vazio")
    private String descricao;

}
