package com.example.demo.service;

public class Echantillon {

        int nbrVoitures;
        int prixMoyen;
    
        public Echantillon(){}
    
        public Echantillon(int nbrVoitures, int prixMoyen) {
            this.nbrVoitures = nbrVoitures;
            this.prixMoyen = prixMoyen;
        }
    
        public int getNbrVoitures() {
            return nbrVoitures;
        }
    
        public void setNbrVoitures(int nbrVoitures) {
            this.nbrVoitures = nbrVoitures;
        }
    
        public int getPrixMoyen() {
            return prixMoyen;
        }
    
        public void setPrixMoyen(int prixMoyen) {
            this.prixMoyen = prixMoyen;
        }

}

