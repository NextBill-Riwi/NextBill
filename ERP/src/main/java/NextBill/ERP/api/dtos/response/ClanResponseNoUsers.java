package NextBill.ERP.api.dtos.response;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ClanResponseNoUsers{
    private int id;
    private String name;
    private String cohort;
    private int points;
}
