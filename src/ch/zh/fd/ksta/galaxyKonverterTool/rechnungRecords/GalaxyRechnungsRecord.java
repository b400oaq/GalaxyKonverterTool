package ch.zh.fd.ksta.galaxyKonverterTool.rechnungRecords;

public class GalaxyRechnungsRecord extends GalaxyIBESTRecord {

	private String recordNummer;
	private String fallNummer;
	private String recordArt;
	private String arbeitgeberNummer;
	private String telefon;
	private String sachbearbeiter;
	private String sachbearbeiter2;
	private String rechnungsNummer;
	private String rechnungsDatum;
	private String bezeichnung;
	private String periodeVon;
	private String periodeBis;
	private String esrBetrag;
	private String esrReferenznummer;
	private String esrTeilnehmernummer;
	private String esrAnschrift1;
	private String esrAnschrift2;
	private String esrAnschrift3;
	private String esrAnschrift4;
	private String zahlbarBis;

	private int[] fieldEndPos = {6, 7, 50, 52, 67, 82, 112, 142, 152, 162, 242, 252, 262, 272, 273, 300, 309, 339, 369, 399, 429, 439}; 

	public GalaxyRechnungsRecord(String line) {
		recordNummer = line.substring(0, fieldEndPos[0]);
		fallNummer = line.substring(fieldEndPos[0], fieldEndPos[1]);

		recordArt = line.substring(fieldEndPos[2], fieldEndPos[3]);
		arbeitgeberNummer = line.substring(fieldEndPos[3], fieldEndPos[4]);
		telefon = line.substring(fieldEndPos[4], fieldEndPos[5]);
		sachbearbeiter = line.substring(fieldEndPos[5], fieldEndPos[6]);
		sachbearbeiter2 = line.substring(fieldEndPos[6], fieldEndPos[7]);
		rechnungsNummer = line.substring(fieldEndPos[7], fieldEndPos[8]);
		rechnungsDatum = line.substring(fieldEndPos[8], fieldEndPos[9]);
		bezeichnung = line.substring(fieldEndPos[9], fieldEndPos[10]);
		periodeVon = line.substring(fieldEndPos[10], fieldEndPos[11]);
		periodeBis = line.substring(fieldEndPos[11], fieldEndPos[12]);
		esrBetrag = line.substring(fieldEndPos[12], fieldEndPos[13]);
		esrBetrag = line.substring(fieldEndPos[12], fieldEndPos[13]-2) + "." + line.substring(fieldEndPos[13]-2, fieldEndPos[13]);

		esrReferenznummer = line.substring(fieldEndPos[14], fieldEndPos[15]);
		esrTeilnehmernummer = line.substring(fieldEndPos[15], fieldEndPos[16]);
		esrAnschrift1 = line.substring(fieldEndPos[16], fieldEndPos[17]);
		esrAnschrift2 = line.substring(fieldEndPos[17], fieldEndPos[18]);
		esrAnschrift3 = line.substring(fieldEndPos[18], fieldEndPos[19]);
		esrAnschrift4 = line.substring(fieldEndPos[19], fieldEndPos[20]);
		zahlbarBis = line.substring(fieldEndPos[20], fieldEndPos[21]);
	}

	public static String csvHeader() {
		String csv = "\"RecordNummer\";" +
		           "\"FallNummer\";" + 
		           "\"RecordArt\";" + 
		           "\"ArbeitgeberNummer\";" + 
		           "\"Telefon\";" + 
		           "\"Sachbearbeiter\";" + 
		           "\"Sachbearbeiter2\";" + 
		           "\"rechnungsNummer\";" + 
		           "\"RechnungsDatum\";" + 
		           "\"Bezeichnung\";" + 
		           "\"PeriodeVon\";" + 
		           "\"PeriodeBis\";" + 
		           "\"EsrBetrag\";" + 
		           "\"EsrReferenznummer\";" + 
		           "\"EsrTeilnehmernummer\";" + 
		           "\"EsrAnschrift1\";" + 
		           "\"EsrAnschrift2\";" + 
		           "\"EsrAnschrift3\";" + 
		           "\"EsrAnschrift4\";" + 
		           "\"ZahlbarBis\"";
		return csv;
	}

