package br.livros.livros.api.repository.livroRepository;

import br.livros.livros.api.entity.livro.Livro;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface LivroRepository extends JpaRepository<Livro, Long> {
    List<Livro> findByCategoriaId(Long categoriaId);

    List<Livro> findByNomeOuDescricao(String nome, String descricao);
}
