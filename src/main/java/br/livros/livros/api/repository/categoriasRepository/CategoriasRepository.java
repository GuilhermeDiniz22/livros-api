package br.livros.livros.api.repository.categoriasRepository;

import br.livros.livros.api.entity.categorias.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriasRepository extends JpaRepository<Categoria, Long> {
}
