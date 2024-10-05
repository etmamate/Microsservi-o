package br.com.mateus.microsservico.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

import br.com.mateus.microsservico.table.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {
    List<Usuario> findByNomeContainingAllIgnoreCaseOrderByNome(String nome);
}
