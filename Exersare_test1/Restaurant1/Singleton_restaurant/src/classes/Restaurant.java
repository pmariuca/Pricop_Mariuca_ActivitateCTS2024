package classes;

public class Restaurant {
    private String nume;
    private String locatie;
    private static Restaurant instanta;

    private Restaurant(String nume, String locatie) {
        this.nume = nume;
        this.locatie = locatie;
    }

    @Override
    public String toString() {
        return "Restaurant{" +
                "nume='" + nume + '\'' +
                ", locatie='" + locatie + '\'' +
                '}';
    }

    public static Restaurant getInstanta(String nume, String locatie) {
        if(instanta == null) {
            instanta = new Restaurant(nume, locatie);
        }

        return instanta;
    }
}
