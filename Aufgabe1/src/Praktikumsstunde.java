public class Praktikumsstunde {

    private String thema; 
    private String datum;
    private String uhrzeit;
    private String raum;
    private String[] aufgaben;
    

    public Praktikumsstunde(String thema, String datum, String uhrzeit, String raum, String[] aufgaben){
        this.thema = thema;
        this.datum = datum;
        this.uhrzeit = uhrzeit;
        this.raum = raum;
        this.aufgaben = aufgaben;
    }

    public String getThema(){
        return this.thema;
    }

    public void details(){
        System.out.println("-----------------------------------");
        System.out.println("Praktukumsstunde:" + this.thema);
        System.out.println("am " + this.datum + " um " + this.uhrzeit+ " Uhr");  
        System.out.println("Raum: " + this.raum); 
        System.out.print("Aufgaben: ");
        for(int i = 0; i < aufgaben.length; i++){
            System.out.print(aufgaben[i]);
        }
        System.out.println();
    }

}
