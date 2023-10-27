package z4;

public class Slowacja extends Panstwo implements PanstwoEuropejskie {
    public Slowacja() {
        super("Bratysława", 5450421);
    }

    @Override
    public Kontynent getKontynent() {
        return Kontynent.EUROPA;
    }
}
