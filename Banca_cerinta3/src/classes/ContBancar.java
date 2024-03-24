package classes;

public class ContBancar {
    private boolean primesteSalariu;
    private boolean cardAtasat;
    private boolean internetBanking;

    public ContBancar(boolean primesteSalariu, boolean cardAtasat, boolean internetBanking) {
        this.primesteSalariu = primesteSalariu;
        this.cardAtasat = cardAtasat;
        this.internetBanking = internetBanking;
    }

    @Override
    public String toString() {
        return "ContBancar{" +
                "primesteSalariu=" + primesteSalariu +
                ", cardAtasat=" + cardAtasat +
                ", internetBanking=" + internetBanking +
                '}';
    }

    public static class ContBancarBuilder implements Builder {
        private boolean primesteSalariu;
        private boolean cardAtasat;
        private boolean internetBanking;

        public ContBancarBuilder() {
            this.primesteSalariu = false;
            this.cardAtasat = false;
            this.internetBanking = false;
        }

        public ContBancarBuilder setPrimesteSalariu(boolean primesteSalariu) {
            this.primesteSalariu = primesteSalariu;
            return this;
        }

        public ContBancarBuilder setCardAtasat(boolean cardAtasat) {
            this.cardAtasat = cardAtasat;
            return this;
        }

        public ContBancarBuilder setInternetBanking(boolean internetBanking) {
            this.internetBanking = internetBanking;
            return this;
        }

        @Override
        public ContBancar build() {
            return new ContBancar(this.primesteSalariu, this.cardAtasat, this.internetBanking);
        }
    }
}
