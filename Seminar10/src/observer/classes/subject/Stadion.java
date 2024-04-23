package observer.classes.subject;

public class Stadion extends Subject {
    String numeStadion;

    public Stadion(String numeStadion) {
        this.numeStadion = numeStadion;
    }

    @Override
    public void notificaMeciFotbal() {
        trimiteNotificare("Va avea loc un meci de fotbal in data de 24.04.2024 la ora 11:00.");
    }

    @Override
    public void notificaMeciVolei() {
        trimiteNotificare("Va avea loc un meci de fotbal in data de 24.04.2024 la ora 11:00.");
    }

    @Override
    public void notificaMeciHandbal() {
        trimiteNotificare("Va avea loc un meci de fotbal in data de 24.04.2024 la ora 11:00.");
    }

    public void notificaConcert() {
        trimiteNotificare("Va avea loc un concert in data de 27.04.2024 la ora 20:00.");
    }
}
