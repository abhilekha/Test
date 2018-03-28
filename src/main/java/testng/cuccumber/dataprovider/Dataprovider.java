package testng.cuccumber.dataprovider;

import java.io.File;

public class Dataprovider {

	
	static File file;
	 int totalNumberOfColumns;
	 static String data[][];
	 
	 
	public Dataprovider(File file) {
		// TODO Auto-generated constructor stub
		Dataprovider.file = file;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String xlFilePath = "/KRISHNA VOLUME/Jar Files/poi-3.16-beta1/TestData.xlsx";
	    String sheetName = "Credentials";
	   // ExcelApiTest eat = null;   
	    
	    Dataprovider ed = new Dataprovider(new File("InputData.xlsx"));
	   
	    
	    
	}
	
	


}
