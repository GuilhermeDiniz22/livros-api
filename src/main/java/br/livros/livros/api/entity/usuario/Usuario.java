package br.livros.livros.api.entity.usuario;

import br.livros.livros.api.entity.endereco.Endereco;
import br.livros.livros.api.entity.pedidoItem.PedidoItem;
import br.livros.livros.api.enums.userRole.UserRole;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "usuarios")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    @NotBlank(message = "Nome é necessário")
    private String nome;

    @Column(unique = true)
    @NotBlank(message = "Email é necessário")
    private String email;

    @Column
    @NotBlank(message = "Senha é necessária")
    private String senha;

    @Column
    private String telefone;

    private UserRole role;

    @OneToMany(mappedBy = "usuario", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<PedidoItem> pedidoItemList;

    @Column
    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Endereco endereco;

    @Column(name = "criado_em")
    private final LocalDateTime criadoEm = LocalDateTime.now();
}
