package br.com.mateus.usuario.microsservico_usuario.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import br.com.mateus.usuario.microsservico_usuario.service.UsuarioService;
import br.com.mateus.usuario.microsservico_usuario.table.Usuario;

@Controller
public class UsuarioController {
    
    @Autowired
    private UsuarioService user_service;

    @GetMapping("/")
    public void index(){
        this.user_service.salvar(new Usuario(null, "Mateus", "Cristo"));
        this.user_service.salvar(new Usuario(null, "Fernando", "José"));
    }
}
