public class Studierender {
 	
    private String name;
	private String studiengang;
	private int matrikelnummer;

	public Studierender(String name, int matrikelnummer, String studiengang){
		this.name = name;
		this.matrikelnummer = matrikelnummer;
		this.studiengang = studiengang;
	}

	public String getName() {
		return name;
	}
	
	/*public void frageStellen (Dozierender dozent) {
		System.out.println ("Frage von " + name + " an " + dozent + ":");
		String frage = Input.readString();
		dozent.frageBeantworten();
	}*/
	
	public void frageStellen (Dozierender dozent, String frage) {
		System.out.println ("Frage von " + name + " an " + dozent.getName() + ":");
		System.out.println (frage);
	}
	
	public void sprechstundenAnfrage (Dozierender dozent, String datum, String uhrzeit) {
		System.out.println ("Sprechstundenanfrage von " + name + " an " + dozent.getName() + ":");
		System.out.println ("Bitte um eine Sprechstunde am " + datum + " um " + uhrzeit + " Uhr");
	}
	
	public void einschreiben (Lehrveranstaltung lv) {
		lv.addStudierende(this);
	}
	
	public void auschreiben (Lehrveranstaltung lv) {
		lv.removeStudierende(this);
	}
}
