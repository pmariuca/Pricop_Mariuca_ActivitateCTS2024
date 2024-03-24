package builder_v2;

public class Rezervare {
    private boolean asezareGeam;
    private boolean scauneErgonomice;
    private boolean decorareMasa;
    private boolean muzicaAmbientalaPersonalizata;
    private boolean genMuzica;

    public Rezervare(boolean asezareGeam, boolean scauneErgonomice, boolean decorareMasa, boolean muzicaAmbientalaPersonalizata, boolean genMuzica) {
        this.asezareGeam = asezareGeam;
        this.scauneErgonomice = scauneErgonomice;
        this.decorareMasa = decorareMasa;
        this.muzicaAmbientalaPersonalizata = muzicaAmbientalaPersonalizata;
        this.genMuzica = genMuzica;
    }

    @Override
    public String toString() {
        return "Rezervare{" +
                "asezareGeam=" + asezareGeam +
                ", scauneErgonomice=" + scauneErgonomice +
                ", decorareMasa=" + decorareMasa +
                ", muzicaAmbientalaPersonalizata=" + muzicaAmbientalaPersonalizata +
                ", genMuzica=" + genMuzica +
                '}';
    }

    public static class RezervareBuilder implements Builder {
        private boolean asezareGeam;
        private boolean scauneErgonomice;
        private boolean decorareMasa;
        private boolean muzicaAmbientalaPersonalizata;
        private boolean genMuzica;

        public RezervareBuilder() {
            this.asezareGeam = false;
            this.scauneErgonomice = false;
            this.decorareMasa = false;
            this.muzicaAmbientalaPersonalizata = false;
            this.genMuzica = false;
        }

        public RezervareBuilder setAsezareGeam(boolean asezareGeam) {
            this.asezareGeam = asezareGeam;
            return this;
        }

        public RezervareBuilder setScauneErgonomice(boolean scauneErgonomice) {
            this.scauneErgonomice = scauneErgonomice;
            return this;
        }

        public RezervareBuilder setDecorareMasa(boolean decorareMasa) {
            this.decorareMasa = decorareMasa;
            return this;
        }

        public RezervareBuilder setMuzicaAmbientalaPersonalizata(boolean muzicaAmbientalaPersonalizata) {
            this.muzicaAmbientalaPersonalizata = muzicaAmbientalaPersonalizata;
            return this;
        }

        public RezervareBuilder setGenMuzica(boolean genMuzica) {
            this.genMuzica = genMuzica;
            return this;
        }

        @Override
        public Rezervare build() {
            return new Rezervare(this.asezareGeam, this.scauneErgonomice, this.decorareMasa, this.muzicaAmbientalaPersonalizata, this.genMuzica);
        }
    }
}
