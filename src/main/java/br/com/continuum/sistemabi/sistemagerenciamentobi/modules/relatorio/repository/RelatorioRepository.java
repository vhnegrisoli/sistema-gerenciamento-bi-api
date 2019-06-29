package br.com.continuum.sistemabi.sistemagerenciamentobi.modules.relatorio.repository;

import br.com.continuum.sistemabi.sistemagerenciamentobi.modules.relatorio.model.Relatorio;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RelatorioRepository extends JpaRepository<Relatorio, Integer> {
}
