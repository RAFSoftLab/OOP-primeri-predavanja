package rs.raf.karantin;

import java.util.*;

public class Sastanak implements Comparable<Sastanak> {

    private String predmet;
    private int satPocetka;
    private int satZavrsetka;
    private Nastavnik domacin;
    private boolean aktivan;
    private List<UcesnikSastanka> ucesnici;

    public Sastanak(String predmet, int satPocetka, int satZavrsetka) {
        this.predmet = predmet;
        this.satPocetka = satPocetka;
        this.satZavrsetka = satZavrsetka;
        this.ucesnici = new LinkedList<>();
    }

    public String getPredmet() {
        return predmet;
    }

    public int getSatPocetka() {
        return satPocetka;
    }

    public int getSatZavrsetka() {
        return satZavrsetka;
    }

    public Nastavnik getDomacin() {
        return domacin;
    }

    public void setDomacin(Nastavnik domacin) {
        this.domacin = domacin;
    }

    public boolean isAktivan() {
        return aktivan;
    }

    public void setAktivan(boolean aktivan) {
        this.aktivan = aktivan;
    }

    public List<UcesnikSastanka> getUcesnici() {
        return ucesnici;
    }

    public void dodajUcesnika(UcesnikSastanka ucesnik) {
        ucesnici.add(ucesnik);
    }

    public void ukloniUcesnika(UcesnikSastanka ucesnik) {
        ucesnici.remove(ucesnik);
    }

    @Override
    public int compareTo(Sastanak s) {
        int pocetak = Integer.compare(satPocetka, s.satPocetka);

        return pocetak != 0 ? pocetak : Integer.compare(satZavrsetka, s.satZavrsetka);
    }

    @Override
    public String toString() {
        return "Sastanak u terminu od " + satPocetka + " do " + satZavrsetka + " iz predmeta " + predmet;
    }
}
