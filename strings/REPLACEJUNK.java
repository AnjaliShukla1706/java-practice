package strings;

public class REPLACEJUNK {

	public static void main(String[] args) {
		String s="we@##%^&*lc)(*&^%ome";
		s=s.replaceAll("[^a-z0-9A-Z]","");
		System.out.println(s);

	}

}
//s.replaceAll("^[a-z A-Z 0-9]","")