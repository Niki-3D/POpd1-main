package z3;

public class Smok extends Postac implements Walczaca {
    public Smok() {
        super(1000);
    }

    @Override
    public void atakuj(Postac przeciwnik) {
        przeciwnik.otrzymajObrazenia(100);
    }
}


