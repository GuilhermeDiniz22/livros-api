package br.livros.livros.api.repository.categoriaRepository;

import br.livros.livros.api.entity.categorias.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {
}
