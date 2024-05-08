package NextBill.ERP.api.dtos.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ClanRequest {

    
    private int id;

    @NotBlank(message = "Clan Name is required")
    private String name;

    @NotBlank(message = "Cohort is required")
    private String cohort;

    @Pattern(regexp = "^-?\\d+$", message = "Pointsrequest should be a positive or negative integer")
    private int points;

    private String urlImage;

}
