import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelEinlesen {

	public static void excelEinlesen() throws IOException {
		FileInputStream inputStream = null;

		// Read XSL file
		try {
			inputStream = new FileInputStream(
					new File("Insert Path here..."));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		String verteilerTechnischeAnwendungsverantwortliche = "";
		String verteilerSTVTechnischeAnwendungsverantwortliche = "";
		// Get the workbook instance for XLS file
		XSSFWorkbook workbook = new XSSFWorkbook(inputStream);

		// Get first sheet from the workbook
		XSSFSheet sheet = workbook.getSheetAt(0);

		for (Row row : sheet) {

			if (row.getRowNum() > 0) {
				Cell cell = row.getCell(4);
				Cell cell2 = row.getCell(6);
				String name = "";
				String name2 = "";

				// Change to getCellType() if using POI 4.x
				CellType cellType = cell.getCellTypeEnum();
				CellType cellType2 = cell2.getCellTypeEnum();

				switch (cellType) {
				case _NONE:
					break;
				case BOOLEAN:
					break;
				case BLANK:
					break;
				case FORMULA:
					break;
				case NUMERIC:
					break;
				case STRING:
					String s = cell.getStringCellValue();
					System.out.print(s);
					if (s.matches("FI-TS, Mitarbeiter")) {
						break;
					}
					name = s;
					System.out.print("\t");
					break;
				case ERROR:
					break;
				}

				switch (cellType2) {
				case _NONE:
					break;
				case BOOLEAN:
					break;
				case BLANK:
					break;
				case FORMULA:
					break;
				case NUMERIC:
					break;
				case STRING:
					String s = cell2.getStringCellValue();
					System.out.print(s);
					if (s.matches("FI-TS, Mitarbeiter")) {
						break;
					}
					name2 = s;
					System.out.print("\t");
					break;
				case ERROR:
					break;
				}
				System.out.println();

				if (!verteilerTechnischeAnwendungsverantwortliche.contains(name)) {
					verteilerTechnischeAnwendungsverantwortliche += name;
					verteilerTechnischeAnwendungsverantwortliche += ";";
				}

				if (!verteilerSTVTechnischeAnwendungsverantwortliche.contains(name)) {
					verteilerSTVTechnischeAnwendungsverantwortliche += name2;
					verteilerSTVTechnischeAnwendungsverantwortliche += ";";
				}
			}

		}
		workbook.close();
		System.out.println("Technische Anwendungsverantwortliche:");
		System.out.println(verteilerTechnischeAnwendungsverantwortliche);
		System.out.println();
		System.out.println("Stellvertretende Technische Anwendungsverantwortliche:");
		System.out.println(verteilerSTVTechnischeAnwendungsverantwortliche);

		File file = new File("B:/MailverteilerTechnischeAnwendungsverantwortliche.txt");

		// Create the file
		if (file.createNewFile()) {
			System.out.println("File is created!");
		} else {
			System.out.println("File already exists.");
		}

		// Write Content
		FileWriter writer = new FileWriter(file, false);
		writer.write(verteilerTechnischeAnwendungsverantwortliche);
		writer.close();

		File file2 = new File("B:/MailverteilerStvTechnischeAnwendungsverantwortliche.txt");

		// Create the file
		if (file2.createNewFile()) {
			System.out.println("File is created!");
		} else {
			System.out.println("File already exists.");
		}

		// Write Content
		FileWriter writer2 = new FileWriter(file2, false);
		writer2.write(verteilerSTVTechnischeAnwendungsverantwortliche);
		writer2.close();

	}

	public static void main(String[] args) throws IOException {
		ExcelEinlesen.excelEinlesen();

	}

}
