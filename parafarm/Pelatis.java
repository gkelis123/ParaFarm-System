package ParaFarm;

public class Pelatis {

    private String onoma;
    private String typosPelati; // Pharmacy ή Retail
    private String afm;
    private String doy;
    private String katastasi; // OK

    public Pelatis(String onoma, String typosPelati,
                   String afm, String doy, String katastasi) {

        this.onoma = onoma;
        this.typosPelati = typosPelati;
        this.afm = afm;
        this.doy = doy;
        this.katastasi = katastasi;

        System.out.println("Object " + onoma + " has been created");
    }

    public String getOnoma() {
        return onoma;
    }

    public String getAfm() {
        return afm;
    }

    public String getTyposPelati() {
        return typosPelati;
    }

    public String getKatastasi() {
        return katastasi;
    }

    public String getDoy() {
        return doy;
    }

    public void printData() {
        System.out.println(
            "Πελάτης: " + onoma +
            " | Τύπος: " + typosPelati +
            " | ΑΦΜ: " + afm +
            " | ΔΟΥ: " + doy +
            " | Κατάσταση: " + katastasi
        );
    }
}