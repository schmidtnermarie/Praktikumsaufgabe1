public class App {
    public static void main(String[] args) {
        // --- Aufgabe 2 & 3 ---
        Studierender max = new Studierender("Max Mustermann", 12345, "Informatik");
        Dozierender prof = new Dozierender("Prof. Dr. Müller", "Informatik", "2.015");

        // Frage stellen
        System.out.println(max.frageStellen(prof, "Was ist Polymorphismus?"));

        // Sprechstundenanfrage und Feedback senden
        max.sendeSprechstundenanfrage(prof, "Hilfe bei Übung 5", "Di 14-15 Uhr");
        max.sendeFeedback(prof, "Die Vorlesung war sehr verständlich.");

        // --- Aufgabe 4 ---
        Lehrveranstaltung swEng2 = new Lehrveranstaltung("Softwareentwicklung 2", prof);

        // Studierende anmelden
        swEng2.addStudierender(max);
        Studierender anna = new Studierender("Anna Schmidt", 67890, "Mathematik");
        swEng2.addStudierender(anna);

        // Stunden hinzufügen
        Vorlesungsstunde v1 = new Vorlesungsstunde("Einführung Git", "01.04.2025", "10:00", "Hörsaal A");
        Vorlesungsstunde v2 = new Vorlesungsstunde("Objektorientierte Konzepte", "08.04.2025", "10:00", "Hörsaal A");
        Praktikumsstunde p1 = new Praktikumsstunde("Git Übung", "03.04.2025", "14:00", "Poolraum 1", "Repository anlegen, Branches");
        Praktikumsstunde p2 = new Praktikumsstunde("Java Grundlagen", "10.04.2025", "14:00", "Poolraum 1", "Klassen und Objekte");

        swEng2.addVorlesungsstunde(v1);
        swEng2.addVorlesungsstunde(v2);
        swEng2.addPraktikumsstunde(p1);
        swEng2.addPraktikumsstunde(p2);

        // Details anzeigen
        swEng2.zeigeDetails();

        // Teilnehmer entfernen
        swEng2.removeStudierender(max);
        swEng2.zeigeDetails();
    }
}
