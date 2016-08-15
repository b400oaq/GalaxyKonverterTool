package ch.zh.fd.ksta.galaxyKonverterTool.rechnungRecords;

public class GalaxyRechnungsDetailRecord extends GalaxyIBESTRecord {

	private String sachbearbeiter;
	private String sachbearbeiterTelefon;
	private String agNummer;
	private String abrechnungsPeriode;
	private String anrede;
	private String adresszeile1;
	private String adresszeile2;
	private String adresszeile3;
	private String plzOrt;
	private String rechnungsNummer;
	private String datum;
	private String typ;
	private String zahlbarBis;
	private String rechnungsBetrag;
	private String bruttoBetrag;
	private String bezugsProvisionBetrag;
	private String revisionBetrag;
	private String einschaetzungBetrag;
	private String verzugszinsBetrag;
	private String kostenBetrag;
	private String[] verrechnungGutschriftBetrag = new String[4];
	private String[] verrechnungGutschriftDatum = new String[4];
	private String esrBetrag;
	private String esrReferenz;

	private int gutschriftBetragCounter = 0;

	public GalaxyRechnungsDetailRecord(String line) {
//		recordNummer = line.substring(0, fieldEndPos[0]);
//		fallNummer = line.substring(fieldEndPos[0], fieldEndPos[1]);
//
//		recordArt = line.substring(fieldEndPos[2], fieldEndPos[3]);
//		arbeitgeberNummer = line.substring(fieldEndPos[3], fieldEndPos[4]);
//		telefon = line.substring(fieldEndPos[4], fieldEndPos[5]);
//		sachbearbeiter = line.substring(fieldEndPos[5], fieldEndPos[6]);
//		sachbearbeiter2 = line.substring(fieldEndPos[6], fieldEndPos[7]);
//		rechnungsNummer = line.substring(fieldEndPos[7], fieldEndPos[8]);
//		rechnungsDatum = line.substring(fieldEndPos[8], fieldEndPos[9]);
//		bezeichnung = line.substring(fieldEndPos[9], fieldEndPos[10]);
//		periodeVon = line.substring(fieldEndPos[10], fieldEndPos[11]);
//		periodeBis = line.substring(fieldEndPos[11], fieldEndPos[12]);
//		esrBetrag = line.substring(fieldEndPos[12], fieldEndPos[13]);
//		esrReferenznummer = line.substring(fieldEndPos[13], fieldEndPos[14]);
//		esrTeilnehmernummer = line.substring(fieldEndPos[14], fieldEndPos[15]);
//		esrAnschrift1 = line.substring(fieldEndPos[15], fieldEndPos[16]);
//		esrAnschrift2 = line.substring(fieldEndPos[16], fieldEndPos[17]);
//		esrAnschrift3 = line.substring(fieldEndPos[17], fieldEndPos[18]);
//		esrAnschrift4 = line.substring(fieldEndPos[18], fieldEndPos[19]);
//		zahlbarBis = line.substring(fieldEndPos[19], fieldEndPos[20]);
	}
	public static String csvHeader() {
		String csv = "\"AG-Nummer\";" +
		           "\"RechnungsNummer\";" + 
		           "\"AbrechnungsPeriode\";" + 
		           "\"RechnungsDatum\";" + 
		           "\"ZahlbarBis\";" + 
		           "\"Typ\";" + 
		           "\"RechungsBetrag\";" + 
		           "\"BruttoBetrag\";" + 
		           "\"Bezugsprovision\";" + 
		           "\"Revision\";" + 
		           "\"Einschätzung\";" + 
		           "\"Verrechnung1\";" + 
		           "\"Verrechnung2\";" + 
		           "\"Verrechnung3\";" + 
		           "\"Verrechnung4\";" + 
		           "\"Verrechnung1Datum\";" + 
		           "\"Verrechnung2Datum\";" + 
		           "\"Verrechnung3Datum\";" + 
		           "\"Verrechnung4Datum\";" + 
		           "\"ESR-Betrag\";" + 
		           "\"ESR-Referenz\";" + 
		           "\"Anrede\";" + 
		           "\"Adresszeile1\";" + 
		           "\"Adresszeile2\";" + 
		           "\"Adresszeile3\";" + 
		           "\"PLZ/Ort\";" + 
		           "\"SachbearbeiterName\";" + 
		           "\"SachbearbeiterTelefon\"";
		return csv;
	}

