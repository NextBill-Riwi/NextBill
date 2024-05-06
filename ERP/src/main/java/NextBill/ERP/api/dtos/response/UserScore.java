package NextBill.ERP.api.dtos.response;

import java.util.List;

import NextBill.ERP.domain.entities.Score;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserScore {
    private List<Score> score;
}
