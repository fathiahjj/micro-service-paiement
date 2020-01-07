package tn.rnu.isetch.microservicepaiement.service;

import org.springframework.beans.factory.annotation.Autowired;
import tn.rnu.isetch.microservicepaiement.Entities.Paiement;
import tn.rnu.isetch.microservicepaiement.Repository.PaiementRepository;

public class PayementService implements IPayementService{
    @Autowired PaiementRepository paiementRepository;

    @Override
	public List<Article> listeArticle() {
		return (List<Article>) 
		paiementRepository.findAll();
	}
	

    @Override
    public Paiement save(Paiement paiement) {
        return paiementRepository.save(paiement);
    }

    @Override
    public Paiement findByidFacture(int idFacture) {
        return null;
    }
}
