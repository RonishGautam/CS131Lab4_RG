
public class BadFileName {

	public static void main(String[] args){
	    
	    FileProcessor fp = new FileProcessor("GoodString.txt",10);
			fp.processFile();
	        System.out.println("Number of strings in Good String is: " + fp.getArrayListSize());
	        System.out.println("Inside of GoodString:");
	        for (String str : fp.stringList) {
	            System.out.println(str);
	        }
	    }
		  }//end main
	  
	//end class

