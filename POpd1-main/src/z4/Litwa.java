package z4;

public class Litwa extends Panstwo implements PanstwoEuropejskie {
    public Litwa() {
        super("Wilno", 2790419);
    }

    @Override
    public Kontynent getKontynent() {
        return Kontynent.EUROPA;
    }
}
