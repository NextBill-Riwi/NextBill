package NextBill.ERP.domain.entities;

import java.util.List;

import org.springframework.context.annotation.Primary;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Clan {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idClan;

    @Column(length = 100, nullable = false)
    private String nameClan;

    @Column
    private String cohort;

    @Column
    private int points;

    @ToString.Exclude // excluimos esta propiedad del to string
    @EqualsAndHashCode.Exclude // excluimos las propiedades dentro la lista
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "UserClan")
    private List<UserClan> usersInClan;

}
