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
@Table(name = "TGE_VINCULO_HABILIDADE_VAGA")
public class TgeVinculoHabilidadeVagaModel {

    @Id
    @Column(name = "ID_VINCULO")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @NotBlank(message = "Campo id não pode ser nulo")
    private Integer idVinculo;

    @Column(name = "ID_HABILIDADE")
    @NotNull(message = "Este campo não pode estar vazio") 
    private Integer idHabilidade;
    
    @Column(name = "ID_VAGA")
    @NotNull(message = "Este campo não pode estar vazio")
    private Integer idVaga;
}
