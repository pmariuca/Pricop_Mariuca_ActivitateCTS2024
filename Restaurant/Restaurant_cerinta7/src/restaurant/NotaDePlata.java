package restaurant;

public class NotaDePlata implements NotaDePlataAbstract {
    private String chelner;
    private double total;

    public NotaDePlata(String chelner, double total) {
        this.chelner = chelner;
        this.total = total;
    }

    @Override
    public void printeazaNota() {
        System.out.println("Nota de plata: ");
        System.out.println("Chelner: " + this.chelner);
        System.out.println("Total de plata: " + this.total);
    }

    @Override
    public String getChelner() {
        return this.chelner;
    }

    @Override
    public double getTotal() {
        return this.total;
    }
}
