package com.squad2.accenture.model;
import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;


@ToString
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "TGE_SENIORIDADE")
public class TgeSenioridadeModel {
    
    @Id
    @Column(name = "ID_SENIORIDADE")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @NotBlank(message = "Campo id não pode ser nulo")
    private Integer idSenioridade;

    @Column(name = "NOME_SENIORIDADE")
    @NotNull(message = "Este Campo não pode ser vazio")
    private String nomeSenioridade;
}
