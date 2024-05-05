package NextBill.ERP.domain.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import NextBill.ERP.domain.entities.User;

public interface UserRepository extends JpaRepository<User, UUID>{

     
}

