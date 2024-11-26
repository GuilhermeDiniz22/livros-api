package br.livros.livros.api.repository.pedidoItemRepository;

import br.livros.livros.api.entity.pedidoItem.PedidoItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface PedidoItemRepository extends JpaRepository<PedidoItem, Long>, JpaSpecificationExecutor<PedidoItem> {
}
