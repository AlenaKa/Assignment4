
public abstract class Item{
		
		//public abstract int getPrice(...);
		
		protected int sNo;
		protected String artist;
		protected int price;
		protected int quantity;
		protected String itemtype;
		
		public abstract String getInfo(String filename, int lineNumber);
		
}
	