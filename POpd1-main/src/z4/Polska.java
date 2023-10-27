package z4;

public class Polska extends Panstwo implements PanstwoEuropejskie {
    public Polska() {
        super("Warszawa", 37750000);
    }

    @Override
    public Kontynent getKontynent() {
        return Kontynent.EUROPA;
    }
}
