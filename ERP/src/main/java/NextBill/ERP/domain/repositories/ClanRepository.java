package NextBill.ERP.domain.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import NextBill.ERP.domain.entities.Clan;

@Repository
public interface ClanRepository extends JpaRepository<Clan, Integer>{

}
