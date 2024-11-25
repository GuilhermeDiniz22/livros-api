package br.livros.livros.api.dto.pedidoItemDto;

import br.livros.livros.api.dto.livroDto.LivroDto;
import br.livros.livros.api.dto.usuarioDto.UsuarioDto;
import br.livros.livros.api.entity.usuario.Usuario;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
@AllArgsConstructor
@NoArgsConstructor
public class PedidoItemDto {
    private Long id;

    private Integer quantidade;

    private BigDecimal preco;

    private String status;

    private UsuarioDto usuarioDto;

    private LivroDto livroDto;

    private LocalDateTime criadoEm;



}
