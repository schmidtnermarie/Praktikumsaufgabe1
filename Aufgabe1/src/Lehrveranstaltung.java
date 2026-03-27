public class Lehrveranstaltung {

    private String titel;
	private Dozierender [] dozierende = new Dozierender [100];
	private Studierender [] studierende = new Studierender [100];
	private Vorlesungsstunde [] vorlesungsstunden = new Vorlesungsstunde [24];
	private Praktikumsstunde [] praktikumsstunden = new Praktikumsstunde [24];
	
	public Lehrveranstaltung(String titel){
		this.titel = titel;
	}

	public void addStudierende (Studierender person){
        for (int i = 0; i < studierende.length; i++) {
            if (studierende[i] == null) {
            	studierende[i] = person;
            	System.out.println ("Du hast dich erfolgreich eingeschrieben");
                return;
            }
        }
        System.out.println ("Die Lehrveranstaltung ist bereits ausgebucht");
    }

	public void removeStudierende (Studierender person){
        for (int i = 0; i < studierende.length; i++) {
        	 if (studierende [i] != null && studierende[i].equals(person)) {
            	studierende[i] = null;
            	System.out.println ("Du hast dich ausgeschrieben");
                return;
            }
        }
        System.out.println ("Der Studierende kann aufgrund fehlender Einschreibung nicht ernfernt werden");
    }
	
	public void addDozierender (Dozierender person){
        for (int i = 0; i < dozierende.length; i++) {
            if (studierende[i] == null) {
            	dozierende[i] = person;
            	System.out.println ("Du hast dich erfolgreich eingeschrieben");
                return;
            }
        }
        System.out.println ("Die Lehrveranstaltung ist bereits ausgebucht");
    }

	public void removeDozierender (Dozierender person){
        for (int i = 0; i < dozierende.length; i++) {
        	 if (dozierende [i] != null && dozierende[i].equals(person)) {
            	dozierende[i] = null;
            	System.out.println ("Du hast dich ausgeschrieben");
                return;
            }
        }
        System.out.println ("Der Studierende kann aufgrund fehlender Einschreibung nicht ernfernt werden");
    }

	public void addVorlesungsstunde (Vorlesungsstunde stunde){
		for (int i = 0; i < vorlesungsstunden.length; i++) {
            if (vorlesungsstunden[i] == null) {
            	vorlesungsstunden[i] = stunde;
            	System.out.println ("Vorlesungsstunde hinzugefügt");
                return;
            }
        }
        System.out.println ("Die Lehrveranstaltung ist bereits voll");
	}
	
	public void addPraktikumsstunde (Praktikumsstunde stunde){
		for (int i = 0; i < praktikumsstunden.length; i++) {
            if (praktikumsstunden[i] == null) {
            	praktikumsstunden[i] = stunde;
            	System.out.println ("Praktikumsstunde hinzugefügt");
                return;
            }
        }
        System.out.println ("Die Lehrveranstaltung ist bereits voll");
	}
	
	public void details (){
		
		System.out.println ("Titel: " + titel);
		
		System.out.println ("");
		
		System.out.println ("Dozierende: ");
		for (int i = 0; i < dozierende.length; i++) {
			 if (dozierende[i] != null) {
				 System.out.println (dozierende[i].getName());
			 }
		}
		
		System.out.println ("");
		
		System.out.println ("Teilnehmer: ");
		for (int i = 0; i < studierende.length; i++) {
			 if (studierende[i] != null) {
				 System.out.println (studierende[i].getName());
			 }
		}
		
		System.out.println ("");

		System.out.println ("Vorlesungen: ");
		for (int i = 0; i < vorlesungsstunden.length; i++) {
			 if (vorlesungsstunden[i] != null) {
				 System.out.println (vorlesungsstunden[i].getThema());
			 }
		}
		
		System.out.println ("");
		
		System.out.println ("Praktika: ");
		for (int i = 0; i < praktikumsstunden.length; i++) {
			 if (praktikumsstunden[i] != null) {
				 System.out.println (praktikumsstunden[i].getThema());
			 }
		}
	}	    
}
