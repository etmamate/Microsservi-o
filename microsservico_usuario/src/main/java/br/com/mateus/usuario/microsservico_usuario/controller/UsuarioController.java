package br.com.mateus.usuario.microsservico_usuario.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import br.com.mateus.usuario.microsservico_usuario.service.UsuarioService;
import br.com.mateus.usuario.microsservico_usuario.table.Usuario;

@Controller
public class UsuarioController {
    
    @Autowired
    private UsuarioService userService;

    @GetMapping("/")
    public void index(){
        this.userService.salvar(new Usuario(null, "Mateus", "Cristo"));
        this.userService.salvar(new Usuario(null, "Fernando", "José"));
    }
}
