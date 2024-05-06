package NextBill.ERP.api.dtos.response;

import java.time.LocalDateTime;
import java.util.List;

import NextBill.ERP.domain.entities.Score;
import NextBill.ERP.domain.entities.User;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserScore {
    private int asignerUser;
    private int points;
    private String description;
    private LocalDateTime creationDate;
    private Module module;
}
