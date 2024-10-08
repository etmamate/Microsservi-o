package br.com.mateus.usuario.microsservico_usuario.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import br.com.mateus.usuario.microsservico_usuario.repository.UsuarioRepository;
import br.com.mateus.usuario.microsservico_usuario.table.Usuario;

@Service
public class UsuarioService {
    @Autowired
    private UsuarioRepository userRepo;

    public void salvar(Usuario usuario){
        this.userRepo.save(usuario);
    }
}
