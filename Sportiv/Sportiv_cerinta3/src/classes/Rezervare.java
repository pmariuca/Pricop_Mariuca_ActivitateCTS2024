package classes;

public class Rezervare {
    private boolean mancareInclusa;
    private boolean scaunErgonomic;
    private boolean bauturaRacoritoareInclusa;
    private boolean muzicaAmbientalaPersonalizata;
    private String genMuzica;

    public Rezervare(boolean mancareInclusa, boolean scaunErgonomic, boolean bauturaRacoritoareInclusa, boolean muzicaAmbientalaPersonalizata, String genMuzica) {
        this.mancareInclusa = mancareInclusa;
        this.scaunErgonomic = scaunErgonomic;
        this.bauturaRacoritoareInclusa = bauturaRacoritoareInclusa;
        this.muzicaAmbientalaPersonalizata = muzicaAmbientalaPersonalizata;
        this.genMuzica = genMuzica;
    }

    public boolean isMancareInclusa() {
        return mancareInclusa;
    }

    public void setMancareInclusa(boolean mancareInclusa) {
        this.mancareInclusa = mancareInclusa;
    }

    public boolean isScaunErgonomic() {
        return scaunErgonomic;
    }

    public void setScaunErgonomic(boolean scaunErgonomic) {
        this.scaunErgonomic = scaunErgonomic;
    }

    public boolean isBauturaRacoritoareInclusa() {
        return bauturaRacoritoareInclusa;
    }

    public void setBauturaRacoritoareInclusa(boolean bauturaRacoritoareInclusa) {
        this.bauturaRacoritoareInclusa = bauturaRacoritoareInclusa;
    }

    public boolean isMuzicaAmbientalaPersonalizata() {
        return muzicaAmbientalaPersonalizata;
    }

    public void setMuzicaAmbientalaPersonalizata(boolean muzicaAmbientalaPersonalizata) {
        this.muzicaAmbientalaPersonalizata = muzicaAmbientalaPersonalizata;
    }

    public String getGenMuzica() {
        return genMuzica;
    }

    public void setGenMuzica(String genMuzica) {
        this.genMuzica = genMuzica;
    }

    @Override
    public String toString() {
        return "Rezervare{" +
                "mancareInclusa=" + mancareInclusa +
                ", scaunErgonomic=" + scaunErgonomic +
                ", bauturaRacoritoareInclusa=" + bauturaRacoritoareInclusa +
                ", muzicaAmbientalaPersonalizata=" + muzicaAmbientalaPersonalizata +
                ", genMuzica='" + genMuzica + '\'' +
                '}';
    }
}
