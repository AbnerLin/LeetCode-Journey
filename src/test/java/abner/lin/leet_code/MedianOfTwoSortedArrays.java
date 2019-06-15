package abner.lin.leet_code;

import abner.lin.leet_code.median_of_two_sorted_arrays.Solution;
import junit.framework.TestCase;

public class MedianOfTwoSortedArrays extends TestCase {
	public void testA() {
		Solution solution = Solution.getInstance();

		int[] nums1 = new int[] { 1, 3 };
		int[] nums2 = new int[] { 2 };

		double median = solution.findMedianSortedArrays(nums1, nums2);

		assertEquals(2.0, median);
	}

	public void testB() {
		Solution solution = Solution.getInstance();

		int[] nums1 = new int[] { 1, 2 };
		int[] nums2 = new int[] { 3, 4 };

		double median = solution.findMedianSortedArrays(nums1, nums2);

		assertEquals(2.5, median);

	}
}
