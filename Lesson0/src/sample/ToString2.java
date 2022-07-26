package sample;

public class ToString2 {
	public String Make(boolean val) {
		if (val) return "true";
		return "false";
	}
	
	public String Make(int i) {
		return i+"";
	}
	
	public String Make(double d) {
		return d+"";
	}
}
