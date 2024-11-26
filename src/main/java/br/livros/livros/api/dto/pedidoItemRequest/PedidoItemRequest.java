package br.livros.livros.api.dto.pedidoItemRequest;

import lombok.Data;

@Data
public class PedidoItemRequest {

    private Integer produtoId;

    private Integer quantidade;
}
