package br.com.mateus.microsservico.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.mateus.microsservico.table.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Integer> {

    List<Produto> findByNomeContainingAllIgnoreCaseOrderByNome(String nome);

}
