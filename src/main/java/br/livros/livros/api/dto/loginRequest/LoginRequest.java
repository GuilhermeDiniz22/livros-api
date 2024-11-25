package br.livros.livros.api.dto.loginRequest;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class LoginRequest {

    @NotBlank(message = "email é necessário")
    private String email;

    @NotBlank(message = "senha é necessária")
    private String senha;
}
