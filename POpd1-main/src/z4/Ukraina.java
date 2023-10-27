package z4;

public class Ukraina extends Panstwo implements PanstwoEuropejskie {
    public Ukraina() {
        super("Kijów", 44354783);
    }

    @Override
    public Kontynent getKontynent() {
        return Kontynent.EUROPA;
    }
}
