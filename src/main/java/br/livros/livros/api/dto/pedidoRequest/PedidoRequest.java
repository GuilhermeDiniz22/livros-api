package br.livros.livros.api.dto.pedidoRequest;

import br.livros.livros.api.dto.pedidoItemRequest.PedidoItemRequest;
import br.livros.livros.api.entity.pagamento.Pagamento;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class PedidoRequest {
    private BigDecimal total;

    private List<PedidoItemRequest> pedidos;

    private Pagamento pagamento;
}
