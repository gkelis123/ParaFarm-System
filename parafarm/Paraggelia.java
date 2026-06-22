package ParaFarm;

import java.util.ArrayList;
import java.util.List;

public class Paraggelia {

	private String id;
	private Pelatis pelatis;
	private List<Proion> proionta = new ArrayList<>();
	private List<Integer> posotites = new ArrayList<>();
	private Ypallilos ypallilos;
	private String typosParastatikou; // Τιμολόγιο ή Απόδειξη

	public Paraggelia(String id, Pelatis pelatis, Ypallilos ypallilos) {

		this.id = id;
		this.pelatis = pelatis;
		this.ypallilos = ypallilos;

		if (pelatis.getTyposPelati().equals("Pharmacy")) {
			this.typosParastatikou = "Τιμολόγιο";
		} else {
			this.typosParastatikou = "Απόδειξη";
		}
	}

	public String getId() {
		return id;
	}

	public List<Proion> getProionta() {
		return proionta;
	}

	public List<Integer> getPosotites() {
		return posotites;
	}

	public void prosthikiProiontos(Proion p, int posotita) {
		proionta.add(p);
		posotites.add(posotita);
		p.meiosiApothematos(posotita);
	}

	public void akyrosiParaggelias() {

		for (int i = 0; i < proionta.size(); i++) {
			proionta.get(i).afxiisiApothematos(posotites.get(i));
		}

		System.out.println("Η παραγγελία " + id + " ακυρώθηκε. Τα αποθέματα επιστράφηκαν.");
	}

	public void printData() {

		System.out.println("--- Παραγγελία: " + id + " ---");
		System.out.println("ΑΦΜ Πελάτη: " + pelatis.getAfm());
		System.out.println("Τύπος Παραστατικού: " + typosParastatikou);

		System.out.println("Υπάλληλος Καταχώρησης: " + ypallilos.getOnoma() + " (" + ypallilos.getRolos() + ")");

		System.out.println("Προϊόντα Παραγγελίας:");

		for (int i = 0; i < proionta.size(); i++) {

			System.out.println(" - " + proionta.get(i).getOnoma() + " | Ποσότητα: " + posotites.get(i));
		}
	}
}