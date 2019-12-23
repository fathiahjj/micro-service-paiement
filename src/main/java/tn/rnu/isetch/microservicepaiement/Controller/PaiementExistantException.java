package tn.rnu.isetch.microservicepaiement.Controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.CONFLICT)

public class PaiementExistantException extends Exception {

    public PaiementExistantException(String message) {
        super(message);
    }
}
