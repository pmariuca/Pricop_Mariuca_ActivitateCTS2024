package classes;

public class AutobuzLinieBuilder implements Builder {
    private AutobuzLinie autobuzLinie;

    public AutobuzLinieBuilder() {
        this.autobuzLinie = new AutobuzLinie("",  "");
    }

    public AutobuzLinieBuilder setModelAutobuz(String modelAutobuz) {
        this.autobuzLinie.setModelAutobuz(modelAutobuz);
        return this;
    }

    public AutobuzLinieBuilder setSofer(String sofer) {
        this.autobuzLinie.setSofer(sofer);
        return this;
    }

    public AutobuzLinieBuilder setOpritiLaCapatLinie(boolean opritiLaCapatLinie) {
        this.autobuzLinie.setOpritiLaCapatLinie(opritiLaCapatLinie);
        return this;
    }

    public AutobuzLinieBuilder setUsiAutomate(boolean usiAutomate) {
        this.autobuzLinie.setUsiAutomate(usiAutomate);
        return this;
    }

    public AutobuzLinieBuilder setTextAfisare(String textAfisare) {
        this.autobuzLinie.setTextAfisare(textAfisare);
        return this;
    }

    @Override
    public AutobuzLinie build() {
        return this.autobuzLinie;
    }
}
