package br.com.continuum.sistemabi.sistemagerenciamentobi.modules.usuario.repository;

import br.com.continuum.sistemabi.sistemagerenciamentobi.modules.usuario.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {
}