	public String toCSV() {
		String csv = "\"" + getAgNummer() + "\";" +
		           "\"" + getRechnungsNummer() + "\";" + 
		           "\"" + getAbrechnungsPeriode() + "\";" + 
		           "\"" + getDatum() + "\";" + 
		           "\"" + getZahlbarBis() + "\";" + 
		           "\"" + getTyp() + "\";" + 
		           "\"" + getRechnungsBetrag() + "\";" + 
		           "\"" + getBruttoBetrag() + "\";" + 
		           "\"" + getBezugsProvisionBetrag() + "\";" + 
		           "\"" + getRevisionBetrag() + "\";" + 
		           "\"" + getEinschaetzungBetrag() + "\";" + 
		           "\"" + getVerrechnungGutschriftBetrag(0) + "\";" + 
		           "\"" + getVerrechnungGutschriftBetrag(1) + "\";" + 
		           "\"" + getVerrechnungGutschriftBetrag(2) + "\";" + 
		           "\"" + getVerrechnungGutschriftBetrag(3) + "\";" + 
		           "\"" + getVerrechnungGutschriftDatum(0) + "\";" + 
		           "\"" + getVerrechnungGutschriftDatum(1) + "\";" + 
		           "\"" + getVerrechnungGutschriftDatum(2) + "\";" + 
		           "\"" + getVerrechnungGutschriftDatum(3) + "\";" + 
		           "\"" + getESRBetrag() + "\";" + 
		           "\"" + getESRReferenz() + "\";" + 
		           "\"" + getAnrede() + "\";" + 
		           "\"" + getAdresszeile1() + "\";" + 
		           "\"" + getAdresszeile2() + "\";" + 
		           "\"" + getAdresszeile3() + "\";" + 
		           "\"" + getPlzOrt() + "\";" + 
		           "\"" + getSachbearbeiter() + "\";" + 
		           "\"" + getSachbearbeiterTelefon() + "\""; 
		return csv;
	}

	public String getSachbearbeiter() {
		return (sachbearbeiter != null) ? sachbearbeiter : "";
	}

	public void setSachbearbeiter(String sachbearbeiter) {
		this.sachbearbeiter = sachbearbeiter;
	}

	public String getSachbearbeiterTelefon() {
		return (sachbearbeiterTelefon != null) ? sachbearbeiterTelefon : "";
	}

	public void setSachbearbeiterTelefon(String sachbearbeiterTelefon) {
		this.sachbearbeiterTelefon = sachbearbeiterTelefon;
	}

	public String getAgNummer() {
		return (agNummer != null) ? agNummer : "";
	}

	public void setAgNummer(String agNummer) {
		this.agNummer = agNummer;
	}

	public String getAbrechnungsPeriode() {
		return (abrechnungsPeriode != null) ? abrechnungsPeriode : "";
	}

	public void setAbrechnungsPeriode(String abrechnungsPeriode) {
		this.abrechnungsPeriode = abrechnungsPeriode;
	}

	public String getAnrede() {
		return (anrede != null) ? anrede : "";
	}

	public void setAnrede(String anrede) {
		this.anrede = anrede;
	}

	public String getAdresszeile1() {
		return (adresszeile1 != null) ? adresszeile1 : "";
	}

	public void setAdresszeile1(String adresszeile1) {
		this.adresszeile1 = adresszeile1;
	}

	public String getAdresszeile2() {
		return (adresszeile2 != null) ? adresszeile2 : "";
	}

	public void setAdresszeile2(String adresszeile2) {
		this.adresszeile2 = adresszeile2;
	}

	public String getAdresszeile3() {
		return (adresszeile3 != null) ? adresszeile3 : "";
	}

