public class Palindrome {

	private static boolean palindromeCheck(String s) {
		StringBuilder sb = new StringBuilder(s);
		sb = sb.reverse();
		if(sb.toString().equals(s))return true;
		return false;
	}
	private static boolean palindromeCheck2(String s) {
		int start = 0;
		int end = s.length()-1;
		while(start<end) {
			if(s.charAt(start)!=s.charAt(end))return false;
			start++;
			end--;
		}
		return true;
	}
	public static void main(String[] args) {
		String s = "aabcbaa";
		System.out.println(palindromeCheck(s));
		System.out.println(palindromeCheck2(s));
	}

}
