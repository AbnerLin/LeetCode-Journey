package abner.lin.leet_code.median_of_two_sorted_arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution {

	public static Solution getInstance() {
		return new Solution();
	}

	public double findMedianSortedArrays(int[] nums1, int[] nums2) {
		List<Integer> list = new ArrayList<Integer>();

		for (int i = 0; i < nums1.length; i++) {
			list.add(nums1[i]);
		}

		for (int i = 0; i < nums2.length; i++) {
			list.add(nums2[i]);
		}

		Collections.sort(list);

		if (list.size() % 2 == 1) {
			return list.get(list.size() / 2);
		} else {
			int left = list.get(list.size() / 2 - 1);
			int right = list.get(list.size() / 2);
			return (double) (left + right) / 2;
		}
	}
}