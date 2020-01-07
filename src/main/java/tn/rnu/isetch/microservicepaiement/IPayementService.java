package tn.rnu.isetch.microservicepaiement.service;

import tn.rnu.isetch.microservicepaiement.Entities.Paiement;

public interface IPayementService {
	
	public List<Article> listeArticle();
	public Paiement save(Paiement p);
    Paiement findByidFacture (int idFacture);
}
