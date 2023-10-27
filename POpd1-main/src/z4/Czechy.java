package z4;

public class Czechy extends Panstwo implements PanstwoEuropejskie {
    public Czechy() {
        super("Praga", 10610000);
    }

    @Override
    public Kontynent getKontynent() {
        return Kontynent.EUROPA;
    }
}
