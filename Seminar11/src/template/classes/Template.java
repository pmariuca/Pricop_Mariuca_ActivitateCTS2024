package template.classes;

public abstract class Template {
    public final void internare(Pacient pacient){
        analizaSanatate(pacient);
        int nrPaturi = disponibilitatePaturi();
        if(nrPaturi > 0) {
            emitereFisa(pacient);
        } else {
            refuzaInternare(pacient);
        }
    };
    protected abstract void analizaSanatate(Pacient pacient);
    protected abstract int disponibilitatePaturi();
    protected abstract void emitereFisa(Pacient pacient);
    protected abstract void refuzaInternare(Pacient pacient);
}
