package classes;

import classes.builder.Builder;

public class Bicicleta implements IBicicleta {
    private String numeModel;
    private double pret;
    private double diametruRoti;
    private String tipFrana;
    private boolean cascaProtectie;
    private boolean ochelari;

    public Bicicleta(String numeModel, double pret) {
        this.numeModel = numeModel;
        this.pret = pret;

        this.diametruRoti = 0.0;
        this.tipFrana = "";
        this.cascaProtectie = false;
        this.ochelari = false;
    }

    public Bicicleta(String numeModel, double pret, double diametruRoti, String tipFrana, boolean cascaProtectie, boolean ochelari) {
        this.numeModel = numeModel;
        this.pret = pret;
        this.diametruRoti = diametruRoti;
        this.tipFrana = tipFrana;
        this.cascaProtectie = cascaProtectie;
        this.ochelari = ochelari;
    }

    public void setNumeModel(String numeModel) {
        this.numeModel = numeModel;
    }

    public void setPret(double pret) {
        this.pret = pret;
    }

    public void setDiametruRoti(double diametruRoti) {
        this.diametruRoti = diametruRoti;
    }

    public void setTipFrana(String tipFrana) {
        this.tipFrana = tipFrana;
    }

    public void setCascaProtectie(boolean cascaProtectie) {
        this.cascaProtectie = cascaProtectie;
    }

    public void setOchelari(boolean ochelari) {
        this.ochelari = ochelari;
    }

    @Override
    public String toString() {
        return "Bicicleta{" +
                "numeModel='" + numeModel + '\'' +
                ", pret=" + pret +
                ", diametruRoti=" + diametruRoti +
                ", tipFrana='" + tipFrana + '\'' +
                ", cascaProtectie=" + cascaProtectie +
                ", ochelari=" + ochelari +
                '}';
    }

    @Override
    public void afiseazaDetalii() {
        System.out.println("Bicicleta " + this.numeModel + " are pretul " + this.pret + " lei si urmatoarele: diametru roti - " + this.diametruRoti + " mm, tip frana - " + this.tipFrana + ", casca - " + this.cascaProtectie + ", ochelari - " + this.ochelari);
    }

    public static class BicicletaBuilder implements Builder {
        private String numeModel;
        private double pret;
        private double diametruRoti;
        private String tipFrana;
        private boolean cascaProtectie;
        private boolean ochelari;

        public BicicletaBuilder setNumeModel(String numeModel) {
            this.numeModel = numeModel;
            return this;
        }

        public BicicletaBuilder setPret(double pret) {
            this.pret = pret;
            return this;
        }

        public BicicletaBuilder setDiametruRoti(double diametruRoti) {
            this.diametruRoti = diametruRoti;
            return this;
        }

        public BicicletaBuilder setTipFrana(String tipFrana) {
            this.tipFrana = tipFrana;
            return this;
        }

        public BicicletaBuilder setCascaProtectie(boolean cascaProtectie) {
            this.cascaProtectie = cascaProtectie;
            return this;
        }

        public BicicletaBuilder setOchelari(boolean ochelari) {
            this.ochelari = ochelari;
            return this;
        }

        @Override
        public Bicicleta build() {
            return new Bicicleta(this.numeModel, this.pret, this.diametruRoti, this.tipFrana, this.cascaProtectie, this.ochelari);
        }
    }
}
