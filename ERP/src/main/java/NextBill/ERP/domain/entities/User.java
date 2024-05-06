package NextBill.ERP.domain.entities;
import java.util.List;
import java.util.UUID;
import NextBill.ERP.util.enums.EstudentStatus;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity(name = "user")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    
    @Column(nullable = false)
    private int totalPoints;

    @Column(length = 45, nullable = false)
    private String password;

    @Column(length = 100, nullable = false)
    private String name;
    
    @Column(length = 45, nullable = false)
    private String email;
    
    @Column(length = 45, nullable = false)
    private String phoneNumber;
    
    @Column(nullable = false)
    private String url_image;

    @Column(length = 45)
    @Enumerated(EnumType.STRING)
    private EstudentStatus status;

    @ManyToOne(cascade = CascadeType.REMOVE)
    @JoinColumn(name = "role_id" , referencedColumnName ="id")
    private Role role;

    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    @OneToMany(mappedBy = "asignedUser")
    private List<Score> recivedScore; // Dividido en dos listas separadas

    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    @OneToMany(mappedBy = "asignerUser")
    private List<Score> asignedScore; // Dividido en dos listas separadas
}
