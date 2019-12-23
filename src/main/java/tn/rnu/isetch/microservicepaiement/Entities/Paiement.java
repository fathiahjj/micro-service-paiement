package tn.rnu.isetch.microservicepaiement.Entities;

import com.sun.istack.NotNull;

import javax.persistence.*;

@Entity
public class Paiement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotNull
    @Column(unique = true)
    private Long code;
    @NotNull
    private Long idFacture;

    public Paiement(Long code, Long idFacture) {
        this.code = code;
        this.idFacture = idFacture;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCode() {
        return code;
    }

    public void setCode(Long code) {
        this.code = code;
    }

    public Long getIdFacture() {
        return idFacture;
    }

    public void setIdFacture(Long idFacture) {
        this.idFacture = idFacture;
    }
}
