package tn.rnu.isetch.microservicepaiement.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import tn.rnu.isetch.microservicepaiement.Entities.Paiement;
import tn.rnu.isetch.microservicepaiement.service.PaiementService;

@RestController
public class PaiementController {

  /*  @Autowired
    private PaiementService paiementService;
   // ModelMapper modelMapper = new ModelMapper():
Paiement paiement;
    @PostMapping(value = "/paiement")
    public ResponseEntity<Paiement> payerFacture(@RequestBody Paiement paiement)
    {
        Paiement paiementExistant = paiementService.findByidFacture(paiement.getIdFacture());
        if (paiementExistant != null) throw  new
                PaiementExistantException("cotte facture est déjà payée");

        Paiement nouveauPaiment = paiementService.save(paiement);
    }*/
}

