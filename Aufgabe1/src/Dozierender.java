import java.util.ArrayList;
import java.util.List;

public class Dozierender {
    private String name;
    private String fakultaet;
    private String bueronummer;

    // Für Aufgabe 3: Speicher für Anfragen und Feedback
    private List<String> sprechstundenAnfragen;
    private List<String> feedbackListe;

    public Dozierender(String name, String fakultaet, String bueronummer) {
        this.name = name;
        this.fakultaet = fakultaet;
        this.bueronummer = bueronummer;
        this.sprechstundenAnfragen = new ArrayList<>();
        this.feedbackListe = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    // Aufgabe 2
    public String frageBeantworten(Studierender student, String frage) {
        return "Antwort von " + name + " an " + student.getName() + ": " + frage;
    }

    // Aufgabe 3
    public void empfangeSprechstundenanfrage(Studierender student, String grund, String terminwunsch) {
        String anfrage = "Student: " + student.getName() +
                         ", Grund: " + grund +
                         ", Terminwunsch: " + terminwunsch;
        sprechstundenAnfragen.add(anfrage);
    }

    public void empfangeFeedback(Studierender student, String feedbackText) {
        String feedback = "Feedback von " + student.getName() + ": " + feedbackText;
        feedbackListe.add(feedback);
    }
}
