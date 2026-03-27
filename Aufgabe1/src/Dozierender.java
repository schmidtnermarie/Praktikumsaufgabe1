public class Dozierender {
private String name;
    private String fakulteat;
    private int bueronummer;

    public Dozierender(String name, String fakulteat, int bueronummer){
        this.name = name;
        this.bueronummer = bueronummer;
        this.fakulteat = fakulteat;
    }

    public void frageBeantworten(Studierende studie, String antwort){

    }

    public String getName(){
        return this.name;
    }

    public void vorlesungPlanen(Lehrveranstaltung l, Praktikumsstunde p, Vorlesungsstunde v){
        l.praktikumsstundeHinzufügen(p);
        l.vorlesungsstundeHinzufügen(v);
    }
    
}
