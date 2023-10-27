package z4;

public class Niemcy extends Panstwo implements PanstwoEuropejskie {
    public Niemcy() {
        super("Berlin", 83000000);
    }

    @Override
    public Kontynent getKontynent() {
        return Kontynent.EUROPA;
    }
}
