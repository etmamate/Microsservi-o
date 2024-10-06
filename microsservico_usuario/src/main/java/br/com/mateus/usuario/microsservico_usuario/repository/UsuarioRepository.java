package br.com.mateus.usuario.microsservico_usuario.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.mateus.usuario.microsservico_usuario.table.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {

    List<Usuario> findByNomeContainingAllIgnoreCaseOrderByNome(String nome);
}
