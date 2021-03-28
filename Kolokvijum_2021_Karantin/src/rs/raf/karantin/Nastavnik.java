package rs.raf.karantin;

public final class Nastavnik extends UcesnikSastanka {

    public Nastavnik(String korisnickoIme) {
        super(korisnickoIme);
    }

    @Override
    public void ucestvuj(Sastanak sastanak) {
        sastanak.dodajUcesnika(this);
    }

    @Override
    public void napusti(Sastanak sastanak) {
        sastanak.ukloniUcesnika(this);
    }
}
