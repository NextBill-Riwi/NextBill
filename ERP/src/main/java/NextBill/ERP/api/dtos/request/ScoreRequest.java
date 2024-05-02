package NextBill.ERP.api.dtos.request;

import java.time.LocalDateTime;
import java.util.UUID;

import NextBill.ERP.domain.entities.User;
import jakarta.persistence.Column;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ScoreRequest {

    @NotBlank(message = "Los puntos son requeridos")
    private int points;

    @NotBlank(message = "La descripción es requerida")
    private String description;

    @NotBlank(message = "La fecha es requerida")
    private LocalDateTime creationDate;

    @Size(min = 0, max = 32)
    @NotBlank(message = "El id del usuario a asginar es requerido")
    private User asignedUserId;

    @Size(min = 0, max = 32)
    @NotBlank(message = "El id del usuario que asigna es requerido")
    private User asignerUserId;
}