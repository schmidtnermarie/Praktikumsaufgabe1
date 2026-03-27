public class App {
    public static void main(String[] args) throws Exception {
        
        Studierender simon = new Studierender("Simon Buchner", 123456, "UXD");
        Studierender julian = new Studierender("Julian Link", 123457, "UXD");

        String[] aufgaben = {"Git", "Einführung", "OOP"};

        Dozierender nestler = new Dozierender("Simon Nestler", "I", 123);

        Lehrveranstaltung swe2 = new Lehrveranstaltung("SWE2");
        Vorlesungsstunde oop = new Vorlesungsstunde("OOP", "20-5-2026", "12:00", "D114");
        Praktikumsstunde a1 = new Praktikumsstunde("OOP", "20-5-2026", "12:00", "D114", aufgaben);

  

        swe2.addPraktikumsstunde(a1);
        swe2.addVorlesungsstunde(oop);


        julian.einschreiben(swe2);
        simon.einschreiben(swe2);
        simon.auschreiben(swe2);

        nestler.einschreiben(swe2);


        julian.frageStellen(nestler, "Wie gehts?");
        nestler.frageBeantworten(julian, "Gut und dir?");

        julian.sprechstundenAnfrage(nestler, "29.03.2026", "13:00");
        nestler.feedback(julian);




    }
}
