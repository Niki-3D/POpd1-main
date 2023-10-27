package z4;

import java.util.ArrayList;
import java.util.List;

public class Panstwo {
    private String stolica;
    private int liczbaLudnosci;
    private List<Panstwo> sasiedzi;

    public Panstwo(String stolica, int liczbaLudnosci) {
        this.stolica = stolica;
        this.liczbaLudnosci = liczbaLudnosci;
        this.sasiedzi = new ArrayList<>();
    }

    public String getStolica() {
        return stolica;
    }

    public int getLiczbaLudnosci() {
        return liczbaLudnosci;
    }

    public List<Panstwo> getSasiedzi() {
        return sasiedzi;
    }

    public void dodajSasiada(Panstwo sasiad) {
        sasiedzi.add(sasiad);
    }

    public void migruj(Panstwo docelowe, int liczbaEmigrantow) {
        if (liczbaEmigrantow <= liczbaLudnosci) {
            liczbaLudnosci -= liczbaEmigrantow;
            docelowe.liczbaLudnosci += liczbaEmigrantow;
        }
    }
}
