package z4;

public class Rosja extends Panstwo implements PanstwoAzjatyckie {
    public Rosja() {
        super("Moskwa", 143400000);
    }

    @Override
    public Kontynent getKontynent() {
        return Kontynent.AZJA;
    }
}
