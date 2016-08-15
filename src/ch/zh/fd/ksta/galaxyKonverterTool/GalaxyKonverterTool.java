package ch.zh.fd.ksta.galaxyKonverterTool;

import ch.zh.fd.ksta.galaxyKonverterTool.Arguments;
import ch.zh.fd.ksta.galaxyKonverterTool.GalaxyKonverterProcessor;

public class GalaxyKonverterTool {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			Arguments arguments = new Arguments(args);
			GalaxyKonverterProcessor processor = new GalaxyKonverterProcessor(arguments);
			processor.process();
		}
		catch(IllegalArgumentException ex) {
			printUsage();
		}
	}

	private static void printUsage() {
		System.out.println("Liest ein Galaxy Konverter-File und erzeugt daraus ein CSV mit den einzelnen");
		System.out.println("Rechnungsdaten und ein CSV mit der Statistik.");
		System.out.println();
		System.out.println("java -jar GalaxyKonverterTool.jar [Laufwerk:][Pfad][Dateiname]");
		System.out.println("  [/SE:encoding]");
		System.out.println();
		System.out.println("  [Laufwerk:][Pfad][Dateiname]");
		System.out.println("             Bezeichnet Laufwerk, Verzeichnis und/oder Dateien.");
		System.out.println();
		System.out.println("  /SE         Source Encoding (z.B. ISO_8859_1, CP850, ...)");
		System.out.println();
	}

}
