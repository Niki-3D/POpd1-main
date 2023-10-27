package z3;

public class Druid extends Postac implements Leczaca, Walczaca {
    private int mana;

    public Druid(int punktyZycia, int mana) {
        super(punktyZycia);
        this.mana = mana;
    }

    public int getMana() {
        return mana;
    }

    @Override
    public void wylecz(Postac pacjent) {
        if (mana >= 10) {
            pacjent.otrzymajObrazenia(-200);
            mana -= 10;
        }
    }

    @Override
    public void atakuj(Postac przeciwnik) {
        przeciwnik.otrzymajObrazenia(1);
    }
}




