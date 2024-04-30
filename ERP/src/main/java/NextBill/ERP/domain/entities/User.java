package NextBill.ERP.domain.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity(name = "user")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
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

    @Column(nullable = false)
    private int rol_id;
}