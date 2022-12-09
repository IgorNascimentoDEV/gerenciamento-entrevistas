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
@Table(name = "TGE_STATUS")
public class TgeStatusModel {
    
    @Id
    @Column(name = "ID_STATUS")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @NotBlank(message = "Campo id não pode ser nulo")
    private Integer idStatus;

    @Column(name = "NOME_STATUS")
    @NotNull(message = "Este campo não poder ser vazio")
    private String nomeStatus;
}
