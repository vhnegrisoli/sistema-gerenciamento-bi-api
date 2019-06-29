package br.com.continuum.sistemabi.sistemagerenciamentobi.modules.usuario.service;

import br.com.continuum.sistemabi.sistemagerenciamentobi.modules.usuario.model.Usuario;
import br.com.continuum.sistemabi.sistemagerenciamentobi.modules.usuario.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioService {
    @Autowired
    private UsuarioRepository usuarioRepository;

    public List<Usuario> buscarTodos() {
        return usuarioRepository.findAll();
    }

}
