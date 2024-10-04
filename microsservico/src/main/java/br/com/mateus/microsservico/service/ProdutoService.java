package br.com.mateus.microsservico.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.mateus.microsservico.repository.ProdutoRepository;
import br.com.mateus.microsservico.table.Produto;

@Service //Instaceia os dados do repository
public class ProdutoService {
    @Autowired //Solicitando o instaciamento da classe
    private ProdutoRepository repo;

    public void salvar(Produto produto){
        this.repo.save(produto);
        //recebe os dados da tabela produto.
    }
}
