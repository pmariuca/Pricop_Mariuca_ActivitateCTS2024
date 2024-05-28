package teste.dubluri;

import clase.IPersoana;

public class PersoanaFake implements IPersoana {
    private String valueGetSex;
    private int valueGetVarsta;
    private boolean valueCheckCNP;

    public void setValueGetSex(String valueGetSex) {
        this.valueGetSex = valueGetSex;
    }

    public void setValueGetVarsta(int valueGetVarsta) {
        this.valueGetVarsta = valueGetVarsta;
    }

    public void setValueCheckCNP(boolean valueCheckCNP) {
        this.valueCheckCNP = valueCheckCNP;
    }

    @Override
    public String getSex() {
        return this.valueGetSex;
    }

    @Override
    public int getVarsta() {
        return this.valueGetVarsta;
    }

    @Override
    public boolean checkCNP() {
        return this.valueCheckCNP;
    }
}
