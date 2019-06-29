package br.com.continuum.sistemabi.sistemagerenciamentobi.modules.relatorio.controller;

import br.com.continuum.sistemabi.sistemagerenciamentobi.modules.relatorio.model.Relatorio;
import br.com.continuum.sistemabi.sistemagerenciamentobi.modules.relatorio.service.RelatorioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/relatorios")
@CrossOrigin
public class RelatorioController {

    @Autowired
    private RelatorioService relatorioService;

    @GetMapping
    private List<Relatorio> findAll() {
        return relatorioService.buscarTodos();
    }

}
