package ParaFarm;

public class Proion {

	private String onoma;
	private String katigoria;
	private double timi;
	private int diathesimiPosotita;
	private int orioAsfaleias;

	public Proion(String onoma, String katigoria, double timi, int diathesimiPosotita, int orioAsfaleias) {

		this.onoma = onoma;
		this.katigoria = katigoria;
		this.timi = timi;
		this.diathesimiPosotita = diathesimiPosotita;
		this.orioAsfaleias = orioAsfaleias;

		System.out.println("Object " + onoma + " has been created");
	}

	public String getOnoma() {
		return onoma;
	}

	public double getTimi() {
		return timi;
	}

	public int getDiathesimiPosotita() {
		return diathesimiPosotita;
	}

	public int getOrioAsfaleias() {
		return orioAsfaleias;
	}

	public void meiosiApothematos(int posotita) {
		this.diathesimiPosotita -= posotita;
	}

	public void afxiisiApothematos(int posotita) {
		this.diathesimiPosotita += posotita;
	}

	public void printData() {
		System.out.println("Προϊόν: " + onoma + " | Κατηγορία: " + katigoria + " | Τιμή: " + timi + "€"
				+ " | Διαθέσιμο: " + diathesimiPosotita + " | Όριο Ασφαλείας: " + orioAsfaleias);
	}
}