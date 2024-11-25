package br.livros.livros.api.dto.pedidoDto;

import br.livros.livros.api.dto.pedidoItemDto.PedidoItemDto;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
@AllArgsConstructor
@NoArgsConstructor
public class PedidoDto {

    private Long id;

    private BigDecimal precoTotal;

    private List<PedidoItemDto> pedidoItemList;

    private LocalDateTime criadoEm = LocalDateTime.now();
}
