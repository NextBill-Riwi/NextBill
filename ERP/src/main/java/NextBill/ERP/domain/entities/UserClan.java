package NextBill.ERP.domain.entities;

//METHODS
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.MapsId;
import lombok.AllArgsConstructor;
import lombok.Data;
//INTERFACES//
import jakarta.persistence.FetchType;
import jakarta.persistence.GenerationType;


@Entity(name = "userClan")
@Data
@AllArgsConstructor
public class UserClan {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long index;

    @ManyToOne(fetch = FetchType.LAZY)
    @MapsId("idClan")
    @JoinColumn(name = "clan_id", referencedColumnName = "idClan")
    private Clan clan;
    

    @ManyToOne(fetch = FetchType.LAZY)
    @MapsId("id")
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    private User user;
   
}
