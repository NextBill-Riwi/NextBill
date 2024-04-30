package NextBill.ERP.domain.entities;

//METHODS
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;


//INTERFACES//
import jakarta.persistence.FetchType;
import jakarta.persistence.GenerationType;

@Entity
public class UserClan {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long index;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "clan_id", referencedColumnName = "idClan")
    private Clan clan;
    


    // @ManyToOne(fetch = FetchType.LAZY)
    // @JoinColumn(name = "nombre crear", referencedColumnName = "columna de referencia en la otra entidad")
    // private Company company;
}
