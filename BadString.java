
public class BadString{
  
  public static void main(String[] args){
    	
    	FileProcessor fp = new FileProcessor("BadString.txt",10);
		  fp.processFile();
		  System.out.println("Number of strings in Bad String is: " + fp.getArrayListSize());
	        System.out.println("Inside of BadString:");
	        for (String str : fp.stringList) {
	            System.out.println(str);
	        }
    
  }//end main
  
}//end class
