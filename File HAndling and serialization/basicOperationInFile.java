import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;


public class basicOperationInFile {
	private static final String FILE_PATH = "C:\\Users\\User\\eclipse-workspace\\FileHandling and serialization\\src\\input.txt";
	public static void main(String[] args) throws FileNotFoundException {
		    File file = new File(FILE_PATH);
	        FileInputStream fileInputStream = new FileInputStream(file);
	        InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
	        try (BufferedReader bufferedReader = new BufferedReader(inputStreamReader)) {
				String line;
				int wordCount = 0;
				int characterCount = 0;
				int lineCount = 0;
				int sentenceCount = 0;
  
				while ((line = bufferedReader.readLine()) != null) {
				    if (line.equals("")) {
				        lineCount += 1;
				    }
				    else {
				        characterCount += line.length();
				        String words[] = line.split("\\s+");
				        wordCount += words.length;

				    }
				}

				System.out.println("Total word count = "+ wordCount);
				System.out.println("Total number of characters = "+ characterCount);
				
			} catch (FileNotFoundException e) {
				throw e;
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

	}
}
