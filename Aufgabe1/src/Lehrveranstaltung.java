public class Lehrveranstaltung {


    private String titel;
    private Dozierender[] dozierende= new Dozierender[10];
    private Studierende[] studierende = new Studierende[150];
    private Vorlesungsstunde[] vorlesungsstunden = new Vorlesungsstunde[24];
    private Praktikumsstunde[] praktikumsstunden = new Praktikumsstunde[24];

    public Lehrveranstaltung(String titel, Dozierender[] dozierende){
        this.titel = titel;
        this.dozierende = dozierende;
    }

    public void studierendenHinzufügen(Studierende studierender){
        for(int i = 0; i<studierende.length; i++){
            if(studierende[i] == null){
                studierende[i] = studierender;
                return;
            }
        }
        System.out.print("Anzahl der Teilnehmer ist voll");

    }

    public void studierendenEntfernen(Studierende studierender){
        for(int i = 0; i<studierende.length; i++){
            if(studierender != null && studierende[i].equals(studierender)){
                studierende[i] = null;
                return;
            }
        }
        System.out.println("Der Student ist nicht in die Verantaltung eingeschrieben");

    }

    public void praktikumsstundeHinzufügen(Praktikumsstunde praktikumsstunde){
            for(int i = 0; i<praktikumsstunden.length; i++){
            if(praktikumsstunden[i] == null){
                praktikumsstunden[i] = praktikumsstunde;
                return;
            }
        }
        System.out.print("Anzahl der Praktikumsstunden ist voll");


    }

    public void vorlesungsstundeHinzufügen(Vorlesungsstunde vorlesungsstunde){
        for(int i = 0; i<vorlesungsstunden.length; i++){
            if(vorlesungsstunden[i] == null){
                vorlesungsstunden[i] = vorlesungsstunde;
                return;
            }
        }
        System.out.print("Anzahl der Vorlesungsstunden ist voll");
    }

    
    public void detailsAnzeigen(){
        System.out.println("-----------------------------------");
        System.out.println("Lehrveranstaltung:" + this.titel);
        System.out.print("Dozierende:");    
        for(Dozierender dozierender : dozierende){
             System.out.print(dozierender.getName());    
        }
        System.out.println();
        System.out.print("Teilnehmerliste:");
        for(Studierende studierender : studierende){
             System.out.print(studierender.getName());    
        }
        System.out.println();
        System.out.print("Vorlesungsstunden:");
        for(Vorlesungsstunde vorlesungsstunde : vorlesungsstunden){
             System.out.print(vorlesungsstunde.getThema());    
        }
        System.out.println();
        
        System.out.print("Praktikumsstunden:");
        for(Praktikumsstunde praktikumsstunde : praktikumsstunden){
             System.out.print(praktikumsstunde.getThema());    
        }
        System.out.println();
    }
}
