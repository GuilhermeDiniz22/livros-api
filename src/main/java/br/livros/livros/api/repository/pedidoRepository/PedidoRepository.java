package br.livros.livros.api.repository.pedidoRepository;

import br.livros.livros.api.entity.pedido.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PedidoRepository extends JpaRepository<Pedido, Long> {
}
