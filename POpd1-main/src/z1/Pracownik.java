package z1;

class Pracownik {
    private Pracownik przezlozony;
    private int pensja;

    public Pracownik(Pracownik przezlozony, int pensja) {
        this.przezlozony = przezlozony;
        this.pensja = pensja;
    }

    public Pracownik(Pracownik przezlozony) {
        this.przezlozony = przezlozony;
        this.pensja = obliczPensje(przezlozony);
    }

    public int getPensja() {
        return pensja;
    }

    public Pracownik getPrzelozony() {
        return przezlozony;
    }

    private int obliczPensje(Pracownik przezlozony) {
        if (przezlozony != null) {
            int pensjaPrzezlozonego = przezlozony.getPensja();
            return (int) (0.9 * pensjaPrzezlozonego);
        } else {
            return 3600;
        }
    }
}
