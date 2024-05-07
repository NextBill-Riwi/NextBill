package NextBill.ERP.api.dtos.response;

import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ScoreResponse {
    private int asignerUser;
    private int points;
    private String description;
    private LocalDateTime creationDate;
    private Module module;
}
