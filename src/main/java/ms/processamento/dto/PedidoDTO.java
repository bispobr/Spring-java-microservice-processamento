package ms.processamento.dto;


import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record PedidoDTO (@NotNull Long id, @NotBlank String descricao){

}
