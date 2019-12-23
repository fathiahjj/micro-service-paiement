package tn.rnu.isetch.microservicepaiement.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.rnu.isetch.microservicepaiement.Entities.Paiement;

@Repository
public interface PaiementRepository extends JpaRepository<Paiement,Long> {
   

	Paiement findByidFacture(Long idFacture);

}
