package br.com.continuum.sistemabi.sistemagerenciamentobi.modules.usuario.model;

import br.com.continuum.sistemabi.sistemagerenciamentobi.modules.usuario.enums.ESituacao;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;

@Entity
@Table(name = "usuario")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotNull
    @Column
    @Basic
    private String nome;

    @NotNull
    @Column(name = "data_cadastro")
    @Basic
    private LocalDateTime dataCadastro;

    @NotNull
    @Column
    @Basic
    private String email;

    @NotNull
    @Column
    @Basic
    private String senha;

    @NotNull
    @Column
    @Basic
    @Enumerated(EnumType.STRING)
    private ESituacao situacao;

}
