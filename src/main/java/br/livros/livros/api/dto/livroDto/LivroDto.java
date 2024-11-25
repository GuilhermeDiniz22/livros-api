package br.livros.livros.api.dto.livroDto;

import br.livros.livros.api.dto.categoriaDto.CategoriaDto;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
@AllArgsConstructor
@NoArgsConstructor
public class LivroDto {
    private Long id;

    private String nome;

    private String descricao;

    private BigDecimal preco;

    private String imagemUrl;

    private CategoriaDto categoriaDto;

}
