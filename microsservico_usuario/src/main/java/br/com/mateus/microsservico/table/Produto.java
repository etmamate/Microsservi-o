package br.com.mateus.microsservico.table;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data // faz automaticamento os getters e setters
@NoArgsConstructor 
@AllArgsConstructor
@Entity // Um objeto no BD
@Table(name = "produto") // definindo o tipo de objeto no BD
public class Produto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Chave primaria no banco de dados.
    @Column(name = "id", updatable = false) // Nome da column
    private Integer id;
    @Column(name = "nome", nullable = false, length = 150)
    private String nome;
    @Column(name = "descricao", length = 1000)
    private String descricao;
    @Column(name = "preco")
    private Double preco;

}
