import java.util.ArrayList;
import java.util.List;

public class Studierender {
    private String name;
    private int matrikelnummer;
    private String studiengang;

    public Studierender(String name, int matrikelnummer, String studiengang) {
        this.name = name;
        this.matrikelnummer = matrikelnummer;
        this.studiengang = studiengang;
    }

    public String getName() {
        return name;
    }

    // Aufgabe 2
    public String frageStellen(Dozierender dozent, String frage) {
        return dozent.frageBeantworten(this, frage);
    }

    // Aufgabe 3
    public void sendeSprechstundenanfrage(Dozierender dozent, String grund, String terminwunsch) {
        dozent.empfangeSprechstundenanfrage(this, grund, terminwunsch);
    }

    public void sendeFeedback(Dozierender dozent, String feedbackText) {
        dozent.empfangeFeedback(this, feedbackText);
    }
}