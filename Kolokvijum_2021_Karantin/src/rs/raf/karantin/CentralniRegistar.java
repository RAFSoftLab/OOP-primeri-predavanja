package rs.raf.karantin;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class CentralniRegistar {

    private Set<Sastanak> zakazaniSastanci;
    private Set<Sastanak> odrzaniSastanci;

    private static final CentralniRegistar REGISTAR;

    static {
        REGISTAR = new CentralniRegistar();
    }

    private CentralniRegistar() {
        zakazaniSastanci = new TreeSet<>();
        odrzaniSastanci = new TreeSet<>();
    }

    public static CentralniRegistar getRegistar() {
        return REGISTAR;
    }

    public void zakaziSastanak(Sastanak sastanak) {
        zakazaniSastanci.add(sastanak);
    }

    public void otkaziSastanak(Sastanak sastanak) {
        zakazaniSastanci.remove(sastanak);
    }

    public void pokreniSastanak(Sastanak sastanak, Nastavnik nastavnik) {
        if(!zakazaniSastanci.contains(sastanak)) {
            System.out.println(sastanak + " nije zakazan");
            return;
        }

        if(sastanak.isAktivan()) {
            System.out.println(sastanak + " je vec aktivan");
            return;
        }

        if(!nastavnik.equals(sastanak.getDomacin())) {
            System.out.println(nastavnik + " nije domacin");
            return;
        }

        nastavnik.ucestvuj(sastanak);
        sastanak.setAktivan(true);
    }

    public void zavrsiSastanak(Sastanak sastanak, Nastavnik nastavnik) {
        if(!zakazaniSastanci.contains(sastanak)) {
            System.out.println(sastanak + " nije zakazan");
            return;
        }

        if(!sastanak.isAktivan()) {
            System.out.println(this + " nije aktivan");
            return;
        }

        if(!nastavnik.equals(sastanak.getDomacin())) {
            System.out.println(nastavnik + " nije domacin");
            return;
        }

        odrzaniSastanci.add(sastanak);
        zakazaniSastanci.remove(sastanak);

        sastanak.setAktivan(false);
    }

    public void stampajPrisustvoSortirano() {
        File out = new File("sastanci.txt");
        PrintWriter writer = null;

        try {
            writer = new PrintWriter(out);

            writer.append("Odrzani sastanci: ");
            writer.append(String.valueOf(odrzaniSastanci.size()));
            writer.append("\n");

            writer.append("Zakazani sastanci koji nisu odrzani: ");
            writer.append(String.valueOf(zakazaniSastanci.size()));
            writer.append("\n");

            for(Sastanak sastanak : odrzaniSastanci) {
                writer.append(sastanak.toString());
                writer.append("\n");

                List<Student> studenti = new LinkedList<>();
                UcesnikSastanka nastavnik = null;

                for(UcesnikSastanka ucesnik : sastanak.getUcesnici()) {
                    if(ucesnik instanceof Student) {
                        studenti.add((Student) ucesnik);
                    }else if(ucesnik instanceof Nastavnik) {
                        nastavnik = (Nastavnik) ucesnik;
                    }
                }

                writer.append("Studenti:");

                for(int i = 0; i < studenti.size(); i++) {
                    if(i > 0) {
                        writer.append(",");
                    }

                    writer.append(" ");
                    writer.append(studenti.get(i).toString());
                }

                writer.append("\n");

                if(nastavnik != null) {
                    writer.append("Nastavnik: ");
                    writer.append(nastavnik.toString());
                    writer.append("\n");
                }
            }
        }catch(IOException e) {
            e.printStackTrace();
        }finally {
            if(writer != null) {
                writer.flush();
                writer.close();
            }
        }
    }
}
