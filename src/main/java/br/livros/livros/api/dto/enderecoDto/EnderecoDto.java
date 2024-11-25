package br.livros.livros.api.dto.enderecoDto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
@AllArgsConstructor
@NoArgsConstructor
public class EnderecoDto {

    private Long id;

    private String cidade;

    private String rua;

    private String estado;

    private String cep;

    private String pais;

    private UsuarioDto usuario;

    private LocalDateTime criadoEm;
}
