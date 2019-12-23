package tn.rnu.isetch.microservicepaiement.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import tn.rnu.isetch.microservicepaiement.Entities.Paiement;
import tn.rnu.isetch.microservicepaiement.service.PaiementService;
import tn.rnu.isetch.microservicepaiement.Repository.PaiementRepository;

@RestController
public class PaiementController {


    @Autowired
    PaiementRepository paiementRepository;

    @PostMapping(value = "/paiement")
    public ResponseEntity<Paiement>  payerUneFacture(@RequestBody Paiement paiement) throws PaiementExistantException, PaiementImpossibleException{


        //Vérifier s'il y a déja un paiement enregistre pour cette facture 
      
    	Paiement paiementExistant =paiementRepository.findByidFacture(paiement.getIdFacture());
      if(paiementExistant != null) throw new PaiementExistantException("Cette facture est deja  payer");

        //Enregistrer le paiement
        Paiement nouveauPaiement = paiementRepository.save(paiement);


        if(nouveauPaiement == null) throw new PaiementImpossibleException("Erreur, impossible d'etablir le paiement, reessayez plus tard");



        //TODO Nous allons appeler le Microservice facture ici pour lui signifier que le paiement est accepter 

        return new ResponseEntity<Paiement>(nouveauPaiement, HttpStatus.CREATED);

    }


}

