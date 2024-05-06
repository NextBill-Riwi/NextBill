package NextBill.ERP.api.dtos.request;

import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Positive;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ClanRequest {

    @Positive(message = "Id request should be a positive greater than cero")
    private int id;

    private String name;

    private String cohort;

    @Pattern(regexp = "^-?\\d+$", message = "Pointsrequest should be a positive or negative integer")
    private int points;

}
