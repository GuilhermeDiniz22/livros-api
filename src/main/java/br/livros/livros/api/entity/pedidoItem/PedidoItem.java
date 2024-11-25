package br.livros.livros.api.entity.pedidoItem;

import br.livros.livros.api.entity.livro.Livro;
import br.livros.livros.api.entity.pedido.Pedido;
import br.livros.livros.api.entity.usuario.Usuario;
import br.livros.livros.api.enums.pedidoStatus.PedidoStatus;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "pedido_items")
public class PedidoItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Integer quantidade;

    @Column
    private BigDecimal precoTotal;

    private PedidoStatus pedidoStatus;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "usuario_id")
    private Usuario usuario;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "livro_id")
    private Livro livro;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "pedido_id")
    private Pedido pedido;

    @Column(name = "criado_em")
    private final LocalDateTime criadoEm = LocalDateTime.now();
}
