package br.livros.livros.api.dto.response;

import br.livros.livros.api.dto.enderecoDto.EnderecoDto;
import br.livros.livros.api.dto.usuarioDto.UsuarioDto;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Response {

    private Integer status;
    private String mensagem;
    private final LocalDateTime timestamp = LocalDateTime.now();

    private String token;
    private String role;
    private String tempoExpiracao;

    private Integer totalPaginas;
    private long totalElementos;

    private EnderecoDto enderecoDto;

    private UsuarioDto usuarioDto;
}
