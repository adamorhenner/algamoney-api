package com.algaworks.algamoneyapi.repository;

import com.algaworks.algamoneyapi.model.Lancamento;
import com.algaworks.algamoneyapi.repository.lancamento.LancamentoRepositoryQuerry;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LancamentoRepository extends JpaRepository<Lancamento,Long>, LancamentoRepositoryQuerry {
}
