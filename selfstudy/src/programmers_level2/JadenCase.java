// the toFour app -> The Tofour App ¹Ù²Ù±â
package programmers_level2;

public class JadenCase {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		String s = "3people unFollowed me";
		String result = "";
		
		String[] str = s.split("\\s+");
		String[] space = s.split("[a-zA-Z0-9]");
		
		System.out.println(space.length);
	}

}
