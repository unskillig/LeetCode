package strStr;

public class Solution {

	public static void main(String[] args) {

		System.out.println(strStr("hello", "ll"));
	}

	public static int strStr(String haystack, String needle) {

		int j = -1;
		int k = 0;
		// hello ll
		// aa aa
		// mississippi a
		// a a

		if (needle.length() == 0)
			return 0;
		if (haystack.length() == 0)
			return -1;

		for (int i = 0; i < haystack.length(); i++) {

			if (haystack.charAt(i) == needle.charAt(k)) {
				if (j == -1)
					j = i;
				k++;
				if (k == needle.length())
					return j;

				continue;
			}

			if (j != -1) {
				i = j;
				k = 0;
			}
			j = -1;
		}

		return -1;
	}

}
