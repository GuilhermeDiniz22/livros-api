package br.livros.livros.api.entity.livro;

import br.livros.livros.api.entity.categorias.Categoria;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "livros")
public class Livro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    @NotBlank(message = "Nome é necessário")
    private String nome;

    @Column
    @NotBlank(message = "Descrição é necessária")
    private String descricao;

    private String imagemUrl;

    private BigDecimal preco;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "categoria_id")
    private Categoria categoria;

    @Column(name = "criado_em")
    private final LocalDateTime criadoEm = LocalDateTime.now();
}
