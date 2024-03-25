package classes;

public class AutobuzLinie {
    private String modelAutobuz;
    private String sofer;
    private boolean opritiLaCapatLinie;
    private boolean usiAutomate;
    private String textAfisare;

    public AutobuzLinie(String modelAutobuz, String sofer) {
        this.modelAutobuz = modelAutobuz;
        this.sofer = sofer;

        this.opritiLaCapatLinie = false;
        this.usiAutomate = false;
        this.textAfisare = "";
    }

    public void setModelAutobuz(String modelAutobuz) {
        this.modelAutobuz = modelAutobuz;
    }

    public void setSofer(String sofer) {
        this.sofer = sofer;
    }

    public void setOpritiLaCapatLinie(boolean opritiLaCapatLinie) {
        this.opritiLaCapatLinie = opritiLaCapatLinie;
    }

    public void setUsiAutomate(boolean usiAutomate) {
        this.usiAutomate = usiAutomate;
    }

    public void setTextAfisare(String textAfisare) {
        this.textAfisare = textAfisare;
    }

    @Override
    public String toString() {
        return "AutobuzLinie{" +
                "modelAutobuz='" + modelAutobuz + '\'' +
                ", sofer='" + sofer + '\'' +
                ", opritiLaCapatLinie=" + opritiLaCapatLinie +
                ", usiAutomate=" + usiAutomate +
                ", textAfisare='" + textAfisare + '\'' +
                '}';
    }
}
