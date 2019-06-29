package br.com.continuum.sistemabi.sistemagerenciamentobi.modules.relatorio.service;

import br.com.continuum.sistemabi.sistemagerenciamentobi.modules.relatorio.model.Relatorio;
import br.com.continuum.sistemabi.sistemagerenciamentobi.modules.relatorio.repository.RelatorioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RelatorioService {

    @Autowired
    private RelatorioRepository relatorioRepository;

    public List<Relatorio> buscarTodos() {
        return relatorioRepository.findAll();
    }

}
