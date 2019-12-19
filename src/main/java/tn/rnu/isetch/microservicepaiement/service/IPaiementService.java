package tn.rnu.isetch.microservicepaiement.service;

import tn.rnu.isetch.microservicepaiement.Entities.Paiement;

public interface IPaiementService {
    public Paiement save(Paiement paiement);
    Paiement findByidFacture (int idFacture);
}
