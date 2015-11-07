import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class Audio extends Item {
	protected String artistName;
	public String getInfo(String filename, int serial) {
		java.lang.String[] ar = {};
		try {
			BufferedReader in = new BufferedReader(new FileReader(filename));
	        java.lang.String str;
	        while ((str = in.readLine()) != null){
	        	ar = str.split(",");
	        	if (Integer.parseInt(ar[0]) == serial) {
	        		
	        		super.sNo = Integer.parseInt(ar[0]);
	        		super.title = ar[1];
	        		artistName = ar[2];
	        		super.price = Integer.parseInt(ar[3]);
	        		super.quantity = Integer.parseInt(ar[4]);
	        		super.itemtype = ar[5];
	            	
	        		//System.out.println(str);
	            	
	            	//System.out.println(authorName);
	            	break;
	        	}
	        }
	        in.close();
	    } 
		catch (IOException e) {
	        System.out.println("File Read Error");
	    } 
		//System.out.println(ar[1]);
		return ar.toString();
	} //Returns sNo, Name, Author name, etc. in a string
	
	@Override
	public double getPrice(String serial, String filename) { // override to get the item price and add 2% environment tax
	// check how info is going to be provided
		double priceWithTax = 0;
		try {
			java.lang.String[] ar = {};
            BufferedReader in = new BufferedReader(new FileReader(filename));
            java.lang.String str;
            while((str = in.readLine()) != null){
            	ar = str.split(",");
            	if(ar[0].equals(serial)){
            		priceWithTax = 0.00;
            	}
            }
            in.close();
	    } 
		catch (IOException e) {
            System.out.println("File Read Error");
        } 
		return priceWithTax;	
	}
	
	
	public void getListInfo(String filename){ 		//changed the return type from int to string and ask prof
		java.lang.String[] ar = {};
		try {
	        BufferedReader in = new BufferedReader(new FileReader(filename));
	        java.lang.String str;
	        while((str = in.readLine()) != null){
	        	ar = str.split(",");
	        	System.out.print(String.format("%-10s", ar[0])+String.format("%-40s", ar[1])+String.format("%-24s",ar[2])+String.format("%-10s", ar[3])+String.format("%-10s",  ar[4])+String.format("%-16s",  ar[5]));
    	        System.out.println();
	        }
	        in.close();
	    } 
		catch (IOException e) {
	        System.out.println("File Read Error");
	    } 
	}

		
	public void printListInfo() {
		System.out.println(String.format("%-10s", "S.No")+	String.format("%-40s", "Name")+String.format("%-24s", "Artist")+String.format("%-10s", "Price($)")+String.format("%-10s", "Quantity")+String.format("%-16s", "Type"));
		getListInfo("CDs.txt");
		getListInfo("MP3.txt");
	}
		//this is a comment
}