public class Vorlesungsstunde {

   private String thema;
    private String datum;
    private String uhrzeit;
    private String raum;

    public Vorlesungsstunde(String thema, String datum, String uhrzeit, String raum){
        this.thema = thema;
        this.datum = datum;
        this.uhrzeit = uhrzeit;
        this.raum = raum;
    }

    public String getThema(){
        return this.thema;
    }

    public void detailsAnzeigen(){
        System.out.println("-----------------------------------");
        System.out.println("Vorlesungsstunde:" + this.thema);
        System.out.println("am " + this.datum + " um " + this.uhrzeit+ " Uhr");  
        System.out.println("Raum: " + this.raum); 
    }

}
