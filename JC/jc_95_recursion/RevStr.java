package jc_95_recursion;

public class RevStr {
	public static String reverse(String src) {
		char[] revStr = new char[src.length()];
		for (int i = src.length() - 1; i >= 0; i--) {
			revStr[src.length() - 1 - i] = src.charAt(i);
			
		}
		return new String(revStr);
	}
}
