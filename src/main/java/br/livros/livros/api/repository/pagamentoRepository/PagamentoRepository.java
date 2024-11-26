package br.livros.livros.api.repository.pagamentoRepository;

import br.livros.livros.api.entity.pagamento.Pagamento;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PagamentoRepository extends JpaRepository<Pagamento, Long> {
}
