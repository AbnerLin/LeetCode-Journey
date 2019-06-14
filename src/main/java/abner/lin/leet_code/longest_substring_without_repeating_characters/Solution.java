package abner.lin.leet_code.longest_substring_without_repeating_characters;

public class Solution {

	public Solution getInstance() {
		return new Solution();
	}

	public int lengthOfLongestSubstring(String target) {
		int length = 0;

		for (int index = 0; index < target.length(); index++) {
			String head = target.substring(index, index + 1);

			String subString = head;
			for (int seq = index + 1; seq < target.length(); seq++) {
				String followingWord = target.substring(seq, seq + 1);

				if (!subString.contains(followingWord)) {
					subString += followingWord;
				} else {
					break;
				}
			}

			if (subString.length() > length) {
				length = subString.length();
			}
		}

		return length;
	}
}