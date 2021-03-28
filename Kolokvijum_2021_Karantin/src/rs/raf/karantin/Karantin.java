package rs.raf.karantin;

public class Karantin {

    public static void main(String[] args) {
        // Nastavnici x2
        Nastavnik bojana = new Nastavnik("Bojana");
        Nastavnik dragan = new Nastavnik("Dragan");

        // Sastanci x3
        Sastanak uup = new Sastanak("Uvod u programiranje", 9, 11);
        uup.setDomacin(dragan);
        CentralniRegistar.getRegistar().zakaziSastanak(uup);

        Sastanak oop = new Sastanak("Objektno-orijentisano programiranje", 10, 12);
        oop.setDomacin(bojana);
        CentralniRegistar.getRegistar().zakaziSastanak(oop);

        Sastanak fp = new Sastanak("Funkcionalno programiranje", 13, 15);
        fp.setDomacin(bojana);
        CentralniRegistar.getRegistar().zakaziSastanak(fp);

        // Studenti x3
        Student lazar = new Student("Lazar");
        lazar.ucestvuj(oop);

        Student stefan = new Student("Stefan");
        stefan.ucestvuj(uup);
        stefan.ucestvuj(oop);

        Student nemanja = new Student("Nemanja");
        nemanja.ucestvuj(uup);
        nemanja.ucestvuj(oop);
        nemanja.ucestvuj(fp);
        nemanja.napusti(fp);

        // Pokretanje i zavrsavanje sastanaka
        CentralniRegistar.getRegistar().pokreniSastanak(uup, dragan);
        CentralniRegistar.getRegistar().zavrsiSastanak(uup, dragan);

        CentralniRegistar.getRegistar().pokreniSastanak(oop, bojana);
        CentralniRegistar.getRegistar().zavrsiSastanak(oop, bojana);

        // Stampanje izvestaja o prisustvu
        CentralniRegistar.getRegistar().stampajPrisustvoSortirano();
    }
}
