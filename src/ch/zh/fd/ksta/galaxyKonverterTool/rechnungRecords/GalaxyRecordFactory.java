package ch.zh.fd.ksta.galaxyKonverterTool.rechnungRecords;

import java.io.BufferedReader;
import java.io.IOException;

public class GalaxyRecordFactory {

	private BufferedReader reader;


	public GalaxyRecordFactory(BufferedReader reader) {
		this.reader = reader;
	}

	public GalaxyRecord nextRecord() {
		try {
			String line = reader.readLine();
			if(line != null) {
				if(line.length() == 0) {
					return new GalaxyEmptyRecord();
				}
				else if(line.startsWith("INT")) {
					return new GalaxyInterchangeHeaderRecord();
				}
				else if(line.startsWith("SNA")) {
					return new GalaxySteuerdatenHeaderRecord();
				}
				else if(line.startsWith("SNE")) {
					return new GalaxySteuerdatenFooterRecord();
				}
				else if(line.startsWith("INE")) {
					return new GalaxyInterchangeFooterRecord();
				}
				else if((line.length() > 6) && (line.substring(6, 7).equals("1"))) {
					return new GalaxyRechnungsRecord(line);
				}
				else if((line.length() > 6) && (line.substring(6, 7).equals("2"))) {
					return new GalaxyRechnungsDetailRecord(line);
				}
				else if((line.length() > 6) && (line.substring(6, 7).equals("3"))) {
					return new GalaxyRechnungsDetailRecord(line);
				}
				else if((line.length() > 6) && (line.substring(6, 7).equals("4"))) {
					return new GalaxyRechnungsDetailRecord(line);
				}
				else if((line.length() > 6) && (line.substring(6, 7).equals("5"))) {
					return new GalaxyRechnungsDetailRecord(line);
				}
				else if((line.length() > 6) && (line.substring(6, 7).equals("6"))) {
					return new GalaxyRechnungsDetailRecord(line);
				}
				else {
					throw new IllegalArgumentException("Unknown record:" + line);
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}

}
