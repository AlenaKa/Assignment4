//We rewrote serial numbers to make them unique to each item as follow:
// books start from 1; ebooks starts from 2; MP3 starts from 3; CDs starts from 4

public class HWK4_karskim {
	
	public static void main(String args[]) { 
		Readable x = new Readable();
		x.getInfo("Books.txt", 2);
		x.getListInfo("Books.txt");
	}
}
