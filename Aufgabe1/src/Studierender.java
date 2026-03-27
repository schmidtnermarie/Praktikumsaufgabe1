public class Studierender {

    private String name;
    private int matrikelnummer;
    private String studiengang;

    public Studierende(String name, int matrikelnummer, String studiengang){
        this.name = name;
        this.matrikelnummer = matrikelnummer;
        this.studiengang = studiengang;
    }

    public String getName(){
        return this.name;
    }

    public void frageStellen(Dozierender dozierender, String frage){
        System.out.println(this.name + "frage:" + frage);
  

    }

    public void sprechstundenanfrage(Dozierender dozierender, String anfrage){
        

    }

    public void anmeldungLehrveranstaltung(Lehrveranstaltung lehrveranstaltung){
        lehrveranstaltung.studierendenHinzufügen(this);
    }

}
