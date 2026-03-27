public class Dozierender {

    private String name;
	private String fakultaet;
	private int bueronummer;

      public Dozierender(String name, String fakulteat, int bueronummer){
        this.name = name;
        this.bueronummer = bueronummer;
        this.fakulteat = fakulteat;
    }
	
	public Dozierender(String name, String fakulteat, int bueronummer){
		this.name = name;
		this.bueronummer = bueronummer;
		this.fakultaet = fakulteat;
	}

	public String getName() {
		return name;
	}
	
	/*public void frageBeantworten () {
		System.out.println ("Antwort von " + name + ":");
		String antwort = Input.readString();
	}*/
	
	public void frageBeantworten (Studierender student, String antwort) {
		System.out.println ("Antwort von " + name + " auf Frage von " + student.getName() + ":");
		System.out.println (antwort);
	}
	
	public void feedback(Studierender student) {
		System.out.println ("Feedbackanfrage von " + name + " an " + student.getName() + ":");
		System.out.println ("Was könnte Ich an meinem Unterricht verbessern?");
	}
	
	public void vorlesunghinzufügen (Lehrveranstaltung lv, Vorlesungsstunde vs) {
		lv.addVorlesungsstunde(vs);
	}
	
	public void praktikumhinzufügen (Lehrveranstaltung lv, Praktikumsstunde ps) {
		lv.addPraktikumsstunde(ps);
	}

	public void einschreiben (Lehrveranstaltung lv) {
		lv.addDozierender(this);
	}
	
	public void auschreiben (Lehrveranstaltung lv) {
		lv.removeDozierender(this);
	}
}
