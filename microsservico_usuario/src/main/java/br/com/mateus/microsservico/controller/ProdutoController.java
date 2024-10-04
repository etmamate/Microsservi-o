package br.com.mateus.microsservico.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import br.com.mateus.microsservico.service.ProdutoService;
import br.com.mateus.microsservico.table.Produto;

@Controller
public class ProdutoController {
    
    @Autowired
    private ProdutoService servico;

    @GetMapping("/")
    public void index(){
        this.servico.salvar(new Produto(null,"Celular", "Samsung Galaxy", 2500.00));
    }
}
