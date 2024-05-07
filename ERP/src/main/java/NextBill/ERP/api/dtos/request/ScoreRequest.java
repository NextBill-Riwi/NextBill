package NextBill.ERP.api.dtos.request;

import java.time.LocalDateTime;
import java.util.UUID;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
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

    private  UUID id;
    
    @NotNull(message = "Los puntos son requeridos")
    @Pattern(regexp = "^-?\\d+$", message = "Pointsrequest should be a positive or negative integer")
    private int points;

    @NotBlank(message = "La descripción es requerida")
    private String description;

    @NotBlank(message = "La fecha es requerida")
    private LocalDateTime creationDate;

    @Size(min = 1)
    @NotNull(message = "El id del usuario a asginar es requerido")
    private UUID asignedUserId;

    @Size(min = 1 )
    @NotNull(message = "El id del usuario que asigna es requerido")
    private UUID asignerUserId;
}