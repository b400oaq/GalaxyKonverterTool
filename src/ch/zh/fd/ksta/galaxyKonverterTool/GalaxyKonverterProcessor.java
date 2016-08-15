package ch.zh.fd.ksta.galaxyKonverterTool;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

import ch.zh.fd.ksta.galaxyKonverterTool.rechnungRecords.GalaxyEmptyRecord;
import ch.zh.fd.ksta.galaxyKonverterTool.rechnungRecords.GalaxyInterchangeFooterRecord;
import ch.zh.fd.ksta.galaxyKonverterTool.rechnungRecords.GalaxyInterchangeHeaderRecord;
import ch.zh.fd.ksta.galaxyKonverterTool.rechnungRecords.GalaxyRechnungsRecord;
import ch.zh.fd.ksta.galaxyKonverterTool.rechnungRecords.GalaxyRecord;
import ch.zh.fd.ksta.galaxyKonverterTool.rechnungRecords.GalaxyRecordFactory;
import ch.zh.fd.ksta.galaxyKonverterTool.rechnungRecords.GalaxySteuerdatenFooterRecord;
import ch.zh.fd.ksta.galaxyKonverterTool.rechnungRecords.GalaxySteuerdatenHeaderRecord;

public class GalaxyKonverterProcessor {

	private Arguments arguments;

	public GalaxyKonverterProcessor(Arguments arguments) {
		this.arguments = arguments;
	}

	public void process() {
		BufferedReader reader = null;
		BufferedWriter writer = null;
		try {
			reader = new BufferedReader(new InputStreamReader(new FileInputStream(arguments.getSourceFileName()), arguments.getSourceFileEncoding()));
			writer = new BufferedWriter(new FileWriter(arguments.getSourceFileName() + ".csv"));

			writer.write(GalaxyRechnungsRecord.csvHeader());
			writer.newLine();

			GalaxyRecord record;
			GalaxyRecordFactory recordFactory = new GalaxyRecordFactory(reader); 
//			GalaxySummaryRecord summaryRecord = null;
			while((record = recordFactory.nextRecord()) != null) {
				if(record instanceof GalaxyEmptyRecord) {
					// ignore
				}
				else if(record instanceof GalaxyInterchangeHeaderRecord) {
					// ignore
				}
				else if(record instanceof GalaxyInterchangeHeaderRecord) {
					// ignore
				}
				else if(record instanceof GalaxySteuerdatenHeaderRecord) {
					// ignore
				}
				else if(record instanceof GalaxySteuerdatenFooterRecord) {
					// ignore
				}
				else if(record instanceof GalaxyInterchangeFooterRecord) {
					// ignore
				}
				else if(record instanceof GalaxyRechnungsRecord) {
					writer.write(((GalaxyRechnungsRecord)record).toCSV());
					writer.newLine();
				}
//				else if(record instanceof GalaxySummaryRecord) {
//					summaryRecord = (GalaxySummaryRecord)record;
//				}
			}
			writer.close();

//			if(summaryRecord == null) {
//				throw new IllegalArgumentException("Kein Total Record vorhanden");
//			}
//			else {
//				writer = new BufferedWriter(new FileWriter(arguments.getSourceFileName() + ".total.csv"));
//				writer.write(GalaxySummaryRecord.csvHeader());
//				writer.newLine();
//				writer.write(summaryRecord.toCSV());
//				writer.newLine();
//				writer.close();
//			}

		} catch (FileNotFoundException e) {
			System.out.println("File konnte nicht geöffnet werden (" + e.getMessage() + ")");
		} catch (IOException e) {
			System.out.println("Fehler beim Filezugriff (" + e.getMessage() + ")");
		} catch (Exception e) {
			System.out.println("Fehler beim formatieren");
			e.printStackTrace();
		}
		finally {
			try {
				writer.close();
			} catch (IOException e) {}
		}
	}

}
