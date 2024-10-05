package br.com.mateus.microsservico.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.mateus.microsservico.repository.ProdutoRepository;
import br.com.mateus.microsservico.table.Usuario;

@Service
public class UsuarioService {
    @Autowired
    private ProdutoRepository user_repo;

    public void salvar(Usuario usuario){
        this.user_repo.save(null);
    }
}
