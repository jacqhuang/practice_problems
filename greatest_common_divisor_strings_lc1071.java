class Solution {
	public String gcdOfStrings(String str1, String str2) {
		if(!(str1+str2).equals(str2+str1)) {
			return "";
		}
		int strLength = gcd(str1.length(),str2.length());
		return str1.substring(0,strLength);
	}

	private int gcd(int a, int b) {
		return b == 0 ? a : gcd(b, a%b);
	}
}

/*
Time complexity: O(n)
Space Complexity: O(n)

	We check if there is a commutative property between str1 and str2,
	if the two strings are commutative, there is a common divisor.

	We can return the greatest common divisor by using
	the substring from 0 to the length of the common divisor.
*/