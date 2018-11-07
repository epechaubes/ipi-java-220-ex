package com.ipiecoles.java.java220;

import org.joda.time.LocalDate;

public class Commercial extends Employe{

    private Double caAnnuel;

    public Double getCaAnnuel() {
        return caAnnuel;
    }

    public void setCaAnnuel(Double caAnnuel) {
        this.caAnnuel = caAnnuel;
    }

    public Commercial(){
    }

    public Commercial(String nom, String prenom, String matricule, LocalDate dateEmbauche, Double salaire, Double caAnnuel){
        super(nom, prenom, matricule, dateEmbauche, salaire);
        this.caAnnuel = caAnnuel;
    }

    public Double getPrimeAnnuelle(Double caAnnuel){
        Double prime = Math.ceil(caAnnuel * 0.05);
        if (prime > 500.0){
            return prime;
        }
        return 500.0;
    }

}
