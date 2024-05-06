package NextBill.ERP.api.dtos.response;


import java.util.List;
import NextBill.ERP.domain.entities.Role;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserResponseFull {

    private int totalPoints;
    private String email;
    private String name;
    private String phoneNumber;
    private String urlImage;
    private Role role;
    private ClanResponseNoUsers clan;
    private List<UserScore> score;

}
