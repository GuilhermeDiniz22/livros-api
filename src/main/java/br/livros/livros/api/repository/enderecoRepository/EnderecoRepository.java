package br.livros.livros.api.repository.enderecoRepository;

import br.livros.livros.api.entity.endereco.Endereco;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EnderecoRepository extends JpaRepository<Endereco, Long> {
}
