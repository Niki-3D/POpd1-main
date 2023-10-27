package z3;

public class Postac {
    private int punktyZycia;

    public Postac(int punktyZycia) {
        this.punktyZycia = punktyZycia;
    }

    public int getPunktyZycia() {
        return punktyZycia;
    }

    public void otrzymajObrazenia(int obrazenia) {
        punktyZycia -= obrazenia;
    }
}
