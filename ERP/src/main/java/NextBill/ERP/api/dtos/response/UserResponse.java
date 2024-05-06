package NextBill.ERP.api.dtos.response;


import NextBill.ERP.domain.entities.Role;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserResponse {

    private String email;
    private String name;
    private String phone_number;
    private int total_points;
    private Role role_id;

}
