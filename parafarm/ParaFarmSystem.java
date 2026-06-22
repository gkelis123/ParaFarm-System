package ParaFarm;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		List<Proion> katalogosProionton = new ArrayList<>();
		List<Pelatis> katalogosPelaton = new ArrayList<>();
		List<Ypallilos> katalogosYpallilon = new ArrayList<>();
		List<Paraggelia> katalogosParaggelion = new ArrayList<>();
		List<ParaggeliaPromitheyti> katalogosParaggelionPromitheyti = new ArrayList<>();

		System.out.println("=== ΦΑΣΗ ΑΡΧΙΚΟΠΟΙΗΣΗΣ ΑΝΤΙΚΕΙΜΕΝΩΝ ===");

		// Προϊόντα
		Proion product1 = new Proion("Thermometer", "paramedical", 12.50, 80, 30);
		Proion product2 = new Proion("Shoes", "paramedical", 35.00, 45, 20);
		Proion product3 = new Proion("Cream", "cosmetic", 18.00, 25, 40);
		Proion product4 = new Proion("makeup", "cosmetic", 22.00, 60, 25);

		katalogosProionton.add(product1);
		katalogosProionton.add(product2);
		katalogosProionton.add(product3);
		katalogosProionton.add(product4);

		// Πελάτες
		Pelatis customer1 = new Pelatis("Farmakeio Papadopoulou", "Pharmacy", "099845210", "DOY Kalamarias", "OK");

		Pelatis customer2 = new Pelatis("Farmakeio Nikolaidis", "Pharmacy", "078632145", "DOY Evosmou", "OK");

		Pelatis customer3 = new Pelatis("Georgiou Maria", "Retail", "112233445", "DOY Thessalonikis", "OK");

		katalogosPelaton.add(customer1);
		katalogosPelaton.add(customer2);
		katalogosPelaton.add(customer3);

		// Υπάλληλοι
		Ypallilos employee1 = new Ypallilos("Antoniou", "Warehouse", "warehouse_user");

		Ypallilos employee2 = new Ypallilos("Eleftheriou", "Customer Service", "service_user");

		Ypallilos employee3 = new Ypallilos("Sotiriou", "Cashier", "cashier_user");

		Ypallilos employee4 = new Ypallilos("Seller1", "Sales", "sales_user");

		katalogosYpallilon.add(employee1);
		katalogosYpallilon.add(employee2);
		katalogosYpallilon.add(employee3);
		katalogosYpallilon.add(employee4);

		System.out.println("\n=== ΚΑΤΑΧΩΡΗΣΗ ΠΑΡΑΓΓΕΛΙΩΝ ===");

		// order1
		Paraggelia order1 = new Paraggelia("order1", customer1, employee4);

		order1.prosthikiProiontos(product1, 10);
		order1.prosthikiProiontos(product3, 5);

		katalogosParaggelion.add(order1);

		// order2
		Paraggelia order2 = new Paraggelia("order2", customer1, employee4);

		order2.prosthikiProiontos(product2, 8);
		order2.prosthikiProiontos(product4, 12);

		katalogosParaggelion.add(order2);

		// order3
		Paraggelia order3 = new Paraggelia("order3", customer2, employee4);

		order3.prosthikiProiontos(product3, 20);
		order3.prosthikiProiontos(product4, 10);
		order3.prosthikiProiontos(product1, 6);

		katalogosParaggelion.add(order3);

		// order4
		Paraggelia order4 = new Paraggelia("order4", customer3, employee3);

		order4.prosthikiProiontos(product1, 1);
		order4.prosthikiProiontos(product4, 2);

		katalogosParaggelion.add(order4);

		System.out.println("\n=== ΔΙΑΓΡΑΦΗ ORDER2 ===");

		order2.akyrosiParaggelias();
		katalogosParaggelion.remove(order2);

		System.out.println("\n=== ΕΛΕΓΧΟΣ ΑΠΟΘΕΜΑΤΟΣ ===");

		int counterSupplierOrder = 1;

		for (Proion p : katalogosProionton) {

			if (p.getDiathesimiPosotita() < p.getOrioAsfaleias()) {

				String orderId = "supplierOrder" + counterSupplierOrder;

				String logos = "Το απόθεμα έπεσε κάτω από το όριο ασφαλείας.";

				ParaggeliaPromitheyti spOrder = new ParaggeliaPromitheyti(orderId, p, 50, logos);

				katalogosParaggelionPromitheyti.add(spOrder);

				counterSupplierOrder++;
			}
		}

		System.out.println("\n===== ΚΑΤΑΛΟΓΟΣ ΠΡΟΪΟΝΤΩΝ =====");

		for (Proion p : katalogosProionton) {
			p.printData();
		}

		System.out.println("\n===== ΚΑΤΑΛΟΓΟΣ ΠΕΛΑΤΩΝ =====");

		for (Pelatis p : katalogosPelaton) {
			p.printData();
		}

		System.out.println("\n===== ΚΑΤΑΛΟΓΟΣ ΥΠΑΛΛΗΛΩΝ =====");

		for (Ypallilos y : katalogosYpallilon) {
			y.printData();
		}

		System.out.println("\n===== ΚΑΤΑΛΟΓΟΣ ΠΑΡΑΓΓΕΛΙΩΝ =====");

		for (Paraggelia p : katalogosParaggelion) {
			p.printData();
		}

		System.out.println("\n===== ΚΑΤΑΛΟΓΟΣ ΠΑΡΑΓΓΕΛΙΩΝ ΠΡΟΜΗΘΕΥΤΗ =====");

		for (ParaggeliaPromitheyti p : katalogosParaggelionPromitheyti) {
			p.printData();
		}
	}
}