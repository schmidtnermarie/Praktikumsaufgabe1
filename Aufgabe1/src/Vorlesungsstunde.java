public class Vorlesungsstunde {
    private String thema;
    private String datum;
    private String uhrzeit;
    private String raum;

    public Vorlesungsstunde(String thema, String datum, String uhrzeit, String raum) {
        this.thema = thema;
        this.datum = datum;
        this.uhrzeit = uhrzeit;
        this.raum = raum;
    }

    public void zeigeDetails() {
        System.out.println("Vorlesung: " + thema + ", " + datum + ", " + uhrzeit + ", " + raum);
    }
}