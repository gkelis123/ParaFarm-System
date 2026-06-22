package ParaFarm;

public class ParaggeliaPromitheyti {

	private String id;
	private Proion proion;
	private int posotita;
	private String logosDimiourgias;

	public ParaggeliaPromitheyti(String id, Proion proion, int posotita, String logosDimiourgias) {

		this.id = id;
		this.proion = proion;
		this.posotita = posotita;
		this.logosDimiourgias = logosDimiourgias;

		proion.afxiisiApothematos(posotita);

		System.out.println("Object " + id + " has been created");
	}

	public void printData() {

		System.out.println("Παραγγελία Προμηθευτή: " + id + " | Προϊόν: " + proion.getOnoma() + " | Ποσότητα: "
				+ posotita + " | Λόγος: " + logosDimiourgias);
	}
}