public class Vorlesungsstunde {

	private String thema;
	private String datum;
	private String uhrzeit;
	private String raum;
	
	public String getThema() {
		return thema;
	}
	
	public void details () {
		System.out.println ("Thema: " + thema);
		System.out.println ("Datum: " + datum);
		System.out.println ("Uhrzeit: " + uhrzeit);
		System.out.println ("Raum: " + raum);
	}      
}
