import java.util.ArrayList;
import java.util.List;

public class Lehrveranstaltung {
    private String titel;
    private Dozierender dozent;
    private List<Studierender> teilnehmer;
    private List<Vorlesungsstunde> vorlesungsstunden;
    private List<Praktikumsstunde> praktikumsstunden;

    public Lehrveranstaltung(String titel, Dozierender dozent) {
        this.titel = titel;
        this.dozent = dozent;
        this.teilnehmer = new ArrayList<>();
        this.vorlesungsstunden = new ArrayList<>();
        this.praktikumsstunden = new ArrayList<>();
    }

    public void addStudierender(Studierender s) {
        teilnehmer.add(s);
    }

    public void removeStudierender(Studierender s) {
        teilnehmer.remove(s);
    }

    public void addVorlesungsstunde(Vorlesungsstunde v) {
        vorlesungsstunden.add(v);
    }

    public void addPraktikumsstunde(Praktikumsstunde p) {
        praktikumsstunden.add(p);
    }

    public void zeigeDetails() {
        System.out.println("Lehrveranstaltung: " + titel);
        System.out.println("Dozent: " + dozent.getName());
        System.out.println("Teilnehmer (" + teilnehmer.size() + "):");
        for (Studierender s : teilnehmer) {
            System.out.println(" - " + s.getName());
        }
        System.out.println("Vorlesungsstunden:");
        for (Vorlesungsstunde v : vorlesungsstunden) {
            v.zeigeDetails();
        }
        System.out.println("Praktikumsstunden:");
        for (Praktikumsstunde p : praktikumsstunden) {
            p.zeigeDetails();
        }
    }
}
