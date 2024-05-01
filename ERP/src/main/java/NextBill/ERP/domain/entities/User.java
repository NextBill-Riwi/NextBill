package NextBill.ERP.domain.entities;


import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
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
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    @Column(nullable = false)
    private int total_points;

    @Column(length = 45, nullable = false)
    private String user_password;

    @Column(length = 45, nullable = false)
    private String user_name;
    
    @Column(length = 45, nullable = false)
    private String email;
    
    @Column(length = 45, nullable = false)
    private String phone_number;

    @ManyToOne
    @JoinColumn(name = "role_id" , referencedColumnName ="id")
    private Role userRole;

    @ManyToMany(fetch = FetchType.LAZY)
    private List<Clan> asignedClans;

    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    @OneToMany(mappedBy = "asignedUser")
    private List<Score> recivedScore; // Dividido en dos listas separadas

    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    @OneToMany(mappedBy = "asigneeUser")
    private List<Score> asignedScore; // Dividido en dos listas separadas
}