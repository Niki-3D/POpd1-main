package z2;

public abstract class ImienneZwierze extends Zwierze {
    private String imie;

    public ImienneZwierze(int ileNog, int wiek, String imie) {
        super(ileNog, wiek);
        this.imie = imie;
    }

    public String getImie() {
        return imie;
    }
}
