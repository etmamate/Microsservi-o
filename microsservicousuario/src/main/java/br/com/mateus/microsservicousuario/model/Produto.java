package main.java.br.com.mateus.microsservicousuario.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Produto {
    private Integer id;
    private String nome;
    private String descricao;
    private Double valor;
}
