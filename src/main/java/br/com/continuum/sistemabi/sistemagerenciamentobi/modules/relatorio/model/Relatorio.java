package br.com.continuum.sistemabi.sistemagerenciamentobi.modules.relatorio.model;

import br.com.continuum.sistemabi.sistemagerenciamentobi.modules.usuario.model.Usuario;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "relatorio")
public class Relatorio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    @Basic
    @NotNull
    private String titulo;

    @Column(name = "link_relatorio")
    @Basic
    @NotNull
    private String linkRelatorio;

    @NotNull
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "usuario_id")
    private Usuario usuario;

}
