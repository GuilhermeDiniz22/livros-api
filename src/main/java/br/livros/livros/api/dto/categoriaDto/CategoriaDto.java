package br.livros.livros.api.dto.categoriaDto;


import br.livros.livros.api.dto.livroDto.LivroDto;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
@AllArgsConstructor
@NoArgsConstructor
public class CategoriaDto {

    private Long id;

    private String nome;

    private List<LivroDto> livrosList;

    private LocalDateTime criadoEm = LocalDateTime.now();
}
