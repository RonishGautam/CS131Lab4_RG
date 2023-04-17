import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class FileProcessor {

	private String fileName;
	private int stringLength;
	public ArrayList<String> stringList;
	public ArrayList<String> getStringList() {
		return stringList;
	}

	public void setStringList(ArrayList<String> stringList) {
		this.stringList = stringList;
	}

	private Scanner input;
	
	public FileProcessor(String fileName, int stringLength) {
		this.fileName=fileName;
		this.stringLength=stringLength;
		stringList=new ArrayList<>();
		
	}//end empty-argument constructor
	
	//end getArrayListSize
	
	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public int getStringLength() {
		return stringLength;
	}

	public void setStringLength(int stringLength) {
		if (stringLength < 5) {
			this.stringLength=5;
		}else {
			
		}
		this.stringLength = stringLength;
	}
	public int getArrayListSize() {
		return stringList.size();
	}

	public void processFile() {
        try {
            StringTooLongException LongException = new StringTooLongException();
            Scanner sc = new Scanner(new File(fileName));
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                
                
                if (line.length() > stringLength) {
                	throw LongException;
                }
                stringList.add(line);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found: "+ e);
            
            
        } catch (StringTooLongException e) {
            System.out.println(e);
        }

		
		
	}//end processFile
}//end class