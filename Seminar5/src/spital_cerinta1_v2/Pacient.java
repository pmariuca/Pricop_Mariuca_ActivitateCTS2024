package spital_cerinta1_v2;

public class Pacient {
    private boolean patRabatabil;
    private boolean micDejun;
    private boolean papuciCamera;
    private boolean halatInterior;

    public Pacient(boolean patRabatabil, boolean micDejun, boolean papuciCamera, boolean halatInterior) {
        this.patRabatabil = patRabatabil;
        this.micDejun = micDejun;
        this.papuciCamera = papuciCamera;
        this.halatInterior = halatInterior;
    }

    @Override
    public String toString() {
        return "Pacient{" +
                "patRabatabil=" + patRabatabil +
                ", micDejun=" + micDejun +
                ", papuciCamera=" + papuciCamera +
                ", halatInterior=" + halatInterior +
                '}';
    }

    public static class PacientBuilder implements Builder {
        private boolean patRabatabil;
        private boolean micDejun;
        private boolean papuciCamera;
        private boolean halatInterior;

        public PacientBuilder() {
            this.patRabatabil = false;
            this.micDejun = false;
            this.papuciCamera = false;
            this.halatInterior = false;
        }

        public PacientBuilder setPatRabatabil(boolean patRabatabil) {
            this.patRabatabil = patRabatabil;
            return this;
        }

        public PacientBuilder setMicDejun(boolean micDejun) {
            this.micDejun = micDejun;
            return this;
        }

        public PacientBuilder setPapuciCamera(boolean papuciCamera) {
            this.papuciCamera = papuciCamera;
            return this;
        }

        public PacientBuilder setHalatInterior(boolean halatInterior) {
            this.halatInterior = halatInterior;
            return this;
        }

        @Override
        public Pacient build() {
            return new Pacient(this.patRabatabil, this.micDejun, this.papuciCamera, this.halatInterior);
        }
    }
}
