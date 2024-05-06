package NextBill.ERP.api.dtos.response;

import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ClanResponse {
    private int id;
    private String name;
    private String cohort;
    private int points;
    private String urlImage;
    private List<UserResponse> asignedUsers;
}
