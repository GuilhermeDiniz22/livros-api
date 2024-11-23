package br.livros.livros.api.entity.categorias;

import br.livros.livros.api.entity.livro.Livro;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "categorias")
public class Categoria {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    @NotBlank(message = "Nome é necessário")
    private String nome;


    private List<Livro> livrosList;

    @Column(name = "criado_em")
    private final LocalDateTime criadoEm = LocalDateTime.now();
}
