package br.com.mateus.microsservico.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import br.com.mateus.microsservico.service.UsuarioService;
import br.com.mateus.microsservico.table.Usuario;

@Controller
public class UsuarioController {
    @Autowired
    private UsuarioService usuario_service;

    @GetMapping("/")
    public void index(){
        this.usuario_service.salvar(new Usuario(null, "José"));
        this.usuario_service.salvar(new Usuario(null, "Mario"));
        this.usuario_service.salvar(new Usuario(null, "Roberto"));
    }
} 
