package abner.lin.leet_code;

import abner.lin.leet_code.longest_substring_without_repeating_characters.Solution;
import junit.framework.TestCase;

public class LongestSubStringWithoutRepeatingCharaters extends TestCase {
	public void testA() {
		String input = "abcabcbb";
		Solution solution = new Solution();

		int length = solution.lengthOfLongestSubstring(input);
		assertEquals(3, length);
	}

	public void testB() {
		String input = "bbbbb";
		Solution solution = new Solution();

		int length = solution.lengthOfLongestSubstring(input);
		assertEquals(1, length);
	}

	public void testC() {
		String input = "pwwkew";
		Solution solution = new Solution();

		int length = solution.lengthOfLongestSubstring(input);
		assertEquals(3, length);
	}
}
