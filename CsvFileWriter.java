package in.java.pracices;

import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;


/**
 * @author Ccc2607
 * 
 */
public class CsvFileWriter {
	
	//Delimiter used in CSV file
	private static final String COMMA_DELIMITER = ",";
	private static final String NEW_LINE_SEPARATOR = "\n";
	
	//CSV file header
	private static final String FILE_HEADER = "id,firstName,lastName,gender,age";
	static String fileName  ="location to file name";
	public static void main(String arr[]) {
		
		//Create new students objects
		
		Map<String,String>map  = new LinkedHashMap<String,String>();
		
		FileWriter fileWriter = null;
				
		try {
			fileWriter = new FileWriter(fileName);

			//Write the CSV file header
			fileWriter.append(FILE_HEADER.toString());
			
			//Add a new line separator after the header
			fileWriter.append(NEW_LINE_SEPARATOR);
			
			//Write a new student object list to the CSV file
			
			for(int i = 1; i <500000; i++){
				
				fileWriter.append(String.valueOf(i));
				fileWriter.append(COMMA_DELIMITER);

				fileWriter.append("ABC"+i);
				fileWriter.append(COMMA_DELIMITER);

				fileWriter.append("lastname"+i);
				fileWriter.append(COMMA_DELIMITER);

				fileWriter.append("M"+i);
				fileWriter.append(COMMA_DELIMITER);

				fileWriter.append(String.valueOf(i));
				fileWriter.append(NEW_LINE_SEPARATOR);

				}
			
			
			System.out.println("CSV file was created successfully !!!");
			
		} catch (Exception e) {
			System.out.println("Error in CsvFileWriter !!!");
			e.printStackTrace();
		} finally {
			
			try {
				fileWriter.flush();
				fileWriter.close();
			} catch (IOException e) {
				System.out.println("Error while flushing/closing fileWriter !!!");
                e.printStackTrace();
			}
			
		}
	}
}