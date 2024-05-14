package clase.obiect;

public class Bilet implements BiletAbstract {
    private int id;
    private String dataExpirare;

    public Bilet(int id, String dataExpirare) {
        this.id = id;
        this.dataExpirare = dataExpirare;
    }

    @Override
    public void printeazaBilet() {
        System.out.println("Bilet: id = " + this.id + ", data expirare = " + this.dataExpirare);
    }

    @Override
    public int getId() {
        return this.id;
    }

    @Override
    public String getDataExpirare() {
        return this.dataExpirare;
    }
}
