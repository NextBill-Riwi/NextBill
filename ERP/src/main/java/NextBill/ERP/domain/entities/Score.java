package NextBill.ERP.domain.entities;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity(name = "score")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Score {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private long scoreId;

    @Column(nullable = false)
    private int points;

    @Column(length = 255, nullable = true)
    private String description;

    private LocalDateTime creationDate;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "asgined_user_id" , referencedColumnName ="id")
    private User asignedUser;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "asginee_user_id" , referencedColumnName ="id")
    private User asigneeUser;
    
}