	public void setAdresszeile3(String adresszeile3) {
		this.adresszeile3 = adresszeile3;
	}

	public String getPlzOrt() {
		return (plzOrt != null) ? plzOrt : "";
	}

	public void setPlzOrt(String plzOrt) {
		this.plzOrt = plzOrt;
	}

	public String getRechnungsNummer() {
		return (rechnungsNummer != null) ? rechnungsNummer : "";
	}

	public void setRechnungsNummer(String rechnungsNummer) {
		this.rechnungsNummer = rechnungsNummer;
	}

	public String getDatum() {
		return (datum != null) ? datum : "";
	}

	public void setDatum(String datum) {
		this.datum = datum;
	}

	public String getTyp() {
		return (typ != null) ? typ : "";
	}

	public void setTyp(String typ) {
		this.typ = typ;
	}

	public String getZahlbarBis() {
		return (zahlbarBis != null) ? zahlbarBis : "";
	}

	public void setZahlbarBis(String zahlbarBis) {
		this.zahlbarBis = zahlbarBis;
	}

	public String getRechnungsBetrag() {
		return (rechnungsBetrag != null) ? rechnungsBetrag : "";
	}

	public void setRechnungsBetrag(String rechnungsBetrag) {
		this.rechnungsBetrag = rechnungsBetrag;
	}

	public String getBruttoBetrag() {
		return (bruttoBetrag != null) ? bruttoBetrag : "";
	}

	public void setBruttoBetrag(String bruttoBetrag) {
		this.bruttoBetrag = bruttoBetrag;
	}

	public String getBezugsProvisionBetrag() {
		return (bezugsProvisionBetrag != null) ? bezugsProvisionBetrag : "";
	}

	public void setBezugsProvisionBetrag(String bezugsProvisionBetrag) {
		this.bezugsProvisionBetrag = bezugsProvisionBetrag;
	}

	public String getRevisionBetrag() {
		return (revisionBetrag != null) ? revisionBetrag : "";
	}

	public void setRevisionBetrag(String revisionBetrag) {
		this.revisionBetrag = revisionBetrag;
	}

	public String getEinschaetzungBetrag() {
		return (einschaetzungBetrag != null) ? einschaetzungBetrag : "";
	}

	public void setEinschaetzungBetrag(String einschaetzungBetrag) {
		this.einschaetzungBetrag = einschaetzungBetrag;
	}

	public String getVerzugszinsBetrag() {
		return verzugszinsBetrag;
	}

	public void setVerzugszinsBetrag(String verzugszinsBetrag) {
		this.verzugszinsBetrag = verzugszinsBetrag;
	}

	public String getKostenBetrag() {
		return kostenBetrag;
	}

	public void setKostenBetrag(String kostenBetrag) {
		this.kostenBetrag = kostenBetrag;
	}

	public String getVerrechnungGutschriftBetrag(int i) {
		return (verrechnungGutschriftBetrag[i] != null) ? verrechnungGutschriftBetrag[i] : "";
	}

	public void addVerrechnungGutschriftBetrag(String verrechnungGutschriftBetrag) {
		this.verrechnungGutschriftBetrag[gutschriftBetragCounter++] = verrechnungGutschriftBetrag;
	}

	public String getVerrechnungGutschriftDatum(int i) {
		return (verrechnungGutschriftDatum[i] != null) ? verrechnungGutschriftDatum[i] : "";
	}

	public void addVerrechnungGutschriftDatum(String verrechnungGutschriftDatum) {
		this.verrechnungGutschriftDatum[gutschriftBetragCounter-1] = verrechnungGutschriftDatum;
	}

	public String getESRBetrag() {
		return (esrBetrag != null) ? esrBetrag : "";
	}

	public void setESRBetrag(String esrBetrag) {
		this.esrBetrag = esrBetrag;
	}

	public String getESRReferenz() {
		return (esrReferenz != null) ? esrReferenz : "";
	}

	public void setESRReferenz(String esrReferenz) {
		this.esrReferenz = esrReferenz;
	}

}
