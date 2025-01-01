
public class book {
	private String title;
	private int pages;
	
	public book() {
		
	}
	public book(String t, int p) {
	 title = t;
	pages = p;
	}
	public String getTitle() {
		return title;
	}
	public int getPages() {
		return pages;
	}
	public String toString() {
		return "title: " + title + " pages: "+ pages;
	}
}
