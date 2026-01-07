import java.util.StringTokenizer;

public class C {
	void C() {
		String s = "a,b,c,d,e,f";
		StringTokenizer st = new StringTokenizer(s,",");
		while ( st.hasMoreElements()) {
			String t = st.nextToken();
			System.out.println(t);
		}
		
	}
	
	static public void main (String[] args) {
		new C().C();
	}
}
