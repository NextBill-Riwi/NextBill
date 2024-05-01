package NextBill.ERP.domain.repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import NextBill.ERP.domain.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer>{
    
}