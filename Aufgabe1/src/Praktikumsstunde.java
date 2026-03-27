public class Praktikumsstunde {

        private String thema;
	private String datum;
	private String uhrzeit;
	private String raum;
	private String[] aufgaben;
	
	public String getThema() {
		return thema;
	}
	
	public void details () {
		System.out.println ("Thema: " + thema);
		System.out.println ("Datum: " + datum);
		System.out.println ("Uhrzeit: " + uhrzeit);
		System.out.println ("Raum: " + raum);
		System.out.println ("Aufgaben: ");
		
		for (int i = 0; i < aufgaben.length; i++) {
            if (aufgaben[i] == null) {
            	System.out.println (aufgaben [i]);
            }
        }
	}
}
