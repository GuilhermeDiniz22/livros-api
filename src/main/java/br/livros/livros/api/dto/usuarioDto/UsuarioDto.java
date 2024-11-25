package br.livros.livros.api.dto.usuarioDto;

import br.livros.livros.api.dto.enderecoDto.EnderecoDto;
import br.livros.livros.api.dto.pedidoItemDto.PedidoItemDto;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
@AllArgsConstructor
@NoArgsConstructor
public class UsuarioDto {
    private Integer id;

    private String nome;

    private String email;

    private String senha;

    private String telefone;

    private String role;

    private List<PedidoItemDto> pedidoItemDtoList;

    private EnderecoDto enderecoDto;
}
