package z2;

public abstract class Zwierze {
    private int ileNog;
    private int wiek;

    public Zwierze(int ileNog, int wiek) {
        this.ileNog = ileNog;
        this.wiek = wiek;
    }

    public int getIleNog() {
        return ileNog;
    }

    public int getWiek() {
        return wiek;
    }
}
