package NextBill.ERP.domain.repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import NextBill.ERP.domain.entities.Score;

@Repository
public interface ScoreRepository extends JpaRepository<Score, Integer>{
    
}