	public String toCSV() {
		String csv = "\"" + getRecordNummer() + "\";" +
		           "\"" + getFallNummer() + "\";" + 
		           "\"" + getRecordArt() + "\";" + 
		           "\"" + getArbeitgeberNummer() + "\";" + 
		           "\"" + getTelefon() + "\";" + 
		           "\"" + getSachbearbeiter() + "\";" + 
		           "\"" + getSachbearbeiter2() + "\";" + 
		           "\"" + getRechnungsNummer() + "\";" + 
		           "\"" + getRechnungsDatum() + "\";" + 
		           "\"" + getBezeichnung() + "\";" + 
		           "\"" + getPeriodeVon() + "\";" + 
		           "\"" + getPeriodeBis() + "\";" + 
		           "\"" + getEsrBetrag() + "\";" + 
		           "\"" + getEsrReferenznummer() + "\";" + 
		           "\"" + getEsrTeilnehmernummer() + "\";" + 
		           "\"" + getEsrAnschrift1() + "\";" + 
		           "\"" + getEsrAnschrift2() + "\";" + 
		           "\"" + getEsrAnschrift3() + "\";" + 
		           "\"" + getEsrAnschrift4() + "\";" + 
		           "\"" + getZahlbarBis() + "\""; 
		return csv;
	}

	public String getRecordNummer() {
		return recordNummer;
	}

	public void setRecordNummer(String recordNummer) {
		this.recordNummer = recordNummer;
	}

	public String getFallNummer() {
		return fallNummer;
	}

	public void setFallNummer(String fallNummer) {
		this.fallNummer = fallNummer;
	}

	public String getRecordArt() {
		return recordArt;
	}

	public void setRecordArt(String recordArt) {
		this.recordArt = recordArt;
	}

	public String getArbeitgeberNummer() {
		return arbeitgeberNummer;
	}

	public void setArbeitgeberNummer(String arbeitgeberNummer) {
		this.arbeitgeberNummer = arbeitgeberNummer;
	}

	public String getTelefon() {
		return telefon;
	}

	public void setTelefon(String telefon) {
		this.telefon = telefon;
	}

	public String getSachbearbeiter() {
		return sachbearbeiter;
	}

	public void setSachbearbeiter(String sachbearbeiter) {
		this.sachbearbeiter = sachbearbeiter;
	}

	public String getSachbearbeiter2() {
		return sachbearbeiter2;
	}

	public void setSachbearbeiter2(String sachbearbeiter2) {
		this.sachbearbeiter2 = sachbearbeiter2;
	}

	public String getRechnungsNummer() {
		return rechnungsNummer;
	}

	public void setRechnungsNummer(String rechnungsNummer) {
		this.rechnungsNummer = rechnungsNummer;
	}

	public String getRechnungsDatum() {
		return rechnungsDatum;
	}

	public void setRechnungsDatum(String rechnungsDatum) {
		this.rechnungsDatum = rechnungsDatum;
	}

	public String getBezeichnung() {
		return bezeichnung;
	}

	public void setBezeichnung(String bezeichnung) {
		this.bezeichnung = bezeichnung;
	}

	public String getPeriodeVon() {
		return periodeVon;
	}

	public void setPeriodeVon(String periodeVon) {
		this.periodeVon = periodeVon;
	}

	public String getPeriodeBis() {
		return periodeBis;
	}

	public void setPeriodeBis(String periodeBis) {
		this.periodeBis = periodeBis;
	}

	public String getEsrBetrag() {
		return esrBetrag;
	}

	public void setEsrBetrag(String esrBetrag) {
		this.esrBetrag = esrBetrag;
	}

	public String getEsrReferenznummer() {
		return esrReferenznummer;
	}

	public void setEsrReferenznummer(String esrReferenznummer) {
		this.esrReferenznummer = esrReferenznummer;
	}

	public String getEsrTeilnehmernummer() {
		return esrTeilnehmernummer;
	}

	public void setEsrTeilnehmernummer(String esrTeilnehmernummer) {
		this.esrTeilnehmernummer = esrTeilnehmernummer;
	}

	public String getEsrAnschrift1() {
		return esrAnschrift1;
	}

	public void setEsrAnschrift1(String esrAnschrift1) {
		this.esrAnschrift1 = esrAnschrift1;
	}

	public String getEsrAnschrift2() {
		return esrAnschrift2;
	}

	public void setEsrAnschrift2(String esrAnschrift2) {
		this.esrAnschrift2 = esrAnschrift2;
	}

	public String getEsrAnschrift3() {
		return esrAnschrift3;
	}

	public void setEsrAnschrift3(String esrAnschrift3) {
		this.esrAnschrift3 = esrAnschrift3;
	}

	public String getEsrAnschrift4() {
		return esrAnschrift4;
	}

	public void setEsrAnschrift4(String esrAnschrift4) {
		this.esrAnschrift4 = esrAnschrift4;
	}

	public String getZahlbarBis() {
		return zahlbarBis;
	}

	public void setZahlbarBis(String zahlbarBis) {
		this.zahlbarBis = zahlbarBis;
	}

	public int[] getFieldEndPos() {
		return fieldEndPos;
	}

	public void setFieldEndPos(int[] fieldEndPos) {
		this.fieldEndPos = fieldEndPos;
	}

}
