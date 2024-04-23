package observer.classes.subject;

public class Sala extends Subject {
    String numeSala;

    public Sala(String numeSala) {
        this.numeSala = numeSala;
    }

    @Override
    public void notificaMeciFotbal() {
        trimiteNotificare("Va avea loc un meci de fotbal in data de 24.04.2024 la ora 11:00.");
    }

    @Override
    public void notificaMeciVolei() {
        trimiteNotificare("Va avea loc un meci de volei in data de 25.04.2024 la ora 13:00.");
    }

    @Override
    public void notificaMeciHandbal() {
        trimiteNotificare("Va avea loc un meci de handbal in data de 23.04.2024 la ora 18:00.");
    }
}
