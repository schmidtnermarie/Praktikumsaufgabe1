public class Praktikumsstunde {
    private String thema;
    private String datum;
    private String uhrzeit;
    private String raum;
    private String aufgaben;   // einfache Beschreibung

    public Praktikumsstunde(String thema, String datum, String uhrzeit, String raum, String aufgaben) {
        this.thema = thema;
        this.datum = datum;
        this.uhrzeit = uhrzeit;
        this.raum = raum;
        this.aufgaben = aufgaben;
    }

    public void zeigeDetails() {
        System.out.println("Praktikum: " + thema + ", " + datum + ", " + uhrzeit + ", " + raum);
        System.out.println("Aufgaben: " + aufgaben);
    }
}
