package NextBill.ERP.domain.repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import NextBill.ERP.domain.entities.Role;


@Repository
public interface RoleRepository extends JpaRepository<Role, Integer>{
    
}