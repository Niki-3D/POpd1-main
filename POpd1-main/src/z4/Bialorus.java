package z4;

public class Bialorus extends Panstwo implements PanstwoEuropejskie {
    public Bialorus() {
        super("Mińsk", 9498700);
    }

    @Override
    public Kontynent getKontynent() {
        return Kontynent.EUROPA;
    }
}
