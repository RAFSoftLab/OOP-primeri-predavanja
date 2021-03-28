package rs.raf.karantin;

public abstract class UcesnikSastanka {

    private String korisnickoIme;

    public UcesnikSastanka(String korisnickoIme) {
        this.korisnickoIme = korisnickoIme;
    }

    abstract void ucestvuj(Sastanak sastanak);
    abstract void napusti(Sastanak sastanak);

    public String getKorisnickoIme() {
        return korisnickoIme;
    }

    @Override
    public String toString() {
        return getKorisnickoIme();
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof UcesnikSastanka) {
            UcesnikSastanka ucesnik = (UcesnikSastanka) obj;
            return ucesnik.getKorisnickoIme().equals(getKorisnickoIme());
        }

        return false;
    }
}
