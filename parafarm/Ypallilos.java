package ParaFarm;

public class Ypallilos {

	private String onoma;
	private String rolos;
	private String typosLogariasmou;

	public Ypallilos(String onoma, String rolos, String typosLogariasmou) {

		this.onoma = onoma;
		this.rolos = rolos;
		this.typosLogariasmou = typosLogariasmou;

		System.out.println("Object " + onoma + " has been created");
	}

	public String getOnoma() {
		return onoma;
	}

	public String getRolos() {
		return rolos;
	}

	public String getTyposLogariasmou() {
		return typosLogariasmou;
	}

	public void printData() {
		System.out.println("Υπάλληλος: " + onoma + " | Ρόλος: " + rolos + " | Λογαριασμός: " + typosLogariasmou);
	}
}