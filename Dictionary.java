
public class Dictionary extends book {
	private int definitions;
	public Dictionary() {
		super();
	}
	
	public Dictionary(String t, int p, int d) {
		super(t, p);
		definitions = d;
	}
	public double GetDef() {
		return definitions;
	}
	public double definitionPerPage() {
		return GetDef()/super.getPages();
		
	}
	
	public String toString() {
		return super.toString() + " average definitions: "+ GetDef();
	}
}
